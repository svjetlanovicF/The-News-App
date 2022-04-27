package com.example.thenewsapp;

import java.util.ArrayList;

public class TheNews {

    private ArrayList<ModelClassNews> data;

    public TheNews(ArrayList<ModelClassNews> data) {
        this.data = data;
    }

    public ArrayList<ModelClassNews> getData() {
        return data;
    }

    public void setData(ArrayList<ModelClassNews> data) {
        this.data = data;
    }
}
