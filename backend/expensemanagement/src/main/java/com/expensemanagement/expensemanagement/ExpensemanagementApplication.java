package com.expensemanagement.expensemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ExpensemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensemanagementApplication.class, args);
	}

}
