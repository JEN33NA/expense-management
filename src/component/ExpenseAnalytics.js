import React from 'react';
import { PieChart, Pie, Cell, Tooltip, Legend } from 'recharts';

function ExpenseAnalytics({ expenses }) {
  const categoryData = expenses.reduce((acc, expense) => {
    const { category, amount } = expense;
    acc[category] = acc[category] ? acc[category] + amount : amount;
    return acc;
  }, {});

  const data = Object.keys(categoryData).map(key => ({
    name: key,
    value: categoryData[key],
  }));

  return (
    <PieChart width={400} height={400}>
      <Pie data={data} dataKey="value" nameKey="name" cx="50%" cy="50%" outerRadius={80} label>
        {data.map((entry, index) => (
          <Cell key={index} fill={index % 2 === 0 ? '#8884d8' : '#82ca9d'} />
        ))}
      </Pie>
      <Tooltip />
      <Legend />
    </PieChart>
  );
}

export default ExpenseAnalytics;
