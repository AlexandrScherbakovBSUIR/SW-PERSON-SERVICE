package edu.easysoft.swpersonservice.service;

import edu.easysoft.swpersonservice.response.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    Person getPersonById(long id);



}
