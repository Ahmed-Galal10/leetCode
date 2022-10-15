SELECT s1.score, COUNT(DISTINCT s2.score) AS 'rank'
FROM scores AS s1 JOIN Scores AS s2
ON s1.score <= s2.score
GROUP BY s1.id
ORDER BY s1.score DESC;