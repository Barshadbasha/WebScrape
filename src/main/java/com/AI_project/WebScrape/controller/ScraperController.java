package com.AI_project.WebScrape.controller;
import com.AI_project.WebScrape.service.ExcelService;
import com.AI_project.WebScrape.model.WebsiteData;
import com.AI_project.WebScrape.service.ScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.AI_project.WebScrape.service.AIService;


@RestController
@RequestMapping("/api")
public class ScraperController {

    @Autowired
    private ScraperService service;
    @Autowired
    private ExcelService excelService;
    @Autowired
    private AIService aiService;


    @GetMapping("/analyze")
    public WebsiteData analyze(@RequestParam String url) {
        return service.scrape(url);
    }
    @GetMapping("/full")
    public String full(@RequestParam String url) {

        WebsiteData data = service.scrape(url);

        excelService.generate(data);

        return "Report generated successfully!";
    }
    @GetMapping("/ai")
    public String analyzeWithAi(@RequestParam String url) {

        WebsiteData data = service.scrape(url);

        return aiService.analyze(data);
    }
}