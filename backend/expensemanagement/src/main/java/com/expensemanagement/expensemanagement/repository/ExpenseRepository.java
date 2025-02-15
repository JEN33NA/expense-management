package com.expensemanagement.expensemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensemanagement.expensemanagement.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUserId(Long userId);
}
