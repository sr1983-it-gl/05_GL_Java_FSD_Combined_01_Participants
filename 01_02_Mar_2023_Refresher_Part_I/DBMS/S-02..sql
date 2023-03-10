drop table IF EXISTS DEPT;
drop table IF EXISTS emp;

CREATE TABLE DEPT
	(DEPTNO TINYINT,
	 DNAME 	VARCHAR(14) ,
	 LOC 	VARCHAR(13) ,
     PRIMARY KEY (DEPTNO)
	 );
	 
CREATE TABLE EMP
   (EMPNO 	SMALLINT,
	ENAME 	VARCHAR(10),
	JOB 	VARCHAR(9),
	MGR 	SMALLINT,
	HIREDATE DATETIME,
	SAL 	DECIMAL(7,2),
	COMM 	DECIMAL(7,2),
    DEPTNO 	TINYINT,
    PRIMARY KEY (EMPNO),
	FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)
	);
	
	
INSERT INTO DEPT VALUES	(10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES	(30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES	(40,'OPERATIONS','BOSTON');


INSERT INTO EMP VALUES(7369,'SMITH','CLERK',7902,'1980-12-17 10:00:00',800,NULL,20);

INSERT INTO EMP VALUES(7499,'ALLEN','SALESMAN',7698,'1981-02-20 10:00:00',1600,300,30);

INSERT INTO EMP VALUES(7521,'WARD','SALESMAN',7698,'1981-02-22 10:00:00',1250,500,30);

INSERT INTO EMP VALUES(7566,'JONES','MANAGER',7839,'1981-09-28 10:00:00',2975,NULL,20);

INSERT INTO EMP VALUES(7654,'MARTIN','SALESMAN',7698,'1981-09-28 10:00:00',1250,1400,30);

INSERT INTO EMP VALUES(7698,'BLAKE','MANAGER',7839,'1981-05-01 10:00:00',2850,NULL,30);

INSERT INTO EMP VALUES(7782,'CLARK','MANAGER',7839,'1981-06-09 10:00:00',2450,NULL,10);

INSERT INTO EMP VALUES(7788,'SCOTT','ANALYST',7566,'1987-07-13 10:00:00',3000,NULL,20);

INSERT INTO EMP VALUES(7839,'KING','PRESIDENT',NULL,'1981-11-17 10:00:00',5000,NULL,10);

INSERT INTO EMP VALUES(7844,'TURNER','SALESMAN',7698,'1981-09-08 10:00:00',1500,0,30);

INSERT INTO EMP VALUES(7876,'ADAMS','CLERK',7788,'1987-07-13 10:00:00',1100,NULL,20);

INSERT INTO EMP VALUES(7900,'JAMES','CLERK',7698,'1981-12-03 10:00:00',950,NULL,30);

INSERT INTO EMP VALUES(7902,'FORD','ANALYST',7566,'1981-12-03 10:00:00',3000,NULL,20);

INSERT INTO EMP VALUES(7934,'MILLER','CLERK',7782,'1982-01-23 10:00:00',1300,NULL,10);



-- Select all the records
select * from emp;

-- Order records based on SAL Desc
select * from emp ORDER BY SAL ;

-- Top 3 Salaries
select * from emp ORDER BY SAL DESC LIMIT 3;

-- Nth highest salary N = 10
select * from emp order by SAL DESC LIMIT 9, 1;

-- Lowest 3 Salaries
select * from emp ORDER BY SAL ASC LIMIT 3;
