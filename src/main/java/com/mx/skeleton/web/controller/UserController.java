package com.mx.skeleton.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloUser(){
        log.info("Called since helloUser");
        try {
            return new ResponseEntity<>(new String("Hello from skeleton 🔥"), (HttpStatus.OK));
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
