-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: db2
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept` (
  `DeptNo` int DEFAULT NULL,
  `DName` varchar(10) DEFAULT NULL,
  `EmpNo` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES (10,'Sales',NULL),(20,'Purchase',NULL),(30,'Accounts',NULL),(40,'MKT',NULL);
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `empID` int DEFAULT NULL,
  `empName` varchar(10) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `Salary` float DEFAULT NULL,
  `Commission` float(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (1,'TEJAS','M',70000,1234.56),(2,'MAYUR','M',70000,1234.57),(3,'RAM','M',70000,1234.56),(4,'RUCHITA','F',60000,3333.77),(5,'SHAM','M',70000,NULL);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp1`
--

DROP TABLE IF EXISTS `emp1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp1` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `EmpName` varchar(10) NOT NULL,
  `Job` varchar(10) DEFAULT NULL,
  `City` varchar(10) DEFAULT 'Pune',
  `Salary` int DEFAULT NULL,
  `Commission` float DEFAULT NULL,
  `Total` float(10,2) GENERATED ALWAYS AS ((`Salary` + `Commission`)) VIRTUAL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `emp1_chk_1` CHECK ((`Salary` >= 5000))
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp1`
--

LOCK TABLES `emp1` WRITE;
/*!40000 ALTER TABLE `emp1` DISABLE KEYS */;
INSERT INTO `emp1` (`ID`, `EmpName`, `Job`, `City`, `Salary`, `Commission`) VALUES (1,'Tejas','Manager','Pune',7000,231.41),(2,'Mayur','Manager','Pune',6000,231.41),(3,'Ruchita','Marketing','Pune',5700,231.41),(4,'Aniket','Salesman','Pune',6300,231.41),(5,'Pankaj','HR','Pune',6700,231.41),(101,'RAM','IT','Pune',6400,231.41),(102,'SHAM','Finance','Pune',6500,231.41),(103,'Athrav','IT','Pune',6900,231.41),(104,'Akshay','IT','Pune',7000,231.41);
/*!40000 ALTER TABLE `emp1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login2`
--

DROP TABLE IF EXISTS `login2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login2` (
  `loginId` int DEFAULT NULL,
  `loginName` varchar(20) DEFAULT NULL,
  `password` varbinary(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login2`
--

LOCK TABLES `login2` WRITE;
/*!40000 ALTER TABLE `login2` DISABLE KEYS */;
INSERT INTO `login2` VALUES (1,'TEJA',_binary 'TEJAS');
/*!40000 ALTER TABLE `login2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mathop`
--

DROP TABLE IF EXISTS `mathop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mathop` (
  `X` int DEFAULT NULL,
  `y` int DEFAULT NULL,
  `Sum` int GENERATED ALWAYS AS ((`X` + `y`)) VIRTUAL,
  `Substract` int GENERATED ALWAYS AS ((`X` - `y`)) VIRTUAL,
  `Multiply` int GENERATED ALWAYS AS ((`X` * `y`)) VIRTUAL,
  `Division` float GENERATED ALWAYS AS ((`X` / `y`)) VIRTUAL,
  `Percentage` int GENERATED ALWAYS AS ((`Division` * 100)) VIRTUAL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mathop`
--

LOCK TABLES `mathop` WRITE;
/*!40000 ALTER TABLE `mathop` DISABLE KEYS */;
INSERT INTO `mathop` (`X`, `y`) VALUES (10,20),(30,70),(25,75),(15,30);
/*!40000 ALTER TABLE `mathop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mathop1`
--

DROP TABLE IF EXISTS `mathop1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mathop1` (
  `X` int DEFAULT NULL,
  `Y` int DEFAULT NULL,
  `Sum` int GENERATED ALWAYS AS ((`X` + `Y`)) VIRTUAL,
  `DiFF` int GENERATED ALWAYS AS ((`X` - `Y`)) VIRTUAL,
  `Multiply` int GENERATED ALWAYS AS ((`X` * `Y`)) VIRTUAL,
  `DIVISION` float GENERATED ALWAYS AS ((`X` / `Y`)) VIRTUAL,
  `Percentage` float GENERATED ALWAYS AS ((`DIVISION` * 100)) VIRTUAL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mathop1`
--

LOCK TABLES `mathop1` WRITE;
/*!40000 ALTER TABLE `mathop1` DISABLE KEYS */;
INSERT INTO `mathop1` (`X`, `Y`) VALUES (10,20),(30,40),(40,90);
/*!40000 ALTER TABLE `mathop1` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-23 14:43:59
