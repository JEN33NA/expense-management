package com.expensemanagement.expensemanagement.entity;

import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key

    private String description;  // Description of the expense (e.g., "Dinner")
    private Double amount;  // Amount spent
    private String category;  // Category of the expense (e.g., "Food")
    private LocalDate date;  // Date of the expense

    @ManyToOne
    @JoinColumn(name = "user_id")  // Foreign key linking to the User
    private User user;

    // Getters and setters
}
