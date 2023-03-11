use dsa_pbl;


-- largestMagnitude
SELECT MAX(magnitude) AS maxMagnitude FROM clone_earthquake2
GROUP BY substring(Date, -2);


-- Get last two characters
SELECT substring(Date, -2) AS Date FROM clone_earthquake2;


SELECT Date,
            CONCAT(
            CASE 
			WHEN (substring(Date, -2)) BETWEEN 64 AND 100 THEN CONCAT('19', substring(Date, -2), '-')
            ELSE CONCAT('20', substring(Date, -2), '-') END,
        CASE
            WHEN (substring(Date, 1, 2)) BETWEEN 1 AND 31 THEN CONCAT('0', substring(Date, 1, 1), '-')
            ELSE CONCAT(substring(Date, 1, 2), '-') END,
        CASE
            WHEN (substring(Date, 3, 2)) BETWEEN 1 AND 10 THEN CONCAT('0', substring(Date, 3, 1))
            ELSE  substring(Date, 4, 2) END
            ) AS correct_date_Format
        FROM clone_earthquake2;
        
        SELECT Date, (substr(Date, 3, 2)) FROM clone_earthquake2;
SELECT Date, substring(Date, 1, 4) AS Date, magnitude FROM clone_earthquake2;
-- GROUP BY substring(Date, -2);