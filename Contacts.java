package com.example.goodones;

public class Contacts {
    private String email;
    private String name;

    public Contacts(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Delete this comment
    @Override
    public String toString() {
        return "Contacts{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
