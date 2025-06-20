package com.example.project;

import java.util.ArrayList;

public class Teacher {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String subject;


    public Teacher() {}

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Teacher(int id, String name, String email, String gender, String subject) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return name;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }


}
