CREATE DEFINER=`root`@`localhost` PROCEDURE `getClientRentalDetails`()
BEGIN

select * from rental_details rd inner join property_details pd
inner join property_nearby_attractions pna
inner join property_owner po 
inner join client_details cd
where 
rd.PROPERTY_ID = pd.property_id 
AND pd.property_id = pna.property_id
AND pd.property_id = po.property_id
AND rd.c_no = cd.c_no;

END