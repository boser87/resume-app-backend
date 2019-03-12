package com.stefanoc.resumeapp.resumeappbackend;

import java.util.List;

public class Details {
    private List<Skill> skills;

    private Basics basics;

    private List<Education> education;

    private List<Language> languages;

    private List<Reference> references;

    private List<Work> work;

    private List<Award> awards;

    private List<Interest> interests;

    private List<Publication> publications;

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Basics getBasics() {
        return basics;
    }

    public void setBasics(Basics basics) {
        this.basics = basics;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public List<Work> getWork() {
        return work;
    }

    public void setWork(List<Work> work) {
        this.work = work;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "ClassPojo [skills = " + skills + ", basics = " + basics + ", education = " + education + ", languages = " + languages + ", references = " + references + ", work = " + work + ", awards = " + awards + ", interests = " + interests + ", publications = " + publications + "]";
    }
}
