DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateClientRecordsCount`(
INOUT RECORDS_COUNT INTEGER)
BEGIN

	--
	INSERT INTO CLIENT_DETAILS (C_NO, CLIENT_NAME) VALUES ('1', 'Test1');
    SET RECORDS_COUNT = RECORDS_COUNT + 1;
    
	INSERT INTO CLIENT_DETAILS (C_NO, CLIENT_NAME) VALUES ('2', 'Test2');
    SET RECORDS_COUNT = RECORDS_COUNT + 1;    

	DELETE FROM CLIENT_DETAILS WHERE C_NO IN ('1', '2');

END$$

DELIMITER ;
;

-- Procedure Call

set @ROWS_COUNT = 0;
select count(*) INTO @ROWS_COUNT from client_details;
select @ROWS_COUNT;
CALL `<db_name>`.`updateClientRecordsCount`(@ROWS_COUNT);
select @ROWS_COUNT;
