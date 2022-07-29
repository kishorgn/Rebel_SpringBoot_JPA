package com.rebel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebel.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
