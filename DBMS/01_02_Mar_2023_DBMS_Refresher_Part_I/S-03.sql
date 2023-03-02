drop table IF EXISTS TEAMS;

CREATE TABLE TEAMS
(
  id		TINYINT,
  name  VARCHAR(20)
);

INSERT INTO TEAMS VALUES (1, 'INDIA');
INSERT INTO TEAMS VALUES (2, 'PAKISTAN');
INSERT INTO TEAMS VALUES (3, 'SRI LANKA');
INSERT INTO TEAMS VALUES (4, 'SOUTH AFRICA');
INSERT INTO TEAMS VALUES (5, 'AUSTRALIA');
INSERT INTO TEAMS VALUES (6, 'ENGLAND');


select * from TEAMS;

-- Step 1
select a.name, b.name from TEAMS a, TEAMS b;

-- Step 1a
select count(*), a.name, b.name from TEAMS a, TEAMS b;

-- Step 2
select a.id, a.name, b.id, b.name from TEAMS a, TEAMS b order by a.name ASC;

-- Step 3
select a.id, a.name, b.id, b.name from TEAMS a, TEAMS b 
where a.id < b.id
order by a.name ASC;

