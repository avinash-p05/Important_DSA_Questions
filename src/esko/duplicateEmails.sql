SELECT email
FROM employees
GROUP BY email
HAVING COUNT(email)>1;