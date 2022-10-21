package com.ac.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController    {
    
    @PostMapping("/v1")
    //@RequestMapping(value = /users/v1, method = RequestMethod.POST) 
    public String create(Object o) {
        return "Creating user...";             
    }
    
    @GetMapping("/v2")
    //@RequestMapping(value = /users/v1, method = RequestMethod.GET)
    public String read(Object o) {
        return "Sharing user...";             
    }
    
    @PutMapping("/v3")
    //@RequestMapping(value = /users/v1, method = RequestMethod.PUT)
    public String edit(Object o) {
        return "Updating...";             
    }
    
    @DelMapping("/v4")
    //@RequestMapping(value = /users/v1, method = RequestMethod.DELETE)
    public String delete(Object o) {
        return "Deleting user...";             
    }
    
    
    //localhost:8080/pong/Everson
}
