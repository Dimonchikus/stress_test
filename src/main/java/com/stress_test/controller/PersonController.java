package com.stress_test.controller;

import com.stress_test.entity.Person;
import com.stress_test.service.PersonService;
import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @SneakyThrows
    @PostMapping
    public Person createItem(@RequestBody Person item) {
        var person = personService.saveItem(item);
        log.info("Person created: {}", person);
        return person;
    }
}
