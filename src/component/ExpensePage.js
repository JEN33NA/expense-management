import React, { useState, useEffect } from 'react';
import { getExpenses, addExpense } from '../api/expense';

function ExpensePage({ userId }) {
  const [expenses, setExpenses] = useState([]);
  const [expense, setExpense] = useState({ description: '', amount: 0, category: '' });

  useEffect(() => {
    const fetchExpenses = async () => {
      const expensesData = await getExpenses(userId);
      setExpenses(expensesData);
    };

    fetchExpenses();
  }, [userId]);

  const handleAddExpense = async () => {
    const newExpense = await addExpense(expense);
    setExpenses([...expenses, newExpense]);
  };

  return (
    <div>
      <h2>Your Expenses</h2>
      <ul>
        {expenses.map(exp => (
          <li key={exp.id}>{exp.description} - ${exp.amount}</li>
        ))}
      </ul>
      
      <div>
        <input 
          type="text" 
          value={expense.description} 
          onChange={(e) => setExpense({...expense, description: e.target.value})}
        />
        <input 
          type="number" 
          value={expense.amount} 
          onChange={(e) => setExpense({...expense, amount: parseFloat(e.target.value)})}
        />
        <input 
          type="text" 
          value={expense.category} 
          onChange={(e) => setExpense({...expense, category: e.target.value})}
        />
        <button onClick={handleAddExpense}>Add Expense</button>
      </div>
    </div>
  );
}

export default ExpensePage;
