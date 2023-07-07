package ua.chi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.chi.entity.Contact;
import ua.chi.repository.ContactRepository;
import ua.chi.service.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact addContact(Contact contact) {

        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {

        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Long contactId) {
        contactRepository.deleteById(contactId);
    }

    @Override
    public Contact getContactById(Long contactId) {
        return contactRepository.findById(contactId)
                .orElseThrow(() -> new IllegalArgumentException("Contact not found"));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
