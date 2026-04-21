# 🕷️ WebScrape - AI-Powered Web Scraper

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-red?style=flat-square&logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)

A **Spring Boot** application that scrapes website data and processes it using AI, with support for Excel export.

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
│       │   │   ├── AIService.java                # AI processing logic
│       │   │   ├── ExcelService.java             # Excel export logic
│       │   │   └── ScraperService.java           # Web scraping logic
│       │   └── WebScrapeApplication.java         # Main entry point
│       └── resources/
│           ├── static/                           # Static assets (CSS, JS)
│           ├── templates/                        # Thymeleaf HTML templates
│           └── application.properties            # App configuration
└── pom.xml

---

## ✨ Features

- 🌐 **Web Scraping** — Scrapes content from any website using `ScraperService`
- 🤖 **AI Integration** — Processes scraped data intelligently via `AIService`
- 📊 **Excel Export** — Exports results to `.xlsx` files using `ExcelService`
- 🖥️ **REST API** — Clean endpoints via `ScraperController`
- 📄 **Thymeleaf UI** — Simple frontend for interaction

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.8 or higher
- Git

### Clone the Repository

```bash
git clone https://github.com/Barshadbasha/WebScrape.git
cd WebScrape
```

### Configure the Application

Edit `src/main/resources/application.properties`:

```properties
spring.application.name=WebScrape
server.port=8080

# Set your API keys via environment variables (never hardcode secrets)
# ai.api.key=${AI_API_KEY}
```

### Run the Application

```bash
mvn spring-boot:run
```

The app will start at: `http://localhost:8080`

### Build the Project

```bash
mvn clean install
```

---

## 🛠️ Tech Stack

| Technology      | Purpose                        |
|-----------------|-------------------------------|
| Spring Boot 3.x | Backend framework              |
| Java 17+        | Programming language           |
| Maven           | Dependency management          |
| Thymeleaf       | HTML template engine           |
| Apache POI      | Excel file generation          |
| AI Service      | Intelligent data processing    |

---

## 📡 API Endpoints

| Method | Endpoint     | Description                  |
|--------|-------------|------------------------------|
| GET    | `/`          | Home page                    |
| POST   | `/scrape`    | Scrape a given URL           |
| GET    | `/export`    | Export scraped data to Excel |

---

## ⚙️ Environment Variables

```bash
# Windows
set AI_API_KEY=your_api_key_here

# Linux / macOS
export AI_API_KEY=your_api_key_here
```

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