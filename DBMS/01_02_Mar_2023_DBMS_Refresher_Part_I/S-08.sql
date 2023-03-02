select * from emp;

select count(*) from emp;

-- Step 1 - Usage of RowNumber
select row_number() over() RowNumber, e.* from emp e;

-- Step 2 - Inclusion of Count aggregate function
select row_number() over() RowNumber, count(*), e.* from emp e;

-- Step 3 - Count as a subquery so that records are retained
select row_number() over() RowNumber, (select count(*) from emp) as Count, e.* from emp e;

-- Step 4 - Building the Outer Query
select * from (
	select row_number() over() RowNumber, (select count(*) from emp) 	as Count, e.* from Emp e
) as E_Alias;

-- Step 5 - Specifying the "X % records" condition 
select * from (
	select row_number() over() RowNumber, (select count(*) from emp) 	as Count, e.* from Emp e
) as E_Alias
where RowNumber <= (60 * Count) / 100;
