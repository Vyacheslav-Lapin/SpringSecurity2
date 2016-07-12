package edu.teldir.domain.service.impl;

import edu.teldir.domain.dao.ContactDao;
import edu.teldir.domain.entity.Contact;
import edu.teldir.domain.service.ContactService;
import edu.teldir.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao personDao;

    @Autowired
    private SecurityService securityService;


    @Transactional
    @Override
    public Collection<Contact> getAllContacts() {
        return personDao.getAllContacts();
    }

    @Transactional
    @Override
    public Contact getContact(long id) {
        return personDao.getContact(id);
    }

    @Transactional
    @Override
    public void create(Contact contact) {
        personDao.save(contact);
        securityService.initDefaultACL(contact);
    }

    @Transactional
    @Override
    public void save(Contact contact) {
        personDao.save(contact);
    }

    @Transactional
    @Override
    public void remove(Contact contact) {
        securityService.removeACL(contact);
        personDao.remove(contact);
    }
}
