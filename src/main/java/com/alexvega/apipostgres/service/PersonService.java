package com.alexvega.apipostgres.service;

import com.alexvega.apipostgres.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person save(Person person);

    Person findById(Long id);

    void delete(Person person);
}
