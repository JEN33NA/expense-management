package com.expensemanagement.expensemanagement.entity;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key

    private String description;  // Description of the income (e.g., "Salary")
    private Double amount;  // Amount earned
    private LocalDate date;  // Date of income

    @ManyToOne
    @JoinColumn(name = "user_id")  // Foreign key linking to the User
    private User user;

    // Getters and setters
}

