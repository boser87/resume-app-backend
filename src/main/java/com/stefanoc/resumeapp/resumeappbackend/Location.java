package com.stefanoc.resumeapp.resumeappbackend;

public class Location {
    private String address;

    private String city;

    private String countryCode;

    private String postalCode;

    private String region;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "ClassPojo [address = " + address + ", city = " + city + ", countryCode = " + countryCode + ", postalCode = " + postalCode + ", region = " + region + "]";
    }
}

