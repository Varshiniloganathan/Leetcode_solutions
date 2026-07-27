# Write your MySQL query statement below
SELECT email from Person
GROUP BY Person.email
HAVING COUNT(*)>1