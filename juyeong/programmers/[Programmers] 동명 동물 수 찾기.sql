-- https://school.programmers.co.kr/learn/courses/30/lessons/59041
SELECT NAME, COUNT(*) AS COUNT
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT >= 2 AND NAME IS NOT NULL
ORDER BY NAME
-- sql 안봤더니 groupby having 헷갈렸다 한번씩 문제풀기