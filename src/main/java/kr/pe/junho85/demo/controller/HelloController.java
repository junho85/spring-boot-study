package kr.pe.junho85.demo.controller;

import kr.pe.junho85.demo.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @PostMapping("/hello")
    public Person test(@RequestBody Person person) {
        return person;
    }
}
