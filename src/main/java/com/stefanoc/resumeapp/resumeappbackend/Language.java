package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {
    private String fluency;

    private String language;

    public String getFluency() {
        return fluency;
    }

    public void setFluency(String fluency) {
        this.fluency = fluency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ClassPojo [fluency = " + fluency + ", language = " + language + "]";
    }
}

