CREATE TABLE Billetter
(id SERIAL NOT NULL,
 filmS VARCHAR (300) NOT NULL,
 antallBilleterS INTEGER NOT NULL,
 fornavnS VARCHAR (300) NOT NULL,
 etternavnS VARCHAR (300) NOT NULL,
 telefonS VARCHAR (300) NOT NULL,
 epostS VARCHAR (300) NOT NULL,
 PRIMARY KEY(id)
);