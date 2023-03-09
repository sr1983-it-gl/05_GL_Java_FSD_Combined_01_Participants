CREATE OR REPLACE VIEW EMP_DEP_VIEW 
  AS
SELECT E.*, D.DNAME, D.LOC FROM 
EMP E 
INNER JOIN
DEPT D
ON 
E.DEPTNO = D.DEPTNO;


SELECT * FROM EMP_DEP_VIEW;

-- TO check if the view is updatable or not

SELECT table_name, is_updatable FROM information_schema.views WHERE table_schema = 'dbms_refresher_work';



-- Update a View [This will pass]
update EMP_DEP_VIEW set SALARY = 1800.00 WHERE
EMPNO = 7499;
