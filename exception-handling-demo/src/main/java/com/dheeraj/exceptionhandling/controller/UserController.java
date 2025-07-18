package com.dheeraj.exceptionhandling.controller;

import com.dheeraj.exceptionhandling.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with ID " + id + " not found");
        }
        return "User Found: Dheeraj Patel";
    }
}
