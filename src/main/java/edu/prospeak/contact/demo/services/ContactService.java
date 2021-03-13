package edu.prospeak.contact.demo.services;

import edu.prospeak.contact.demo.models.Contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ContactService {
    Instance;
    List<Contacts> contacts = new ArrayList<>();
    ContactService() {
        Contacts c1 = new Contacts(1, "Youness", "younnes@m.fr", "0999933993");
        Contacts c2= new Contacts(2, "Elhaj", "Elhaj@m.fr", "0924233993");
        Contacts c3 = new Contacts(3, "John", "Doe@m.fr", "02342933993");
        Contacts c4 = new Contacts(4, "Mark", "d@m.fr", "9594993994");

        contacts.addAll(Arrays.asList(new Contacts[]{c1, c2, c3, c4}));
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

}
