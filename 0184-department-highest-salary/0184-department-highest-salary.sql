SELECT d.name AS Department, e.name AS Employee, salary AS Salary
FROM employee e JOIN department d
ON e.departmentId = d.id
WHERE salary = (SELECT MAX(salary) FROM employee WHERE d.id = employee.departmentId);