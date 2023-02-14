package edu.easysoft.swpersonservice.controller;

import edu.easysoft.swpersonservice.response.Person;
import edu.easysoft.swpersonservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/getById/{id}")
    public Person getById(@PathVariable long id){
        return personService.getPersonById(id);
    }

}
