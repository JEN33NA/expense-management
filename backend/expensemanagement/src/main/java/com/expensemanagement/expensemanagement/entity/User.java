package com.expensemanagement.expensemanagement.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key

    private String username;  // Username for login
    private String password;  // Hashed password

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Expense> expenses;  // List of expenses linked to the user

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Income> incomes;  // List of incomes linked to the user

    // Getters and setters
}
