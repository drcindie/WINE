package com.cindiemarren.wine_app;

public class OtherListActivity {

    private String wine;
    private String description;

    public OtherListActivity(String wine, String description) {
        this.wine = wine;
        this.description = description;
    }

    public String getWine() {
        return wine;
    }

    public String getDescription() {
        return description;
    }
}