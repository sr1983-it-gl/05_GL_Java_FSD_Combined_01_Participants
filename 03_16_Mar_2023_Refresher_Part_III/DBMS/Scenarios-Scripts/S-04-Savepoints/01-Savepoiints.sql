update savings_account set balance_amount = 5000;
DELETE FROM CUSTOMER_RECENT_LOG;
COMMIT;

-- Fund Transfer Scenario 

set autocommit = 0;

START TRANSACTION;
set @transfer_amount = 500;

select * from savings_account;

UPDATE SAVINGS_ACCOUNT SET BALANCE_AMOUNT = (BALANCE_AMOUNT - @transfer_amount) WHERE ACCOUNT_NO = 12345;

INSERT INTO CUSTOMER_RECENT_LOG (ACCOUNT_NO, COMMENTS) VALUES (12345, concat(NOW(), " - Funds Transfer - Withdrawal of ", @transfer_amount));

SAVEPOINT Account_Update_1;

UPDATE SAVINGS_ACCOUNT SET BALANCE_AMOUNT = (BALANCE_AMOUNT + @transfer_amount) WHERE ACCOUNT_NO = 23456;

SELECT * FROM SAVINGS_ACCOUNT WHERE ACCOUNT_NO = 23456;

INSERT INTO CUSTOMER_RECENT_LOG (ACCOUNT_NO, COMMENTS) VALUES (23456, concat(NOW(), " - Funds Transfer - Deposit of ", @transfer_amount));

SAVEPOINT Account_Update_2;

select * from SAVINGS_ACCOUNT;
SELECT * FROM CUSTOMER_RECENT_LOG;

ROLLBACK TO Account_Update_1;
-- This will cancel from THIS point till Account_Update_1
-- Inclusion - From START Till Account_Update_1
-- Exclusion - From Account_Update_1 till THIS Point

select * from SAVINGS_ACCOUNT;
SELECT * FROM CUSTOMER_RECENT_LOG;

COMMIT;
