import axios from 'axios';

const BASE_URL = 'http://localhost:8080/api/expenses';

 export const getExpenses = async (userId) => {
  const response = await axios.get(BASE_URL, { params: { userId } });
  return response.data;
};

// Example to add a new expense with userId
export const addExpense = async (expense, userId) => {
  try {
    const response = await axios.post(`http://localhost:8080/api/expenses`, {
      ...expense,
      userId: userId,  // Include userId in the body of the request
    });
    return response.data;
  } catch (error) {
    console.error('Error adding expense:', error);
    throw error;
  }
};


// Example to get expenses by userId from URL
export const getExpensesByUserId = async (userId) => {
  try {
    const response = await axios.get(`http://localhost:8080/api/expenses/${userId}`);
    return response.data;
  } catch (error) {
    console.error('Error fetching expenses:', error);
    throw error;
  }
};

