# Write your MySQL query statement below
SELECT Max(salary) AS SecondHighestSalary
FROM Employee 
WHERE Salary < (SELECT Max(salary) FROM Employee);
