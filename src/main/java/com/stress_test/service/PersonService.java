package com.stress_test.service;

import com.stress_test.entity.Person;
import com.stress_test.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person saveItem(Person person) {
        return personRepository.save(person);
    }
}

