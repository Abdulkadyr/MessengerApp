package com.example.messengerapp.models;

public class User {
    private String id;
    private String email;
    private String userName;
    private String imageUrl;

    public User(String id, String email, String userName, String imageUrl) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.imageUrl = imageUrl;
    }

    public User() {}

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
