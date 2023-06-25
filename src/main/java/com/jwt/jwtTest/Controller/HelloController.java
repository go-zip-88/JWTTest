package com.jwt.jwtTest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class HelloController {

    @RequestMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello!");
    }
}
