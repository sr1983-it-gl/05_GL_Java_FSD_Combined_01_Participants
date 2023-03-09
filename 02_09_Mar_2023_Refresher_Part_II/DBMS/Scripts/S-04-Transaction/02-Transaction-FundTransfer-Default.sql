-- Fund Transfer Scenario 

-- DEFAULT AUTO_COMMIT Mode
-- set autocommit = 1;

set @transfer_amount = 500;

select * from SAVINGS_ACCOUNT;

UPDATE SAVINGS_ACCOUNT SET BALANCE_AMOUNT = (BALANCE_AMOUNT - @transfer_amount) WHERE ACCOUNT_NO = 12345;
UPDATE SAVINGS_ACCOUNT SET BALANCE_AMOUNT = (BALANCE_AMOUNT + @transfer_amount) WHERE ACCOUNT_NO = 23456;

INSERT INTO CUSTOMER_RECENT_LOG (ACCOUNT_NO, COMMENTS) VALUES (12345, concat("Funds Transfer - Withdrawal of ", @transfer_amount));

INSERT INTO CUSTOMER_RECENT_LOG (ACCOUNT_NO, COMMENTS) VALUES (23456, concat("Funds Transfer - Deposit of ", @transfer_amount));

select * from SAVINGS_ACCOUNT;
