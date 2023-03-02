set @person_name = 'Rajesh';
set @person_age = 35;
set @address_line_1 = 'Indra Nagar, ';
set @address_line_2 = 'Bangalore';
select * from person_null_records where name = @person_name AND age = @person_age AND address = concat(@address_line_1, @address_line_2);