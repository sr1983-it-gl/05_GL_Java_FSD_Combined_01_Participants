
ALTER TABLE CLIENT_DETAILS ADD PRIMARY KEY (C_NO);

ALTER TABLE PROPERTY_DETAILS ADD PRIMARY KEY (PROPERTY_ID);

ALTER TABLE PROPERTY_OWNER ADD PRIMARY KEY (PROPERTY_ID);

ALTER TABLE PROPERTY_NEARBY_ATTRACTIONS ADD PRIMARY KEY (PROPERTY_ID);

ALTER TABLE RENTAL_DETAILS ADD PRIMARY KEY (C_NO, PROPERTY_ID);