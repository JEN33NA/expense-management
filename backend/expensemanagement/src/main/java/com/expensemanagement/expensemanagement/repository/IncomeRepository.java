package com.expensemanagement.expensemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expensemanagement.expensemanagement.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    List<Income> findByUserId(Long userId);
}

