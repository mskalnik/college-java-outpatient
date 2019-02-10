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

--CREATE PROCEDURE insertPatient
--	@patientFirstName nvarchar(50),
--	@patientMiddleName nvarchar(50),
--	@patientLastName nvarchar(50),
--	@sex char,
--	@date datetime,

--	@complaint nvarchar(50),

--	@presentDoor nvarchar(50),
--	@presentStreet nvarchar(50),
--	@presentArea nvarchar(50),
--	@presentCity nvarchar(50),
--	@presentState nvarchar(50),
--	@presentPincode nvarchar(50),

--	@permanentDoor nvarchar(50),
--	@permanentStreet nvarchar(50),
--	@permanentArea nvarchar(50),
--	@permanentCity nvarchar(50),
--	@permanentState nvarchar(50),
--	@permanentPincode nvarchar(50),

--	@telephoneWork nvarchar(50),
--	@telephoneHome nvarchar(50),
--	@mobile nvarchar(50),
--	@pager nvarchar(50),
--	@fax nvarchar(50),
--	@email nvarchar(50),

--	@kinFirstName nvarchar(50),
--	@kinMiddleName nvarchar(50),
--	@kinLastName nvarchar(50),
--	@kinRelationship nvarchar(50),
--	@kinTelephoneHome nvarchar(50),
--	@kinTelephoneWork nvarchar(50),
--	@kinMobile nvarchar(50),
--	@kinPager nvarchar(50),
--	@kinFax nvarchar(50),
--	@kinEmail nvarchar(50),

--	@kinDoor nvarchar(50),
--	@kinStreet nvarchar(50),
--	@kinArea nvarchar(50),
--	@kinCity nvarchar(50),
--	@kinState nvarchar(50),
--	@kinPincode nvarchar(50),

--	@martial nvarchar(50),
--	@noOfDependents nvarchar(50),
--	@height int,
--	@width int,
--	@bloodtype nvarchar(50),

--	@occupation nvarchar(50),
--	@income nvarchar(50)
--AS
	
--GO

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

CREATE PROCEDURE getMedications
AS
	SELECT
		*
	FROM Medication
GO

CREATE PROCEDURE getMedication
	@id int
AS
	SELECT
		*
	FROM Medication
	WHERE @id = IDMedication
GO

INSERT INTO Medication(Name, Price)
Values ('Vilpin', 124), ('Alvonamid', 432),('Belodin', 34),('Sinecod', 14),('Lotar', 50)
GO

CREATE PROCEDURE insertAppointments
	@doctorId int,
	@patientId int,
	@time date
AS
	INSERT INTO Appointment([Time], DoctorID, PatientID)
	VALUES (@time, @doctorId, @patientId)
GO

CREATE PROCEDURE getAppointments
AS
	SELECT *
	FROM Appointment
GO

CREATE PROCEDURE getAppointment
	@id int
AS
	SELECT a.PatientID
	FROM Appointment AS a
	INNER JOIN Doctor AS d ON d.IDDoctor = a.DoctorID
	WHERE @id = a.DoctorID
GO

CREATE PROCEDURE insertBill	
	@diagnosis		int,
	@payed			bit,
	@patientId		int,
	@medicationId	int
AS
	INSERT INTO Bill(Diagnosis, Payed, PatientID, MedicationID)
	VALUES (@diagnosis, @payed, @patientId, @medicationId)
GO

CREATE PROCEDURE getBill
	@id	int
AS
	SELECT * 
	FROM Bill
	WHERE @id = PatientID
GO

select * from Appointment