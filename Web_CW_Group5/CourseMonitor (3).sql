-- =============================================
-- Create database template
-- =============================================
USE master
GO

-- Drop the database if it already exists
IF  EXISTS (
	SELECT name 
		FROM sys.databases 
		WHERE name = N'CourseMonitor'
)
DROP DATABASE CourseMonitor
GO

CREATE DATABASE CourseMonitor
GO

USE CourseMonitor
GO

CREATE TABLE Staff
(
	staffId int identity primary key,
	position varchar(50)
)
GO

CREATE TABLE Department
(
	departmentId int identity primary key,
	departmentName varchar(50) NOT NULL
)
GO

CREATE TABLE Courses
(
	courseId varchar(20) primary key,
	departmentId int references Department(departmentID) NOT NULL,
	title varchar(100) NOT NULL,
	courseLeader varchar(50) NOT NULL,
	courserModerator varchar(50) NOT NULL,
	createDate date NOT NULL,
	semester int NOT NULL,
	studentCount int NOT NULL,
	courserUnits int NOT NULL,
	costUnit varchar(50) NOT NULL
)
GO

CREATE TABLE Account
(
	accountId int identity primary key,
	firtsName varchar(50) NOT NULL,
	lastName varchar(50) NOT NULL,
	address varchar(100) NULL,
	departmentId int references Department(departmentID) NOT NULL,
	staffId int references Staff(staffId) NOT NULL,
	phone int NULL,
	userName varchar(50) NOT NULL,
	password varchar(50) NOT NULL,
	permission char(10) NOT NULL
)
GO





CREATE TABLE CourseMonitorReport
(
	CMRId int identity primary key,
	academicSession int NOT NULL,
	courseId varchar(20) references Courses(courseId) NOT NULL,
	title varchar(100) NOT NULL,
	courseLeader varchar(50) NOT NULL,
	studentCount int NOT NULL,
	commentContent varchar(200) NULL,
	action varchar(20)  NULL,
	isStatus bit
	
)
GO

CREATE TABLE StatisticalData
(
	statisId int identity primary key,
	CMRId int references CourseMonitorReport(CMRId) NOT NULL,
	cw1r1 int,
	cw1r2 int,
	cw1r3 int,
	cw2r1 int,
	cw2r2 int,
	cw2r3 int,
	cw3r1 int,
	cw3r2 int,
	cw3r3 int,
	cw4r1 int,
	cw4r2 int,
	cw4r3 int,
	examr1 int,
	exam1r2 int,
	exam1r3 int,
	over1r1 float,
	overr2 float,
	overr3 float
)
GO 

CREATE TABLE GradeDistributionData
(
	gradeId int identity primary key,
	CMRId int references CourseMonitorReport(CMRId) NOT NULL,
	r1c1 int,r1c2 int,r1c3 int,r1c4 int,r1c5 int,r1c6 int,r1c7 int,r1c8 int,r1c9 int,r1c10 int,
	r2c1 int,r2c2 int,r2c3 int,r2c4 int,r2c5 int,r2c6 int,r2c7 int,r2c8 int,r2c9 int,r2c10 int,
	r3c1 int,r3c2 int,r3c3 int,r3c4 int,r3c5 int,r3c6 int,r3c7 int,r3c8 int,r3c9 int,r3c10 int,
	r4c1 int,r4c2 int,r4c3 int,r4c4 int,r4c5 int,r4c6 int,r4c7 int,r4c8 int,r4c9 int,r4c10 int,
	r5c1 int,r5c2 int,r5c3 int,r5c4 int,r5c5 int,r5c6 int,r5c7 int,r5c8 int,r5c9 int,r5c10 int,
	r6c1 float,r6c2 float,r6c3 float,r6c4 float,r6c5 float,r6c6 float,r6c7 float,r6c8 float,r6c9 float,r6c10 float
)



CREATE TABLE FeedBack
(
	feedBackId int NOT NULL identity primary key,
	userName varchar(30),
	yourEmail varchar(50),
	content varchar(255),
	title varchar(100),
	timePost dateTime,
	statusFeedBack  bit
)
GO

