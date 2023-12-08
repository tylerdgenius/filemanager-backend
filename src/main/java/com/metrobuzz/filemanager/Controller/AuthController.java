package com.metrobuzz.filemanager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metrobuzz.filemanager.DTO.LoginRequestDto;
import com.metrobuzz.filemanager.Model.UserModel;
import com.metrobuzz.filemanager.Services.AuthService;
import com.metrobuzz.filemanager.Utils.ApiResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ApiResponse loginUser(@Valid @RequestBody LoginRequestDto userData) {
        return authService.loginUser(userData);
    }

    @GetMapping("/get-all")
    public ApiResponse entryPage() {
        try {
            List<UserModel> users = authService.getAllUsers();
            return ApiResponse.success("Users retrieved successfully", users);
        } catch (Exception exception) {
            return ApiResponse.error("Error retrieving users", 500, null);
        }
    }
}
