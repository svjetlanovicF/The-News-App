package com.example.thenewsapp;

public class ModelClassNews {

    private String title;
    private String description;
    private String published_at;
    private String url;
    private String image_url;

    public ModelClassNews(String title, String description, String published_at, String url, String image_url) {
        this.title = title;
        this.description = description;
        this.published_at = published_at;
        this.url = url;
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

}
