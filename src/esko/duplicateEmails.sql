SELECT email
FROM employees
GROUP BY email
having COUNT(email)>1;