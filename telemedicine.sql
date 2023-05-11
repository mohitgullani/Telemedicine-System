-- MySQL dump 10.10
--
-- Host: 127.0.0.1    Database: telemedicine
-- ------------------------------------------------------
-- Server version	5.0.7-beta-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Admin_ID` int(3) NOT NULL,
  `Fname` char(30) default NULL,
  `Mname` char(20) default NULL,
  `Lname` char(30) default NULL,
  `Contact` char(10) default NULL,
  `Username` varchar(30) default NULL,
  `Password` varchar(30) default NULL,
  PRIMARY KEY  (`Admin_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--


/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
LOCK TABLES `admin` WRITE;
INSERT INTO `admin` VALUES (1,'Mohit','Suresh','Gullani','9452448696','mohitgullani','Mohitmohitmohit');
UNLOCK TABLES;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `Appointment_ID` int(11) NOT NULL auto_increment,
  `Doctor_ID` int(5) default NULL,
  `Service_ID` int(5) default NULL,
  `Appointment_Status` varchar(20) default NULL,
  `Amount` int(5) default NULL,
  `Date` date default NULL,
  `Time` time default NULL,
  `Patient_ID` int(50) default NULL,
  PRIMARY KEY  (`Appointment_ID`),
  KEY `Doctor_ID` (`Doctor_ID`),
  KEY `Service_ID` (`Service_ID`),
  KEY `Patient_ID` (`Patient_ID`),
  CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`),
  CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`Service_ID`) REFERENCES `services` (`Service_ID`),
  CONSTRAINT `appointment_ibfk_3` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--


/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
LOCK TABLES `appointment` WRITE;
INSERT INTO `appointment` VALUES (1,1,1,'Accepted',50,'2022-11-14','15:00:00',1),(2,1,2,'Accepted',50,'2022-11-14','15:30:00',2),(3,2,3,'Accepted',50,'2022-11-15','15:00:00',3),(4,3,1,'Accepted',50,'2022-11-14','17:00:00',4),(5,2,3,'Accepted',100,'2022-11-24','15:00:00',1),(6,3,4,'Accepted',100,'2022-11-24','17:47:00',1),(7,3,4,'Accepted',100,'2022-11-24','18:23:00',1),(8,2,2,'Accepted',200,'2022-11-25','09:30:00',1),(9,1,3,'Accepted',300,'2022-12-26','12:00:00',11),(11,1,4,'Accepted',80,'2022-11-25','11:30:00',12),(16,2,1,'Accepted',100,'2022-11-26','12:30:00',3),(19,6,1,'Accepted',100,'2022-11-26','11:30:00',13),(20,1,1,'Accepted',100,'2022-11-28','13:30:00',1),(23,1,1,'Accepted',100,'2022-11-30','12:30:00',3),(25,1,1,'Accepted',100,'2022-12-02','13:30:00',1);
UNLOCK TABLES;
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;

--
-- Table structure for table `appointmentdeleted`
--

DROP TABLE IF EXISTS `appointmentdeleted`;
CREATE TABLE `appointmentdeleted` (
  `Patient_ID` int(3) NOT NULL default '0',
  `Doctor_ID` int(3) NOT NULL default '0',
  PRIMARY KEY  (`Patient_ID`,`Doctor_ID`),
  KEY `Doctor_ID` (`Doctor_ID`),
  CONSTRAINT `appointmentdeleted_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  CONSTRAINT `appointmentdeleted_ibfk_2` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointmentdeleted`
--


/*!40000 ALTER TABLE `appointmentdeleted` DISABLE KEYS */;
LOCK TABLES `appointmentdeleted` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `appointmentdeleted` ENABLE KEYS */;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `Doctor_ID` int(11) NOT NULL auto_increment,
  `Fname` char(25) default NULL,
  `Mname` char(25) default NULL,
  `Lname` char(25) default NULL,
  `Gender` char(2) default NULL,
  `DOB` date default NULL,
  `Contact` varchar(10) default NULL,
  `Email` varchar(50) default NULL,
  `Address` varchar(40) default NULL,
  `Username` varchar(25) default NULL,
  `Password` varchar(25) default NULL,
  `Account_Status` char(25) default NULL,
  `Meeting_Link` varchar(300) default NULL,
  PRIMARY KEY  (`Doctor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--


