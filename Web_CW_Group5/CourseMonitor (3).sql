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

CREATE TABLE Course
(
	courseId varchar(20) primary key,
	title varchar(100) NOT NULL,
	description varchar(500) NOT NULL
)
GO

CREATE TABLE CourseWork
(
	courseWorkId int identity primary key,
	courseId varchar(20) references Course(courseId) NOT NULL,
	departmentId int references Department(departmentID) NOT NULL,
	courseLeader varchar(50) NOT NULL,
	courserModerator varchar(50) NOT NULL,
	createDate date NOT NULL,
	yearMaking int NOT NULL,
	semester int NOT NULL,
	studentCount int NOT NULL,
	courserUnits int NOT NULL,
	costUnit varchar(50) NOT NULL,
	ishadCMR bit NOT NULL,
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
	permission varchar(20) NOT NULL
)
GO





CREATE TABLE CourseMonitorReport
(
	CMRId int identity primary key,
	academicSession int NOT NULL,
	courseWorkId int references CourseWork(courseWorkId) NOT NULL,
	title varchar(100) NOT NULL,
	courseLeader varchar(50) NOT NULL,
	studentCount int NOT NULL,
	commentContent varchar(200) NULL,
	action varchar(20)  NULL,
	startDate date NOT NULL,
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
--INSERT INTO News Output Inserted.IdentityColumnName VALUES('2015-16 Course Brochure','./templates/img/News1-Web-200x200.jpg','To receive a free copy of our annual courses and events brochure, simply fill in your details in the form below and we’ll post you out a copy.',GETDATE())
INSERT INTO News VALUES('Internet Privacy Tutorials','./templates/img/News2-internet-privacy-200x200.jpg','This course will provide an introduction to protecting private information on the Internet. Users will learn what information is or is not tracked while on the Internet, how it can be tracked, and what is or is not done with it.',GETDATE())
INSERT INTO News VALUES('Learn English','./templates/img/News3-118-200x200.jpg','Learn English with Mayfair. Personal service, professional standards and proven results',GETDATE())
INSERT INTO News VALUES('2377 PAT Testing course','./templates/img/News4-Course-200x200.jpg','A two-day ‘practical’ workshop aimed at practicing electricians who want to start in the testing of portable electrical equipment (PAT Testing). This covers everything necessary to successfully achieve the City & Guilds 2377-22 and competence Management of Electrical Equipment maintenance 2377-32 examination, with both certifications awarded to successful candidates',GETDATE())
INSERT INTO News VALUES('Creative Leadership ','./templates/img/News5-course9-200x200.jpg','Protected: Forward-Thinking Leadership (FTL 101) : Building Strategic Capacities for E-learning and Mobile learning through Forward-thinking Leadership',GETDATE())

INSERT INTO Course VALUES ('C12395','Architecture','The course combines studio-based design projects with gaining technical knowledge of materials and construction techniques')
INSERT INTO Course VALUES('C12345','Exploring the Diversity of Life','In this course, students will investigate the question: What can fossils and DNA evidence tell us about biodiversity and evolution of species?')
INSERT INTO Course VALUES('A1234','Predicting and Preventing Infectious Disease','How do infectious diseases constantly outsmart us and continue to threaten human populations around the globe? This course is focused on ideas, concepts, and practices related to the study of infectious disease')
INSERT INTO Course VALUES('C1254','Approaching Amazing Art','How can art be a voice for social change? In Approaching Amazing Art, students read informational texts that examine social movements through the lenses of different artistic representations, such as graffiti art, murals, propaganda posters, jazz music, and poetry')
INSERT INTO Course VALUES('D2345','Charting Current Controversies','How do you get people to listen to your opinion on topics that matter to you? In Charting Current Controversies, students develop sound arguments and informed opinions using a wide variety of resources from digital texts and videos to books and magazines')
INSERT INTO Course VALUES('C8767','Investigating Science through Story','Science literacy is an important component of lifelong science learning, sense making, and critique. How do we make complex and current science content relevant, accessible, and personal?')
INSERT INTO Course VALUES('E2345','Mining Personal Histories','How do social and cultural influences shape our lives? In this course, students will read, analyze, discuss, and write nonfiction; they will craft nonfiction stories of people in their community; and they will present those stories to the world.')
INSERT INTO Course VALUES('V3345','Picking Up the Clues','How do writers and film directors bring readers and audiences to the edge of their seats, making them want to read and watch on? Picking Up the Clues exposes students to the work of Edgar Allan Poe, unlocking strategies for approaching challenging texts and revealing how Poe’s work has influenced suspense-filled genres today. ')
INSERT INTO Course VALUES('T43323','Earth Processes: The Basis for Life','Natural forces are continually transforming the materials of the Earth’s crust from one rock type to another. Physical properties and appearance of the rock give clues to its geological history. ')
INSERT INTO Course VALUES('Q1232','Environmental Health','From farms to cities, environmental contaminants impact ecosystem and human health. In this course, students explore a field of biology that affects all of us, and investigate the following question: How can we use plants and other living things to remove toxins from our environment?')
INSERT INTO Course VALUES('X4546','Changing Communities and Population','Due to human actions, both intentional and accidental, ecosystems around the world are changing rapidly. This unit considers the complexities of patterns in populations of organisms within a community. Students will investigate factors that determine whether populations grow or decline, as well as when these changes become an environmental concern.')
INSERT INTO Course VALUES('CA3445','The Ecological Impacts of Climate Change','In this course, students investigate the question: What are the ecological impacts of climate change? Students use online citizen science databases, Geographic Information System (GIS), and field and wet lab activities to investigate the ecological impacts of climate change and understand the tools and practices scientists used to study climate change. ')


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

INSERT INTO Account VALUES('Lena','Smith','Ha Noi',1,1,0126521478,'CLsmith','gnzLDuqKcGxMNKFokfhOew==','CL')
INSERT INTO Account VALUES('Nicol','Green','Hai Phong',1,2,0136521478,'CMgreen','gnzLDuqKcGxMNKFokfhOew==','CM')
INSERT INTO Account VALUES('Tom','Taylor','Ha Noi',2,1,0126521478,'CLtaylor','gnzLDuqKcGxMNKFokfhOew==','CL')
INSERT INTO Account VALUES('Paul','Miller','Hai Phong',2,2,0136521478,'CMmiller','gnzLDuqKcGxMNKFokfhOew==','CM')
INSERT INTO Account VALUES('Ailen','Lee','Ha Noi',3,1,0126521478,'CLlee','gnzLDuqKcGxMNKFokfhOew==','CL')
INSERT INTO Account VALUES('David','King','Hai Phong',3,2,0136521478,'CMking','gnzLDuqKcGxMNKFokfhOew==','CM')
INSERT INTO Account VALUES('Brad','Feld','Ha Noi',3,3,0126521478,'PVCfeld','gnzLDuqKcGxMNKFokfhOew==','PVC')
INSERT INTO Account VALUES('Fred','Wilson','Hai Phong',3,4,0136521478,'DTLwilson','gnzLDuqKcGxMNKFokfhOew==','DTL')
INSERT INTO Account VALUES('Marissa','Mayer','Ha Noi',3,5,0126521478,'ADMmayer','gnzLDuqKcGxMNKFokfhOew==','ADM')
INSERT INTO Account VALUES('Meg','Jobs','Hai Phong',3,6,0136521478,'GUjobs','gnzLDuqKcGxMNKFokfhOew==','GU')


INSERT INTO CourseWork VALUES('C12395',1,'Lee','Wilson',GETDATE(),2015,1,41,14,'hours',1)
--INSERT INTO CourseWork VALUES('C12345',2,'Marissa','Smith',GETDATE(),2015,1,32,12,'year')
--INSERT INTO CourseWork VALUES('A1234',3,'Tom','Nicol',GETDATE(),2015,1,21,14,'months')
--INSERT INTO CourseWork VALUES('C1254',4,'Wilson','Lee',GETDATE(),2015,1,12,21,'hours')
--INSERT INTO CourseWork VALUES('D2345',6,'Lee','Nicol',GETDATE(),2015,1,22,14,'year')
--INSERT INTO CourseWork VALUES('C8767',5,'King','Mayer',GETDATE(),2015,1,21,12,'months')
--INSERT INTO CourseWork VALUES('E2345',6,'Mayer','King',GETDATE(),2015,1,43,13,'hours')
--INSERT INTO CourseWork VALUES('V3345',4,'Lee','Lena',GETDATE(),2015,1,41,22,'year')
--INSERT INTO CourseWork VALUES('T43323',5,'John','Green',GETDATE(),2015,1,46,15,'hours')
--INSERT INTO CourseWork VALUES('Q1232',3,'John','Wilson',GETDATE(),2015,1,15,14,'year')
--INSERT INTO CourseWork VALUES('X4546',1,'Marissa','Green',GETDATE(),2015,1,19,17,'months')
--INSERT INTO CourseWork VALUES('CA3445',1,'Lee','Wilson',GETDATE(),2015,1,41,12,'hours')


INSERT INTO FeedBack VALUES('johnsmith','john@gmail.com','content 1','feedback 1',GETDATE(),0)
INSERT INTO FeedBack VALUES('john','john2@gmail.com','content 2','feedback 2',GETDATE(),0)

select * from Department
select * from Staff
select * from Account where userName='ADMmayer' and password='1’ OR ‘1’ = ‘1'

select * from News
select * from CourseMonitorReport
select * from Course where courseId='A1234'


select * from CourseWork where courseId='A1234' and yearMaking=2016

select * from CourseWork where courseLeader='Lee'

select CourseWork.courseWorkId,CourseWork.yearMaking,CourseWork.semester,CourseWork.courseId,CourseWork.studentCount, Course.title,
CourseWork.createDate from CourseWork
full join Course
ON Course.courseId = CourseWork.courseId
 where CourseWork.courseWorkId = 1