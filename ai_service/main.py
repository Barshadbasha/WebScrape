from fastapi import FastAPI
import pandas as pd
from openai import OpenAI
from dotenv import load_dotenv
import os
import json

app = FastAPI()


load_dotenv(dotenv_path=".env")

api_key = os.getenv("OPENAI_API_KEY")

if not api_key:
    raise ValueError("API key not found")
client = OpenAI(api_key=api_key)
 gudjbhjfh [1, 2, 3, ]

@app.post("/analyze")
def analyze(data: dict):
    try:
        links = data.get("links", [])
        images = data.get("images", [])
        headings = data.get("headings", [])
        paragraphs = data.get("paragraphs", [])

        
        df = pd.DataFrame({
            "links": pd.Series(links),
            "images": pd.Series(images),
            "headings": pd.Series(headings)
        })

        total_links = df["links"].count()
        total_images = df["images"].count()
        total_headings = df["headings"].count()

        content_length = sum(len(p) for p in paragraphs)
        text_data = " ".join(paragraphs)

        
        prompt = f"""
        Analyze this website SEO and return ONLY valid JSON:

        {{
          "seo_score": number,
          "issues": [],
          "suggestions": []
        }}

        Data:
        Headings: {total_headings}
        Images: {total_images}
        Links: {total_links}
        Content Length: {content_length}

        Content:
        {text_data[:1000]}
        """

        
        response = client.chat.completions.create(
            model="gpt-4.1-mini",
            messages=[
                {"role": "system", "content": "You are an SEO expert."},
                {"role": "user", "content": prompt}
            ]
        )

        ai_output = response.choices[0].message.content


        try:
            ai_json = json.loads(ai_output)
        except:
            ai_json = {
                "seo_score": 0,
                "issues": ["AI response parsing failed"],
                "suggestions": ["Try again"]
            }

        return {
            "total_links": total_links,
            "total_images": total_images,
            "total_headings": total_headings,
            "content_length": content_length,
            "ai_analysis": ai_json
        }

    except Exception as e:
        return {
            "error": str(e),
            "ai_analysis": {
                "seo_score": 50,
                "issues": ["Fallback used due to error"],
                "suggestions": ["Check API key / quota / server"]
            }
        }