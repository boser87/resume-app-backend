package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "interests")
public class Interest {
    private List<String> keywords;

    private String name;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [keywords = " + keywords + ", name = " + name + "]";
    }
}
