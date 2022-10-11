SELECT DISTINCT email
FROM person AS p1 JOIN person AS p2
USING (email)
WHERE p1.id <> p2.id;