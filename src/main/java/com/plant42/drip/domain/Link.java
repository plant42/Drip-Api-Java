package com.plant42.drip.domain;

public class Link {

    private String key;
    private String url;


    public Link() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Link{" +
                "key='" + key + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
