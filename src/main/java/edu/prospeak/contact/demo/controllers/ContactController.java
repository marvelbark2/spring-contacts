package edu.prospeak.contact.demo.controllers;

import edu.prospeak.contact.demo.models.Contacts;
import edu.prospeak.contact.demo.services.ContactService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600)

public class ContactController {

    @GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Contacts>> getContacts() {
        return ResponseEntity.ok(ContactService.Instance.getContacts());
    }

    @PostMapping("/contact")
    public String createContact(@RequestBody Contacts cs) {
        ContactService.Instance.getContacts().add(cs);
        return "Contact created : " + cs.getEmail();
    }

    @GetMapping("/contact/:contactId")
    public String findById(@PathVariable("contactID") int id) {
        return "Contact ID : " + id;
    }
}
