
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getPropertyDetails`(
IN I_PROPERTY_ID VARCHAR(50), 
OUT O_NO_OF_PARKS INTEGER, 
OUT O_NO_OF_SCHOOLS INTEGER,
OUT O_NO_OF_MULTIPLEX_CINEMAS INTEGER)
BEGIN

--
select 
	no_of_parks, no_of_schools,
    no_of_multiplex_cinemas
    INTO O_NO_OF_PARKS,
    O_NO_OF_SCHOOLS, O_NO_OF_MULTIPLEX_CINEMAS
    from property_nearby_attractions
    where property_id = I_PROPERTY_ID;
    
END$$

DELIMITER ;
;

-- Procedure Call

CALL `<db_name>`.`getPropertyDetails`(
'P-001', @O1, @O2, @O3
);

select @O1 AS 'Parks', @O2 AS 'Schools', @O3 AS 'Cinema Halls';
