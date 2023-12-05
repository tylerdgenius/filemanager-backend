package com.metrobuzz.filemanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrobuzz.filemanager.Repository.UserRepo;

@RestController
public class UserController {

    private UserRepo userRepo;

    @GetMapping("/")
    public String getPage() {
        return "Welcome";
    }
}
