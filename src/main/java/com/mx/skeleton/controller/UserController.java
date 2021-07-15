package com.mx.skeleton.controller;

import com.mx.skeleton.domain.User;
import com.mx.skeleton.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloUser(){
        log.info("Called since helloUser");
        try {
            return new ResponseEntity<>(new String("Hello from skeleton 🔥"), (HttpStatus.OK));
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody User user){
        log.info("Persisting the User entity");
        iUserService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
