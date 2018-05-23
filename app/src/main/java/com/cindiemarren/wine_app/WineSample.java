package com.cindiemarren.wine_app;

public class WineSample {
    private int year;
    private String producer;
    private String variety;
    private String province;
    private String region;
    private String designation;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "WineSample{" +
                "year=" + year +
                ", producer='" + producer + '\'' +
                ", variety='" + variety + '\'' +
                ", province='" + province + '\'' +
                ", region='" + region + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

