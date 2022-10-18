SELECT DISTINCT t1.num AS ConsecutiveNums
FROM logs AS t1, logs AS t2, logs AS t3
WHERE t1.num = t2.num
AND t2.num = t3.num
AND t2.id = t1.id - 1
AND t3.id = t2.id - 1;
