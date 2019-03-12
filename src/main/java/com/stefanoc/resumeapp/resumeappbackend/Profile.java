package com.stefanoc.resumeapp.resumeappbackend;

public class Profile {
    private String url;

    private String network;

    private String username;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ClassPojo [url = " + url + ", network = " + network + ", username = " + username + "]";
    }
}

