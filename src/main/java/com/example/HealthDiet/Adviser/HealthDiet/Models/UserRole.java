package com.example.HealthDiet.Adviser.HealthDiet.Models;

public enum UserRole {
//    USER,
//    ADMIN;

    NORMAL_USER("Normal User"),
    ADMIN("Admin");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
