package com.stefanoc.resumeapp.resumeappbackend;

public class Work {
    private String summary;

    private String website;

    private String[] highlights;

    private String endDate;

    private String company;

    private String position;

    private String startDate;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String[] getHighlights() {
        return highlights;
    }

    public void setHighlights(String[] highlights) {
        this.highlights = highlights;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "ClassPojo [summary = " + summary + ", website = " + website + ", highlights = " + highlights + ", endDate = " + endDate + ", company = " + company + ", position = " + position + ", startDate = " + startDate + "]";
    }
}
