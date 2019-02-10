USE OutPatientManagement
GO

CREATE PROCEDURE insertPatientMiniForm
	@patientFirstName nvarchar(50),
	@patientMiddleName nvarchar(50),
	@patientLastName nvarchar(50),
	@date datetime,
	@complaint nvarchar(500),
	@telephone1 nvarchar(50),
	@telephone2 nvarchar(50),
	@kinFirstName nvarchar(50),
	@kinMiddleName nvarchar(50),
	@kinLastName nvarchar(50),
	@kinRelationship nvarchar(50)
AS
	DECLARE @personId int
	DECLARE @patientId int
	DECLARE @kinId int
	DECLARE @telephone1Id int
	DECLARE @telephone2Id int

	INSERT INTO Person(FirstName, MiddleName, Surname)
	VALUES (@patientFirstName, @patientMiddleName, @patientLastName)
	SET @personId = SCOPE_IDENTITY()

	INSERT INTO Patient(DateOfBirth, Complaint, PersonID)
	VALUES (@date, @complaint, @personId)
	SET @patientId = SCOPE_IDENTITY()

	INSERT INTO Telephone(Number)
	VALUES (@telephone1)
	SET @telephone1Id = SCOPE_IDENTITY()

	INSERT INTO Telephone(Number)
	VALUES (@telephone2)
	SET @telephone2Id = SCOPE_IDENTITY()

	INSERT INTO Contact(TelephoneWorkID, TelephoneHomeID, PersonID)
	VALUES (@telephone1Id, @telephone2Id, @personId)

	INSERT INTO Person(FirstName, MiddleName, Surname)
	VALUES (@kinFirstName, @kinMiddleName, @kinLastName)
	SET @kinId = SCOPE_IDENTITY()

	INSERT INTO NextOfKin(Relationship, PatientID, PersonID)
	VALUES (@kinRelationship, @patientId, @kinId)
GO

CREATE PROCEDURE getExistingPatients
AS
	SELECT 
		pa.OPID AS OPID,
		pe.FirstName AS FirstName,
		pe.MiddleName AS MiddleName,
		pe.Surname AS Surname,
		pa.DateOfBirth AS DateOfBirth,
		pa.Complaint AS Complaint,
		(SELECT FirstName FROM Person WHERE n.PersonID = Person.IDPerson) AS KinFirstName,
		(SELECT MiddleName FROM Person WHERE n.PersonID = Person.IDPerson) AS KinMiddleName,
		(SELECT Surname FROM Person WHERE n.PersonID = Person.IDPerson) AS KinLastName,
		n.Relationship AS Relationship,
		(SELECT Number FROM Telephone AS t WHERE t.IDTelephone = c.TelephoneHomeID) AS TelephoneHome,
		(SELECT Number FROM Telephone AS t WHERE t.IDTelephone = c.TelephoneWorkID) AS TelephoneWork
	FROM Patient AS pa
	INNER JOIN Person AS pe ON pe.IDPerson = pa.PersonID
	INNER JOIN NextOfKin AS n ON n.PatientID = pa.OPID
	INNER JOIN Contact AS c ON c.PersonID = pe.IDPerson
GO

CREATE PROCEDURE getExistingPatient
	@id int
AS
	SELECT 
		pa.OPID AS OPID,
		pe.FirstName AS FirstName,
		pe.MiddleName AS MiddleName,
		pe.Surname AS Surname,
		pa.DateOfBirth AS DateOfBirth,
		pa.Complaint AS Complaint,
		(SELECT FirstName FROM Person WHERE n.PersonID = Person.IDPerson) AS KinFirstName,
		(SELECT MiddleName FROM Person WHERE n.PersonID = Person.IDPerson) AS KinMiddleName,
		(SELECT Surname FROM Person WHERE n.PersonID = Person.IDPerson) AS KinLastName,
		n.Relationship AS Relationship,
		(SELECT Number FROM Telephone AS t WHERE t.IDTelephone = c.TelephoneHomeID) AS TelephoneHome,
		(SELECT Number FROM Telephone AS t WHERE t.IDTelephone = c.TelephoneWorkID) AS TelephoneWork
	FROM Patient AS pa
	INNER JOIN Person AS pe ON pe.IDPerson = pa.PersonID
	INNER JOIN NextOfKin AS n ON n.PatientID = pa.OPID
	INNER JOIN Contact AS c ON c.PersonID = pe.IDPerson	
	WHERE @id = pa.OPID
GO

CREATE PROCEDURE insertDoctor
	@firstName nvarchar(50),
	@middleName nvarchar(50),
	@lastName nvarchar(50),
	@title nvarchar(50)
AS
	DECLARE @id int

	INSERT INTO Person(FirstName, MiddleName, Surname)
	VALUES (@firstName, @middleName, @lastName)
	SET @id = SCOPE_IDENTITY()

	INSERT INTO Doctor(Title, PersonID)
	VALUES (@title, @id)
GO

CREATE PROCEDURE getDoctors
AS
	SELECT 
		d.IDDoctor,
		p.FirstName,
		p.MiddleName,
		p.Surname,
		d.Title
	FROM Doctor AS d
	INNER JOIN Person AS p ON p.IDPerson = d.PersonID
GO

CREATE PROCEDURE getDoctor
	@id int
AS
	SELECT 
		d.IDDoctor,
		p.FirstName,
		p.MiddleName,
		p.Surname,
		d.Title
	FROM Doctor AS d
	INNER JOIN Person AS p ON p.IDPerson = d.PersonID
	WHERE @id = d.IDDoctor
GO

exec getDoctors