CREATE TABLE News
(
	NewsId int identity primary key,
	title varchar(50),
	image varchar(200),
	content varchar(700),
	postDate date
)
GO
--Insert
INSERT INTO News Output Inserted.IdentityColumnName VALUES('2015-16 Course Brochure','./templates/img/News1-Web-200x200.jpg','To receive a free copy of our annual courses and events brochure, simply fill in your details in the form below and we’ll post you out a copy.',GETDATE())
INSERT INTO News VALUES('Internet Privacy Tutorials','./templates/img/News2-internet-privacy-200x200.jpg','This course will provide an introduction to protecting private information on the Internet. Users will learn what information is or is not tracked while on the Internet, how it can be tracked, and what is or is not done with it.',GETDATE())
INSERT INTO News VALUES('Learn English','./templates/img/News3-118-200x200.jpg','Learn English with Mayfair. Personal service, professional standards and proven results',GETDATE())
INSERT INTO News VALUES('2377 PAT Testing course','./templates/img/News4-Course-200x200.jpg','A two-day ‘practical’ workshop aimed at practicing electricians who want to start in the testing of portable electrical equipment (PAT Testing). This covers everything necessary to successfully achieve the City & Guilds 2377-22 and competence Management of Electrical Equipment maintenance 2377-32 examination, with both certifications awarded to successful candidates',GETDATE())
INSERT INTO News VALUES('Creative Leadership ','./templates/img/News5-course9-200x200.jpg','Protected: Forward-Thinking Leadership (FTL 101) : Building Strategic Capacities for E-learning and Mobile learning through Forward-thinking Leadership',GETDATE())


INSERT INTO Department VALUES('Software Engineering')
INSERT INTO Department VALUES('Communications And Computer Networks')
INSERT INTO Department VALUES('Computer Science')
INSERT INTO Department VALUES('computer Engineering')
INSERT INTO Department VALUES('Information Systems')
INSERT INTO Department VALUES('Graphics')

INSERT INTO Staff VALUES('Course Leader')
INSERT INTO Staff VALUES('Course Moderator')
INSERT INTO Staff VALUES('Pro-Vice Chancellor')
INSERT INTO Staff VALUES('Director of Learning and Quality')
INSERT INTO Staff VALUES('Admin')
INSERT INTO Staff VALUES('Teacher')

INSERT INTO Account VALUES('Lena','Smith','Ha Noi',1,1,0126521478,'CLsmith','123123','CL')
INSERT INTO Account VALUES('Nicol','Green','Hai Phong',1,2,0136521478,'CMgreen','123123','CM')
INSERT INTO Account VALUES('Tom','Taylor','Ha Noi',2,1,0126521478,'CLtaylor','123123','CL')
INSERT INTO Account VALUES('Paul','Miller','Hai Phong',2,2,0136521478,'CMmiller','123123','CM')
INSERT INTO Account VALUES('Ailen','Lee','Ha Noi',3,1,0126521478,'CLlee','123123','CL')
INSERT INTO Account VALUES('David','King','Hai Phong',3,2,0136521478,'CMking','123123','CM')
INSERT INTO Account VALUES('Brad','Feld','Ha Noi',3,3,0126521478,'PVCfeld','123123','PVC')
INSERT INTO Account VALUES('Fred','Wilson','Hai Phong',3,4,0136521478,'DTLwilson','123123','DTL')
INSERT INTO Account VALUES('Marissa','Mayer','Ha Noi',3,5,0126521478,'ADMmayer','123123','ADM')
INSERT INTO Account VALUES('Meg','Jobs','Hai Phong',3,6,0136521478,'GUjobs','123123','GU')

INSERT INTO Courses VALUES('C12345',1,'Website Manager','Smith','Green',GETDATE(),1,50,12,'hours')
INSERT INTO Courses VALUES('A12345',2,'Website Design','Taylor','Miller',GETDATE(),1,60,10,'months')
INSERT INTO Courses VALUES('B12345',3,'FrameWork','Lee','King',GETDATE(),1,45,20,'months')

select * from Department
select * from Staff
select * from Account
select * from Courses
select * from News
select * from CourseMonitorReport
