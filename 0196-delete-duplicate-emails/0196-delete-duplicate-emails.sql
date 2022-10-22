DELETE p1 FROM person AS p1 JOIN person AS p2
WHERE p1.email = p2.email
AND p1.Id > p2.Id;
