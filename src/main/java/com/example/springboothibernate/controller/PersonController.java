package com.example.springboothibernate.controller;



import com.example.springboothibernate.dao.PersonDao;
import com.example.springboothibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spring-orm")
public class PersonController {
    @Autowired
    private PersonDao personDao;

    @PostMapping("/savePerson")
    public String save(@RequestBody Person person){
       personDao.SavePerson(person);
       return "success";

    }

    @GetMapping("/getAll")
    public List<Person> getAllPerson(){
    return personDao.getPersons();
    }

}
