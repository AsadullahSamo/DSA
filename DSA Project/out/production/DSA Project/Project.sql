use dsa_pbl;


-- largestMagnitude of entire database
SELECT Date, magnitude FROM earthquake 
ORDER BY SUBSTR(Date, -4), Magnitude DESC;


-- largest magnitude of year 1965
SELECT latitude, longitude, magnitude, Date FROM earthquake WHERE Date LIKE '%1968%'
ORDER BY SUBSTR(Date, -4), magnitude DESC;

SELECT * FROM earthquake;


INSERT INTO books(city) VALUES('Paris');

SELECT * FROM books;
