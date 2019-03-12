package com.stefanoc.resumeapp.resumeappbackend;

import java.util.List;

public class Education {
    private String area;

    private String institution;

    private List<String> courses;

    private String endDate;

    private String studyType;

    private String gpa;

    private String startDate;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "ClassPojo [area = " + area + ", institution = " + institution + ", courses = " + courses + ", endDate = " + endDate + ", studyType = " + studyType + ", gpa = " + gpa + ", startDate = " + startDate + "]";
    }
}

