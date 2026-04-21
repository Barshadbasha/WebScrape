package com.AI_project.WebScrape.service;

import com.AI_project.WebScrape.model.WebsiteData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScraperService {

    public WebsiteData scrape(String url) {

        WebsiteData data = new WebsiteData();

        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla")
                    .get();

            // Title
            data.setTitle(doc.title());

            // Meta
            String meta = doc.select("meta[name=description]").attr("content");
            data.setMetaDesc(meta);

            // Headings
            List<String> headings = new ArrayList<>();
            doc.select("h1, h2, h3").forEach(h -> headings.add(h.text()));
            data.setHeadings(headings);

            // Links
            List<String> links = new ArrayList<>();
            doc.select("a[href]").forEach(a -> links.add(a.absUrl("href")));
            data.setLinks(links);

            // Images
            List<String> images = new ArrayList<>();
            doc.select("img[src]").forEach(img -> images.add(img.absUrl("src")));
            data.setImages(images);

            // Paragraphs
            List<String> paragraphs = new ArrayList<>();
            doc.select("p").forEach(p -> paragraphs.add(p.text()));
            data.setParagraphs(paragraphs);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}
//////////////////////////////////////////////////////////////
