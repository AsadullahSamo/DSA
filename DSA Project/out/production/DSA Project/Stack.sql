use dsa_pbl;





SELECT * FROM temp2 WHERE country = 'United States' 
ORDER BY substr(Date, 7,4), substr(Date, 1,2);

SELECT DISTINCT country FROM temp;


SELECT * FROM clone_earthquake2 WHERE substr(Date, -2) LIKE '65';


SELECT * FROM temp2 WHERE country = 'United States';
SELECT * FROM correct_date WHERE Correct_Date LIKE '%1967%'
ORDER BY substr(Correct_Date, 1, 7);



