package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "awards")
public class Award {
    private String date;

    private String summary;

    private String awarder;

    private String title;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAwarder() {
        return awarder;
    }

    public void setAwarder(String awarder) {
        this.awarder = awarder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ClassPojo [date = " + date + ", summary = " + summary + ", awarder = " + awarder + ", title = " + title + "]";
    }
}
