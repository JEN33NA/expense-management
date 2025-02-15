package com.expensemanagement.expensemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensemanagement.expensemanagement.entity.Expense;
import com.expensemanagement.expensemanagement.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpensesForUser(Long userId) {
        return expenseRepository.findByUserId(userId);
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

}
