package ua.chi.service;

import ua.chi.entity.Contact;

import java.util.List;

public interface ContactService {
    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    void deleteContact(Long contactId);
    Contact getContactById(Long contactId);
    List<Contact> getAllContacts();
}
