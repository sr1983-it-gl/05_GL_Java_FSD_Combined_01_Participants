CREATE DEFINER=`root`@`localhost` PROCEDURE `getPropertiesWithSchools`(
IN MIN_SCHOOL_COUNT INTEGER)
BEGIN

SELECT * FROM property_nearby_attractions pna
inner join property_details pd 
where pna.PROPERTY_ID = pd.PROPERTY_ID AND
pna.no_of_schools >= MIN_SCHOOL_COUNT;

END

-- Call

call getPropertiesWithSchools(2);
