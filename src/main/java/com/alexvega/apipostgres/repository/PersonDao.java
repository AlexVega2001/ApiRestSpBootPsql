package com.alexvega.apipostgres.repository;

import com.alexvega.apipostgres.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {
}
