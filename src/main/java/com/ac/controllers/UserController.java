package com.ac.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/users/v1")
public class UserController    {
    
 
    @PostMapping("/create")
    public String create(Object o) {
        return "Creating user...";             
    }
   
    @GetMapping("/read")
    public String read(Object o)  {
        return "Sharing user...";             
    }
    
    @PutMapping("/edit")
    public String edit(Object o) {
        return "Updating...";             
    }
    
    @DeleteMapping("/delete")
    public String delete(Object o) {
        return "Deleting user...";             
    }

        

    //localhost:8080/
}
