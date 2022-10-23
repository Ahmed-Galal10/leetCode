SELECT w1.id
FROM weather w1, weather w2
WHERE w1.temperature > w2.temperature
AND DATEDIFF(w1.recordDate, w2.recordDate) = 1;