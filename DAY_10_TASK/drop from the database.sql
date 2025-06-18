
USE school;

CREATE TABLE Data1 (
    id INT,
    name VARCHAR(30),
    marks INT,
    department VARCHAR(30),
    section CHAR(1)
);
INSERT INTO Data1 VALUES 
(1, "Rijaykumar", 95, "BCA", "A"),
(2, "Bino", 90, "BCA", "A"),
(3, "felix", 78, "BCA", "B"),
(4, "Aalwin mathew", 99, "BCA", "C");

UPDATE Data1 
SET name = "soori", marks = 59 
WHERE id = 3;

SELECT name, department, section 
FROM Data1 
WHERE marks < 60;

ALTER TABLE Data1 ADD gender VARCHAR(20);

ALTER TABLE Data1 DROP COLUMN gender;

-
