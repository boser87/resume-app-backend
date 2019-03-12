package com.stefanoc.resumeapp.resumeappbackend;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "references")
public class Reference {
    private String reference;

    private String name;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [reference = " + reference + ", name = " + name + "]";
    }
}

