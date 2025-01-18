package com.example.api.dto;

import com.example.api.model.UserRole;

public record UserCreate(String username, String password, UserRole userRole) {
}
