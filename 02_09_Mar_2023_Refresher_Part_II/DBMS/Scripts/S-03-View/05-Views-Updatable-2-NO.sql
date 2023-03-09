CREATE OR REPLACE VIEW STUDENTS_BATCH_VIEW 
  AS
select STUDENT_ID, STUDENT_NAME from STUDENTS_BATCH_1 A 
UNION ALL 
select STUDENT_ID, STUDENT_NAME from STUDENTS_BATCH_2 B;

SELECT * FROM STUDENTS_BATCH_VIEW;


-- TO check if the view is updatable or not

SELECT table_name, is_updatable FROM information_schema.views WHERE table_schema = 'dbms_refresher_work';


-- Update a View [This will fail]
update STUDENTS_BATCH_VIEW set STUDENT_NAME = 'Andrew 2' where
STUDENT_ID = 10;

