CREATE DATABASE OutPatientManagement
GO

USE OutPatientManagement
GO

CREATE TABLE Person (
    IDPerson	int NOT NULL IDENTITY,
    FirstName	nvarchar(50),
    MiddleName	nvarchar(50),
    Surname		nvarchar(50),
    CONSTRAINT PK_IDPerson PRIMARY KEY (IDPerson)
)
GO

CREATE TABLE Doctor (
    IDDoctor	int NOT NULL IDENTITY,
    Title		nvarchar(50),
    PersonID	int NOT NULL,
    CONSTRAINT PK_IDDoctor PRIMARY KEY (IDDoctor),
    CONSTRAINT FK_Doctor_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE Patient (
    OPID		int NOT NULL IDENTITY,
    DateOfBirth	datetime,
    Sex			char,
    Complaint	nvarchar(200),
    PersonID	int NOT NULL,
    CONSTRAINT PK_OPID PRIMARY KEY (OPID),
    CONSTRAINT FK_Patient_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE NextOfKin (
    IDNextOfKin		int NOT NULL IDENTITY,
    Relationship	nvarchar(50),
    PatientID		int NOT NULL,
    PersonID		int NOT NULL,
    CONSTRAINT PK_IDNextOfKin PRIMARY KEY (IDNextOfKin),
    CONSTRAINT FK_NextOfKin_PatientID FOREIGN KEY (PatientID) REFERENCES Patient(OPID),
    CONSTRAINT FK_NextOfKin_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE Telephone (
    IDTelephone	int NOT NULL IDENTITY,
    Number		nvarchar(10),
    CONSTRAINT PK_IDTelephone PRIMARY KEY (IDTelephone)
)
GO

CREATE TABLE Address (
    IDAddress	int NOT NULL IDENTITY,
    DoorNo		nvarchar(10),
    Street		nvarchar(50),
    Area		nvarchar(50),
    City		nvarchar(50),
    Pincode		nvarchar(5),
    CONSTRAINT PK_IDAddress PRIMARY KEY (IDAddress)
)
GO

CREATE TABLE Contact (
    IDContact			int NOT NULL IDENTITY,
    Email				nvarchar(50),
    PressentAddressID	int,
    PermanentAdressID	int,
    TelephoneWorkID		int,
    TelephoneHomeID		int,
    MobileID			int,
    PagerID				int,
    FaxID				int,
    PersonID			int,
    CONSTRAINT PK_IDContact PRIMARY KEY (IDContact),
    CONSTRAINT FK_Contact_PressentAddressID FOREIGN KEY (PressentAddressID) REFERENCES Address(IDAddress),
    CONSTRAINT FK_Contact_PermanentAdressID FOREIGN KEY (PermanentAdressID) REFERENCES Address(IDAddress),
    CONSTRAINT FK_Contact_TelephoneWorkID FOREIGN KEY (TelephoneWorkID) REFERENCES Telephone(IDTelephone),
	CONSTRAINT FK_Contact_TelephoneHomeID FOREIGN KEY (TelephoneHomeID) REFERENCES Telephone(IDTelephone),	
    CONSTRAINT FK_Contact_MobileID FOREIGN KEY (MobileID) REFERENCES Telephone(IDTelephone),    
    CONSTRAINT FK_Contact_PagerID FOREIGN KEY (PagerID) REFERENCES Telephone(IDTelephone),
    CONSTRAINT FK_Contact_FaxID FOREIGN KEY (FaxID) REFERENCES Telephone(IDTelephone),
    CONSTRAINT FK_Contact_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE MaritalStatus (
    IDMaritalStatus	int NOT NULL IDENTITY,
    MaritalStatus	nvarchar(50),
    CONSTRAINT PK_IDMaritalStatus PRIMARY KEY (IDMaritalStatus)
)
GO

CREATE TABLE BlodType (
    IDBlodType		int NOT NULL IDENTITY,
    BloodType		nvarchar(2),
    CONSTRAINT PK_BlodType PRIMARY KEY (IDBlodType)
)
GO

CREATE TABLE PersonalDetails (
    IDPersonalDetails	int NOT NULL IDENTITY,
    NoOfDependents		int,
    Height				int,
    Weight				int,
    BlodTypeID			int NOT NULL,			
    MaritalStatusID		int NOT NULL,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDPersonalDetails PRIMARY KEY (IDPersonalDetails),
    CONSTRAINT FK_PersonalDetails_BlodTypeID FOREIGN KEY (BlodTypeID) REFERENCES BlodType(IDBlodType),
    CONSTRAINT FK_PersonalDetails_MaritalStatusID FOREIGN KEY (MaritalStatusID) REFERENCES MaritalStatus(IDMaritalStatus),
    CONSTRAINT FK_PersonalDetails_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE ProfessionDetails (
    IDProfessiondetails	int NOT NULL IDENTITY,
    Occupation			nvarchar(50),
    GrossAnnualIncome	int,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDProfessiondetails PRIMARY KEY (IDProfessiondetails),
    CONSTRAINT FK_Professiondetails_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE Lifestyle (
    IDLifestyle			int NOT NULL IDENTITY,
    Vegeterian			bit,
    Smoker				bit,
    AverageCigarettes	smallint,
    Alcohol				bit,
    AverageDrinks		smallint,
    Stimulans			nvarchar(200),
    CoffeTeaDay			smallint,
    SoftDrinksDay		smallint,
    RegularMeals		bit,
    EatHomeFood			bit,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDLifestyle PRIMARY KEY (IDLifestyle),
    CONSTRAINT FK_Lifestyle FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE BasicComplaints (
    IDBasicComplaints	int NOT NULL IDENTITY,
    Statement			nvarchar(500),
    HistoryOfPrevoius	nvarchar(500),
    PhysicianTreated	nvarchar(500),
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDBasicComplaints PRIMARY KEY (IDBasicComplaints),
    CONSTRAINT FK_BasicComplaints_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO

CREATE TABLE MedicalComplaints (
    IDMedicalComplaints			int NOT NULL IDENTITY,
    Diabetic					nvarchar(200),
    Hypertensive				nvarchar(200),
    CardicConcition				nvarchar(200),
    RespiratoryCondition		nvarchar(200),
    DiagestiveCondition			nvarchar(200),
    OrthopedicCondition			nvarchar(200),
    MuscularCondition			nvarchar(200),
    NeurologicalCondition		nvarchar(200),
    KnownAllergies				nvarchar(200),
    KnownAdverseReactionToDrugs	nvarchar(200),
    MajorSurgeries				nvarchar(200),
    PersonID					int NOT NULL,
    CONSTRAINT PK_IDMedicalComplaints PRIMARY KEY (IDMedicalComplaints),
    CONSTRAINT FK_MedicalComplaints_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
)
GO