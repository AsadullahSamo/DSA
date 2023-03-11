use dsa_pbl;

SELECT * FROM earthquake WHERE Date LIKE '%1978%';

-- DELETE FROM temp;
-- DELETE FROM temp WHERE Date LIKE '%1995%';


SELECT * FROM temp2 WHERE country = 'United States' 
ORDER BY substr(Date, 7,4), substr(Date, 1,2);

SELECT DISTINCT country FROM temp;


SELECT * FROM earthquake;


SELECT * FROM temp2 WHERE country = 'United States';
SELECT * FROM correct_date WHERE Correct_Date LIKE '%1967%'
ORDER BY substr(Correct_Date, 1, 7);


SELECT t.Date, t.country, c.magnitude FROM earthquake c
JOIN temp t
ON t.Date = c.Date;
