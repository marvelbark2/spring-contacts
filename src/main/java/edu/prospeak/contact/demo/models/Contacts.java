package edu.prospeak.contact.demo.models;

import java.io.Serializable;

public class Contacts implements Serializable {

    private int id;
    private String name;
    private String email;
    private String telephone;

    public Contacts(int id, String name, String email, String telephone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
