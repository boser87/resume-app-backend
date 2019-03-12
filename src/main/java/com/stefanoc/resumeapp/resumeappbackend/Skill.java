package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "skills")
public class Skill {
    private List<String> keywords;

    private String level;

    private String name;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [keywords = " + keywords + ", level = " + level + ", name = " + name + "]";
    }
}
