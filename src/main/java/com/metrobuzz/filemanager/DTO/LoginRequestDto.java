package com.metrobuzz.filemanager.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LoginRequestDto {

    @NotNull(message = "Email cannot be null")
    @NotEmpty(message = "Email cannot be empty")
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^(?!.*(.).*\\1)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$", message = "Password must have a capital letter, a number, a symbol, no repeating patterns and must have at least 8 characters")
    @NotBlank(message = "Password cannot be blank")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
