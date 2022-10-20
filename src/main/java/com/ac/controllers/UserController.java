package com.ac.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController    {
    
    @PostMapping("/users/v1/")
    public String create(Object o) {
        return "Creating user...";             
    }
    
    @GetMapping("/users/v1/")
    @ResponseBody
    public String read(Object o) {
        return "Sharing user...";             
    }
    
    @PutMapping("/users/v1/")
    @ResponseBody
    public String edit(Object o) {
        return "Updating...";             
    }
    
    @DelMapping("/users/v1/")
    @ResponseBody
    public String delete(Object o) {
        return "Deleting user...";             
    }
    
    
    //localhost:8080/pong/Everson
}
