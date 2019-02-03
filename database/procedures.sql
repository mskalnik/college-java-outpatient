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
	DECLARE @patientId int
	DECLARE @kinId int
	DECLARE @telephone1Id int
	DECLARE @telephone2Id int

	INSERT INTO Person(FirstName, MiddleName, Surname)
	VALUES (@patientFirstName, @patientMiddleName, @patientLastName)
	SET @patientId = SCOPE_IDENTITY()

	INSERT INTO Patient(DateOfBirth, Complaint, PersonID)
	VALUES (@date, @complaint, @patientId)

	INSERT INTO Telephone(Number)
	VALUES (@telephone1)
	SET @telephone1Id = SCOPE_IDENTITY()

	INSERT INTO Telephone(Number)
	VALUES (@telephone2)
	SET @telephone2Id = SCOPE_IDENTITY()

	INSERT INTO Contact(TelephoneWorkID, TelephoneHomeID, PersonID)
	VALUES (@telephone1Id, @telephone2Id, @patientId)

	INSERT INTO Person(FirstName, MiddleName, Surname)
	VALUES (@kinFirstName, @kinMiddleName, @kinLastName)
	SET @kinId = SCOPE_IDENTITY()

	INSERT INTO NextOfKin(Relationship, PatientID, PersonID)
	VALUES (@kinRelationship, @patientId, @kinId)
GO