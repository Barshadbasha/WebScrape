# 🕷️ WebScrape - AI-Powered Web Scraper

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)
![Python](https://img.shields.io/badge/Python-3.12%2B-blue?style=flat-square&logo=python)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green?style=flat-square&logo=springboot)
![OpenAI](https://img.shields.io/badge/OpenAI-GPT--4.1--mini-412991?style=flat-square&logo=openai)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-red?style=flat-square&logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)

A full-stack **AI-powered web scraping** application combining a **Spring Boot** Java backend with a **Python AI microservice** that uses OpenAI GPT-4.1-mini for intelligent SEO analysis.

---

## 📁 Project Structure
WebScrape/
├── src/
│   └── main/
│       ├── java/com/AI_project/WebScrape/
│       │   ├── controller/
│       │   │   └── ScraperController.java       # REST API endpoints
│       │   ├── model/
│       │   │   └── WebsiteData.java              # Data model / entity
│       │   ├── service/
│       │   │   ├── AIService.java                # Connects to Python AI service
│       │   │   ├── ExcelService.java             # Excel export logic
│       │   │   └── ScraperService.java           # Web scraping logic
│       │   └── WebScrapeApplication.java         # Main entry point
│       └── resources/
│           ├── static/                           # Static assets (CSS, JS)
│           ├── templates/                        # Thymeleaf HTML templates
│           └── application.properties            # App configuration
├── ai_service/
│   ├── main.py                                   # Python AI/SEO analysis service
│   └── requirements.txt                          # Python dependencies
└── pom.xml

---

## ✨ Features

- 🌐 **Web Scraping** — Scrapes content from any website using `ScraperService`
- 🤖 **AI SEO Analysis** — Analyzes scraped data using OpenAI GPT-4.1-mini
- 📊 **Excel Export** — Exports results to `.xlsx` files using `ExcelService`
- 🖥️ **REST API** — Clean endpoints via `ScraperController`
- 📄 **Thymeleaf UI** — Simple frontend for interaction

---

## 🏗️ Architecture
┌─────────────────────┐         ┌──────────────────────┐
│   Spring Boot App   │  HTTP   │  Python AI Service   │
│   (Java - Port 8080)│ ──────► │  (GPT-4.1-mini)      │
│                     │         │  SEO Expert Analysis  │
└─────────────────────┘         └──────────────────────┘
│
▼
┌─────────────────────┐
│   Excel Export      │
│   (.xlsx output)    │
└─────────────────────┘
---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8 or higher
- Python 3.12 or higher
- OpenAI API Key

---

### 1️⃣ Run the Java Spring Boot App

```bash
git clone https://github.com/Barshadbasha/WebScrape.git
cd WebScrape
mvn spring-boot:run
```

App runs at: `http://localhost:8080`

---

### 2️⃣ Run the Python AI Service

```bash
cd ai_service
pip install -r requirements.txt
```

Create a `.env` file in the `ai_service` folder:

```env
OPENAI_API_KEY=your_openai_api_key_here
```

Then run:

```bash
python main.py
```

---

## 🛠️ Tech Stack

| Technology       | Purpose                          |
|------------------|----------------------------------|
| Spring Boot 3.x  | Java backend framework           |
| Java 17+         | Primary programming language     |
| Python 3.12+     | AI microservice language         |
| OpenAI GPT-4.1-mini | SEO analysis AI model         |
| Maven            | Java dependency management       |
| Thymeleaf        | HTML template engine             |
| Apache POI       | Excel file generation            |

---

## 📡 API Endpoints

| Method | Endpoint     | Description                  |
|--------|-------------|------------------------------|
| GET    | `/`          | Home page                    |
| POST   | `/scrape`    | Scrape a given URL           |
| GET    | `/export`    | Export scraped data to Excel |

---

## ⚙️ Environment Variables

Create a `.env` file inside `ai_service/` folder:

```env
OPENAI_API_KEY=your_openai_api_key_here
```

> ⚠️ Never commit your `.env` file. It is already listed in `.gitignore`.

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "Add your feature"`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 👤 Author

**Barshad Basha**  
GitHub: [@Barshadbasha](https://github.com/Barshadbasha)

---

> ⭐ If you found this project useful, consider giving it a star!