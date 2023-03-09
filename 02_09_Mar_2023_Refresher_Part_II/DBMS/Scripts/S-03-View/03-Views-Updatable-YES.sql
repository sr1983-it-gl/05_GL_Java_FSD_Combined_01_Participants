
-- TO check if the view is updatable or not

SELECT table_name, is_updatable FROM information_schema.views WHERE table_schema = 'dbms_refresher_work';

-- Update a View
update EMP_SALARY_MGMT_VIEW set SALARY = 8000.00 WHERE
EMPNO = 7369;


