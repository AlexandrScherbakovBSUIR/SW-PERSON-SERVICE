package edu.easysoft.swpersonservice.service;

import edu.easysoft.swpersonservice.response.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person getPersonById(long id) {
        String url = String.format("https://swapi.dev/api/people/1",id);
        System.out.println(String.format("https://swapi.dev/api/people/1",id));
        System.out.println(String.format("https://swapi.dev/api/people/",id,id));
        System.out.println(String.format("https://swapi.dev/api/people/",id,"asdas"));
        System.out.println(String.format("https://swapi.dev/api/people/",id,""));
        Person personResponse = makeRequest(url, Person.class);
        return personResponse;
    }

    private <T> T makeRequest(String url,Class<T> c1){
        return WebClient.create()
                .get()
                .uri(url)
                .headers(httpHeaders ->{
                    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                }).retrieve()
                .bodyToMono(c1)
                .block();

    }
}
