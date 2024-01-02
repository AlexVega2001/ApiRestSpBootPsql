package com.alexvega.apipostgres.service;

import com.alexvega.apipostgres.entity.Person;
import com.alexvega.apipostgres.repository.PersonDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    @Transactional
    public Person save(Person person) {
        return personDao.save(person);
    }

    @Override
    @Transactional
    public Person findById(Long id) {
        return personDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }
}
