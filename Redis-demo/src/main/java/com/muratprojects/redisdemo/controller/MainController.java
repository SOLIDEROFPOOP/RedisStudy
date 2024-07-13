package com.muratprojects.redisdemo.controller;

import com.muratprojects.redisdemo.entity.User;
import com.muratprojects.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<User> save(@RequestParam Integer id){
        User user = userService.getById(id);
        if (user == null){
            return new ResponseEntity<>(HttpStatus.valueOf(400));
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
