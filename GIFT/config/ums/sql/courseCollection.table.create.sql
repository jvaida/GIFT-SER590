/* Creates the new table "COURSECOLLECTION" to define all collections of COURSES */
CREATE TABLE APP.COURSECOLLECTION (
    COLLECTIONID_PK VARCHAR(255) NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    OWNER VARCHAR(255) NOT NULL,
	DESCRIPTION LONG VARCHAR,
	PRIMARY KEY (COLLECTIONID_PK)
);

/* Create the table that will hold the course collection entries */
CREATE TABLE APP.COURSECOLLECTIONENTRY (
	COLLECTIONID_FK VARCHAR(255) NOT NULL,
	COLLECTIONINDEX INTEGER NOT NULL,
	COURSEID_FK VARCHAR(255) NOT NULL,
	PRIMARY KEY (COLLECTIONID_FK, COURSEID_FK),
	UNIQUE (COLLECTIONID_FK, COLLECTIONINDEX),
	FOREIGN KEY (COURSEID_FK) REFERENCES APP.EXPERIMENT(EXPERIMENTID_PK),
	FOREIGN KEY (COLLECTIONID_FK) REFERENCES APP.COURSECOLLECTION(COLLECTIONID_PK)
);