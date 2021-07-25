package com.mx.skeleton.controller;

import com.mx.skeleton.model.User;
import com.mx.skeleton.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: skeleton-java
 * @Package: com.mx.skeleton.controller
 * @ClassName:
 * @Author:
 * @Description:
 * @Date:
 */
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
    public ResponseEntity<?> save(@RequestBody User user){
        log.info("Persisting the User entity");
        Map<String, Object> params = new HashMap<>();
        try {
            iUserService.save(user);
        } catch (DataAccessException e){
            params.put("message", "Se produjo un error al consultar en la base de datos.");
            params.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(params, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        log.info("Getting list users");
        List<User> users;
        Map<String, Object> params = new HashMap<>();
        try {
            users = iUserService.getAll();
        } catch (DataAccessException e){
            params.put("message", "Se produjo un error al consultar en la base de datos.");
            params.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(params, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(users,HttpStatus.OK);
    }


}