/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
LOCK TABLES `doctor` WRITE;
INSERT INTO `doctor` VALUES (1,'Mohit','K','Gullani','M','2001-03-08','4521745896','mohitg@utdallas.edu','Frankford Rd','mohitg','mohitg741258','Activated',NULL),(2,'Aadi','M','Jain','M','2000-03-18','4444444444','aaadiss@utdallas.edu','Northside Apt','aadijain','aadi4444','Activated',NULL),(3,'Aditya','K','Veer','M','1999-05-18','5444444444','adityav@utdallas.edu','Frankford Rd','adityaveer','aditya456','Activated',NULL),(4,'Saloni','K','Kalra','F','1994-06-21','0412547854','sk@utdallas.edu','Marquis','salonikalra','sk1245','Activated',NULL),(5,'Saloni','G','Gupta','F','1995-01-01','4125632541','salonigupta@gmail.com','7447 Frankford Rd','salonigupta','saloni123','Activated','https://www.youtube.com/watch?v=XneHBxjMg_Y&ab_channel=NetflixIndia'),(6,'Utkarsh','','Farkya','NA','1998-12-28','4152637485','utkarshfarkya@gmail.com','4125 Northside Apt','utkarsh','utkarsh','Activated','https://us04web.zoom.us/j/9516321324?pwd=VnBSOVhiRUR6RkJoeElBZS82a211Zz09 ');
UNLOCK TABLES;
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;

--
-- Table structure for table `doctor_provide_services`
--

