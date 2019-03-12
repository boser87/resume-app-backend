package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "resumes")
public class Resume {
    private String date;

    private String createdFor;

    private String name;

    private String description;

    private Details details;

    @Id
    private String id;

    private String label;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreatedFor() {
        return createdFor;
    }

    public void setCreatedFor(String createdFor) {
        this.createdFor = createdFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "ClassPojo [date = " + date + ", createdFor = " + createdFor + ", name = " + name + ", description = " + description + ", details = " + details + ", id = " + id + ", label = " + label + "]";
    }
}
