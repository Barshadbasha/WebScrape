package com.AI_project.WebScrape.model;

import java.util.List;

public class WebsiteData {
    private String title;
    private String metaDesc;
    private List<String> headings;
    private int LinkCount;
    private List<String> links;
    private List<String> images;
    private List<String> paragraphs;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaDesc() {
        return metaDesc;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    public List<String> getHeadings() {
        return headings;
    }

    public void setHeadings(List<String> headings) {
        this.headings = headings;
    }

    public int getLinkCount() {
        return LinkCount;
    }

    public void setLinkCount(int linkCount) {
        LinkCount = linkCount;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }
}
