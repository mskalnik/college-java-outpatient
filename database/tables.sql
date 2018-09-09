CREATE DATABASE OutPatientManagement;
USE OutPatientManagement;

CREATE TABLE Person (
    IDPerson	int NOT NULL AUTO_INCREMENT,
    FirstName	nvarchar(50),
    MiddleName	nvarchar(50),
    Surname		nvarchar(50),
    CONSTRAINT PK_IDPerson PRIMARY KEY (IDPerson)
);

CREATE TABLE Doctor (
    IDDoctor	int NOT NULL AUTO_INCREMENT,
    Title		nvarchar(50),
    PersonID	int NOT NULL,
    CONSTRAINT PK_IDDoctor PRIMARY KEY (IDDoctor),
    CONSTRAINT FK_Doctor_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE Patient (
    OPID		int NOT NULL AUTO_INCREMENT,
    DateOfBirth	datetime,
    Sex			char,
    Complaint	nvarchar(200),
    PersonID	int NOT NULL,
    CONSTRAINT PK_OPID PRIMARY KEY (OPID),
    CONSTRAINT FK_Patient_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE NextOfKin (
    IDNextOfKin		int NOT NULL AUTO_INCREMENT,
    Relationship	nvarchar(50),
    PatientID		int NOT NULL,
    PersonID		int NOT NULL,
    CONSTRAINT PK_IDNextOfKin PRIMARY KEY (IDNextOfKin),
    CONSTRAINT FK_NextOfKin_PatientID FOREIGN KEY (PatientID) REFERENCES Patient(OPID),
    CONSTRAINT FK_NextOfKin_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE Telephone (
    IDTelephone	int NOT NULL AUTO_INCREMENT,
    Number		nvarchar(10),
    CONSTRAINT PK_IDTelephone PRIMARY KEY (IDTelephone)
);

CREATE TABLE Address (
    IDAddress	int NOT NULL AUTO_INCREMENT,
    DoorNo		nvarchar(10),
    Street		nvarchar(50),
    Area		nvarchar(50),
    City		nvarchar(50),
    Pincode		nvarchar(5),
    CONSTRAINT PK_IDAddress PRIMARY KEY (IDAddress)
);

CREATE TABLE Contact (
    IDContact			int NOT NULL AUTO_INCREMENT,
    Email				nvarchar(50),
    PressentAddressID	int NOT NULL,
    PermanentAdressID	int NOT NULL,
    TelephoneWorkID		int NOT NULL,
    TelephoneHomeID		int NOT NULL,
    MobileID			int NOT NULL,
    PagerID				int NOT NULL,
    FaxID				int NOT NULL,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDContact PRIMARY KEY (IDContact),
    CONSTRAINT FK_Contact_PressentAddressID FOREIGN KEY (PressentAddressID) REFERENCES Address(IDAddress),
    CONSTRAINT FK_Contact_PermanentAdressID FOREIGN KEY (PermanentAdressID) REFERENCES Address(IDAddress),
    CONSTRAINT FK_Contact_TelephoneWorkID FOREIGN KEY (TelephoneWorkID) REFERENCES Telephone(IDTelephone),
	CONSTRAINT FK_Contact_TelephoneHomeID FOREIGN KEY (TelephoneHomeID) REFERENCES Telephone(IDTelephone),	
    CONSTRAINT FK_Contact_MobileID FOREIGN KEY (MobileID) REFERENCES Telephone(IDTelephone),    
    CONSTRAINT FK_Contact_PagerID FOREIGN KEY (PagerID) REFERENCES Telephone(IDTelephone),
    CONSTRAINT FK_Contact_FaxID FOREIGN KEY (FaxID) REFERENCES Telephone(IDTelephone),
    CONSTRAINT FK_Contact_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE MaritalStatus (
    IDMaritalStatus	int NOT NULL AUTO_INCREMENT,
    MaritalStatus	nvarchar(50),
    CONSTRAINT PK_IDMaritalStatus PRIMARY KEY (IDMaritalStatus)
);

CREATE TABLE BlodType (
    IDBlodType		int NOT NULL AUTO_INCREMENT,
    BloodType		nvarchar(2),
    CONSTRAINT PK_BlodType PRIMARY KEY (IDBlodType)
);

CREATE TABLE PersonalDetails (
    IDPersonalDetails	int NOT NULL AUTO_INCREMENT,
    NoOfDependents		int,
    Height				double,
    Weight				double,
    BlodTypeID			int NOT NULL,			
    MaritalStatusID		int NOT NULL,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDPersonalDetails PRIMARY KEY (IDPersonalDetails),
    CONSTRAINT FK_PersonalDetails_BlodTypeID FOREIGN KEY (BlodTypeID) REFERENCES BlodType(IDBlodType),
    CONSTRAINT FK_PersonalDetails_MaritalStatusID FOREIGN KEY (MaritalStatusID) REFERENCES MaritalStatus(IDMaritalStatus),
    CONSTRAINT FK_PersonalDetails_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE ProfessionDetails (
    IDProfessiondetails	int NOT NULL AUTO_INCREMENT,
    Occupation			nvarchar(50),
    GrossAnnualIncome	int,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDProfessiondetails PRIMARY KEY (IDProfessiondetails),
    CONSTRAINT FK_Professiondetails_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE Lifestyle (
    IDLifestyle			int NOT NULL AUTO_INCREMENT,
    Vegeterian			bool,
    Smoker				bool,
    AverageCigarettes	smallint,
    Alcohol				bool,
    AverageDrinks		smallint,
    Stimulans			nvarchar(200),
    CoffeTeaDay			smallint,
    SoftDrinksDay		smallint,
    RegularMeals		bool,
    EatHomeFood			bool,
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDLifestyle PRIMARY KEY (IDLifestyle),
    CONSTRAINT FK_Lifestyle FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE BasicComplaints (
    IDBasicComplaints	int NOT NULL AUTO_INCREMENT,
    Statement			nvarchar(500),
    HistoryOfPrevoius	nvarchar(500),
    PhysicianTreated	nvarchar(500),
    PersonID			int NOT NULL,
    CONSTRAINT PK_IDBasicComplaints PRIMARY KEY (IDBasicComplaints),
    CONSTRAINT FK_BasicComplaints_PersonID FOREIGN KEY (PersonID) REFERENCES Person(IDPerson)
);

CREATE TABLE MedicalComplaints (
    IDMedicalComplaints			int NOT NULL AUTO_INCREMENT,
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
);