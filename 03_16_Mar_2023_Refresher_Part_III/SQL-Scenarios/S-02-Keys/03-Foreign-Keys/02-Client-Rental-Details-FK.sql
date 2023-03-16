
ALTER TABLE PROPERTY_NEARBY_ATTRACTIONS ADD CONSTRAINT FK_PNA  
FOREIGN KEY ( PROPERTY_ID ) REFERENCES PROPERTY_DETAILS 
( PROPERTY_ID );

ALTER TABLE PROPERTY_OWNER ADD CONSTRAINT FK_PO 
FOREIGN KEY ( PROPERTY_ID ) REFERENCES PROPERTY_DETAILS 
( PROPERTY_ID );

ALTER TABLE RENTAL_DETAILS ADD CONSTRAINT FK_RD_1
FOREIGN KEY ( C_NO ) REFERENCES CLIENT_DETAILS 
( C_NO );

ALTER TABLE RENTAL_DETAILS ADD CONSTRAINT FK_RD_2
FOREIGN KEY ( PROPERTY_ID ) REFERENCES PROPERTY_DETAILS 
( PROPERTY_ID );
