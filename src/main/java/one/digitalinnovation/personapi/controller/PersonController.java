package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.MessagResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personservice;
    @Autowired
    public PersonController(PersonService personservice) {
        this.personservice = personservice;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessagResponseDTO createPerson(@RequestBody Person person){
        return personservice.createPerson(person);
    }
}