DROP TABLE IF EXISTS `doctor_provide_services`;
CREATE TABLE `doctor_provide_services` (
  `Doctor_ID` int(3) NOT NULL default '0',
  `Service_ID` int(3) NOT NULL default '0',
  PRIMARY KEY  (`Doctor_ID`,`Service_ID`),
  KEY `Service_ID` (`Service_ID`),
  CONSTRAINT `doctor_provide_services_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`),
  CONSTRAINT `doctor_provide_services_ibfk_2` FOREIGN KEY (`Service_ID`) REFERENCES `services` (`Service_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_provide_services`
--


/*!40000 ALTER TABLE `doctor_provide_services` DISABLE KEYS */;
LOCK TABLES `doctor_provide_services` WRITE;
INSERT INTO `doctor_provide_services` VALUES (1,1),(1,2),(2,3),(3,4),(3,5);
UNLOCK TABLES;
/*!40000 ALTER TABLE `doctor_provide_services` ENABLE KEYS */;

--
-- Table structure for table `no_of_services_taken_by_patient`
--

DROP TABLE IF EXISTS `no_of_services_taken_by_patient`;

--
-- Table structure for table `number_of_appointments_per_day`
--

DROP TABLE IF EXISTS `number_of_appointments_per_day`;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `Patient_ID` int(11) NOT NULL auto_increment,
  `Fname` char(25) default NULL,
  `Mname` char(25) default NULL,
  `Lname` char(25) default NULL,
  `Gender` char(2) default NULL,
  `DOB` date default NULL,
  `Contact` varchar(10) default NULL,
  `Email` varchar(50) default NULL,
  `Address` varchar(40) default NULL,
  `Username` varchar(25) default NULL,
  `Password` varchar(25) default NULL,
  `Account_Status` char(25) default NULL,
  PRIMARY KEY  (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--


/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
LOCK TABLES `patient` WRITE;
INSERT INTO `patient` VALUES (1,'Raj','0','Gupta','M','1999-03-12','7412547854','raigupta@utdallas.edu','7421 Frankford Road','rajgupta','raj74125','Activated'),(2,'Aman','R','Gupta','M','2000-03-12','4412547854','amangpta@utdallas.edu','75 Frankford Road','amangupta','aman74125','Activated'),(3,'Shreya',NULL,'Madison','F','1998-05-18','4745547854','shreyam@utdallas.edu','41 Coit Road','shreya1','shreya1245','Activated'),(4,'Anshul',NULL,'Mourya','M','2000-06-08','4125478569','anshulmourya@utdallas.edu','41 Northside Road','Anshul','anshul45','Deactivated'),(5,'Sai','K','Pratiyush','M','1992-04-30','4125478569','saikumar@utdallas.edu','Northside','saiprat','sai741258','Activated'),(9,'Aadi','M','Gupta','NA','2000-03-16','4521411120','aadia@gmail.com','7421 FRD','aadigupta','aadigupta123','Activated'),(11,'Jay','','Gupta','NA','2022-11-09','4141452633','jishijsdgg@gmail.com','7458965415','jay145','jay145','Activated'),(12,'charchit','cc','maratha','NA','2022-11-16','4125478569','charchitgupta@gmail.com','jvhu8g8t8','cc','cc123','Activated'),(13,'Charchit','C','Gupta','M','1976-12-28','9114567845','charchitgupta542@gmail.com','7421 Frankford Rd','charchitgupta','charchit123','Activated'),(14,'Snehil','','Vaibhav','M','2000-12-08','4125745896','snehilvaibhav@gmail.com','7421 Frankford Rd','snehil','Snehil','Activated');
UNLOCK TABLES;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment` (
  `Payment_ID` int(11) NOT NULL auto_increment,
  `Doctor_ID` int(5) default NULL,
  `Patient_ID` int(5) default NULL,
  `Service_ID` int(5) default NULL,
  `Amount` int(5) default NULL,
  `Payment_Status` varchar(20) default NULL,
  `User_ID` int(5) default NULL,
  `Appointment_ID` int(3) default NULL,
  PRIMARY KEY  (`Payment_ID`),
  KEY `Doctor_ID` (`Doctor_ID`),
  KEY `Patient_ID` (`Patient_ID`),
  KEY `Service_ID` (`Service_ID`),
  KEY `User_ID` (`User_ID`),
  KEY `Appointment_ID` (`Appointment_ID`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctor` (`Doctor_ID`),
  CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  CONSTRAINT `payment_ibfk_3` FOREIGN KEY (`Service_ID`) REFERENCES `services` (`Service_ID`),
  CONSTRAINT `payment_ibfk_4` FOREIGN KEY (`User_ID`) REFERENCES `user` (`User_ID`),
  CONSTRAINT `payment_ibfk_5` FOREIGN KEY (`Appointment_ID`) REFERENCES `appointment` (`Appointment_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--


/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
LOCK TABLES `payment` WRITE;
INSERT INTO `payment` VALUES (5,1,1,1,50,'Approved',3,1),(6,1,2,2,50,'Approved',3,2),(7,6,13,1,100,'Approved',6,19),(8,2,3,3,50,'Approved',6,3),(9,3,4,1,50,'Approved',3,4),(10,2,1,3,100,'Approved',3,5),(11,3,1,4,100,'Approved',3,6),(12,2,1,2,200,'Approved',3,8),(13,3,1,4,100,'Approved',3,7),(14,1,12,4,80,'Approved',3,11);
UNLOCK TABLES;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
CREATE TABLE `services` (
  `Service_ID` int(11) NOT NULL auto_increment,
  `Amount` int(5) default NULL,
  `Service_Name` varchar(40) default NULL,
  PRIMARY KEY  (`Service_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--


/*!40000 ALTER TABLE `services` DISABLE KEYS */;
LOCK TABLES `services` WRITE;
INSERT INTO `services` VALUES (1,100,'Blood Test'),(2,200,'X-Ray'),(3,300,'CT Scan'),(4,80,'Covid Vaccination'),(5,50,'Flue Shot');
UNLOCK TABLES;
/*!40000 ALTER TABLE `services` ENABLE KEYS */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `User_ID` int(11) NOT NULL auto_increment,
  `Fname` char(25) default NULL,
  `Mname` char(25) default NULL,
  `Lname` char(25) default NULL,
  `Email` varchar(50) default NULL,
  `Contact` varchar(10) default NULL,
  `Account_Status` char(25) default NULL,
  `Username` varchar(25) default NULL,
  `Password` varchar(25) default NULL,
  PRIMARY KEY  (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--


/*!40000 ALTER TABLE `user` DISABLE KEYS */;
LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (3,'Jay','K','Jain','jayjain@uttdallas.edu','9745214586','Activated','jayjain','jaijain123'),(4,'Jay','M','Mital','jaymital@uttdallas.edu','7412589635','Activated','jaymittal','jaimittal'),(5,'Rahul',NULL,'Choudary','rahulchoudary41@uttdallas.edu','7412547856','Activated','rahulrahul','rahul12387'),(6,'Aadi',NULL,'Surana','aadisurana@utdallas.edu','4444444446','Activated','aadisurana','412574aadi');
UNLOCK TABLES;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

--
-- View structure for view `no_of_services_taken_by_patient`
--

DROP VIEW IF EXISTS `no_of_services_taken_by_patient`;
CREATE ALGORITHM=UNDEFINED VIEW `telemedicine`.`no_of_services_taken_by_patient` AS (select `a`.`Service_ID` AS `Service_ID`,count(0) AS `count(*)` from `telemedicine`.`appointment` `a` join `telemedicine`.`services` `s` where (`s`.`Service_ID` = `a`.`Service_ID`) group by `a`.`Service_ID`);

--
-- View structure for view `number_of_appointments_per_day`
--

DROP VIEW IF EXISTS `number_of_appointments_per_day`;
CREATE ALGORITHM=UNDEFINED VIEW `telemedicine`.`number_of_appointments_per_day` AS (select `telemedicine`.`appointment`.`Date` AS `Date`,count(0) AS `count(*)` from `telemedicine`.`appointment` group by `telemedicine`.`appointment`.`Date`);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

