package ua.chi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.chi.entity.Contact;
import ua.chi.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        Contact addedContact = contactService.addContact(contact);
        return ResponseEntity.ok(addedContact);
    }

    @PutMapping("/{contactId}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long contactId, @RequestBody Contact contact) {

        contact.setId(contactId);
        Contact updatedContact = contactService.updateContact(contact);
        return ResponseEntity.ok(updatedContact);
    }

    @DeleteMapping("/{contactId}")
    public ResponseEntity<String> deleteContact(@PathVariable Long contactId) {

        contactService.deleteContact(contactId);
        return ResponseEntity.ok("Contact deleted successfully");
    }

    @GetMapping("/{contactId}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long contactId) {

        Contact contact = contactService.getContactById(contactId);
        return ResponseEntity.ok(contact);
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

}
