CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE M INT;
  SET M = N - 1;
  RETURN (
      SELECT IFNULL(NULL, (SELECT DISTINCT salary
                           FROM employee
                           ORDER BY salary DESC
                           LIMIT M, 1))
  );
END