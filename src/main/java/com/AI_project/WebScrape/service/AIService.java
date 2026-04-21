package com.AI_project.WebScrape.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@Service
public class AIService {

    public String analyze(Object data) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8000/analyze";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request = new HttpEntity<>(data, headers);

        return restTemplate.postForObject(url, request, String.class);
    }
}