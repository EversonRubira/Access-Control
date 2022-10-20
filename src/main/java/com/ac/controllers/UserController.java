package com.ac.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController    {
    
    

    @PostMapping("/USERS_V1/")
    public String create(Object o) {
        return "Creating user...";             
    }
   
      @RequestMapping("/USERS_V2/")
    public String read(Object o) {
        return "Sharing user...";             
    }
    
     @PutMapping("/users/v3/")
    public String edit(Object o) {
        return "Updating...";             
    }
    
    @DeleteMapping("/users/v4/")
    public String delete(Object o) {
        return "Deleting user...";             
    }

        

    //localhost:8080/pong/Everson
}
