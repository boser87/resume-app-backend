package com.stefanoc.resumeapp.resumeappbackend;

import java.util.List;

public class Basics {
    private String summary;

    private String website;

    private String phone;

    private String name;

    private List<Profile> profiles;

    private Location location;

    private String label;

    private String picture;

    private String email;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClassPojo [summary = " + summary + ", website = " + website + ", phone = " + phone + ", name = " + name + ", profiles = " + profiles + ", location = " + location + ", label = " + label + ", picture = " + picture + ", email = " + email + "]";
    }
}
