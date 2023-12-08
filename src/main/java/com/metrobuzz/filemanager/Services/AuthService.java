// Service
package com.metrobuzz.filemanager.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrobuzz.filemanager.DTO.LoginRequestDto;
import com.metrobuzz.filemanager.Model.UserModel;
import com.metrobuzz.filemanager.Repository.UserRepo;
import com.metrobuzz.filemanager.Utils.ApiResponse;

@Service
public class AuthService {
    private final UserRepo userRepo;

    @Autowired
    public AuthService(UserRepo userRepository) {
        this.userRepo = userRepository;
    }

    public UserModel getUser(String userPublicId) {
        try {
            return userRepo.findByPublicId(userPublicId);
        } catch (Exception exception) {
            return null;
        }
    }

    public List<UserModel> getAllUsers() {
        return userRepo.findAll();
    }

    public ApiResponse loginUser(LoginRequestDto loginData) {
        
        return ApiResponse.success("Success", loginData);
    }
}
