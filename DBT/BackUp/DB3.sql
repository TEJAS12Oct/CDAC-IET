-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: db3
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `a`
--

DROP TABLE IF EXISTS `a`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `a` (
  `ID` int NOT NULL,
  `eName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `a`
--

LOCK TABLES `a` WRITE;
/*!40000 ALTER TABLE `a` DISABLE KEYS */;
INSERT INTO `a` VALUES (1,'Tejas'),(2,'MAYUR'),(6,'PANKAJ'),(7,'RAM'),(9,'ANIKET'),(10,'RUCHITA'),(12,'SHAM');
/*!40000 ALTER TABLE `a` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `a1`
--

DROP TABLE IF EXISTS `a1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `a1` (
  `id` int DEFAULT NULL,
  `eName` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `a1`
--

LOCK TABLES `a1` WRITE;
/*!40000 ALTER TABLE `a1` DISABLE KEYS */;
/*!40000 ALTER TABLE `a1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `a2`
--

DROP TABLE IF EXISTS `a2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `a2` (
  `id` int DEFAULT NULL,
  `ename` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `a2`
--

LOCK TABLES `a2` WRITE;
/*!40000 ALTER TABLE `a2` DISABLE KEYS */;
INSERT INTO `a2` VALUES (1,'TEjas'),(2,'TEjas'),(1,'TEjas');
/*!40000 ALTER TABLE `a2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `empid` int DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  KEY `empid` (`empid`),
  CONSTRAINT `address_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `emp` (`empID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'pune');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `b`
--

DROP TABLE IF EXISTS `b`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `b` (
  `ID` int NOT NULL,
  `eName` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`,`eName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `b`
--

LOCK TABLES `b` WRITE;
/*!40000 ALTER TABLE `b` DISABLE KEYS */;
INSERT INTO `b` VALUES (1,'RAM'),(1,'Tejas'),(2,'MAYUR'),(3,'MAYUR');
/*!40000 ALTER TABLE `b` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept` (
  `deptID` int NOT NULL,
  `dName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`deptID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES (10,'HR'),(20,'Sales'),(30,'MARKETING');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `empID` int NOT NULL,
  `empName` varchar(10) DEFAULT NULL,
  `dNo` int DEFAULT NULL,
  PRIMARY KEY (`empID`),
  KEY `fk_deptNo` (`dNo`),
  CONSTRAINT `fk_deptNo` FOREIGN KEY (`dNo`) REFERENCES `dept` (`deptID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (1,'MAYUR',10),(2,'PANKAJ',10),(3,'Tejas',NULL),(4,'RAM',NULL),(5,'Ruchita',30);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phone`
--

DROP TABLE IF EXISTS `phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phone` (
  `empID` int DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  KEY `empID` (`empID`),
  CONSTRAINT `phone_ibfk_1` FOREIGN KEY (`empID`) REFERENCES `emp` (`empID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone`
--

LOCK TABLES `phone` WRITE;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `u`
--

DROP TABLE IF EXISTS `u`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `u` (
  `ID` int NOT NULL,
  `EName` varchar(10) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `u`
--

LOCK TABLES `u` WRITE;
/*!40000 ALTER TABLE `u` DISABLE KEYS */;
/*!40000 ALTER TABLE `u` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `u1`
--

DROP TABLE IF EXISTS `u1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `u1` (
  `ID` int NOT NULL,
  `EName` varchar(10) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `u1`
--

LOCK TABLES `u1` WRITE;
/*!40000 ALTER TABLE `u1` DISABLE KEYS */;
INSERT INTO `u1` VALUES (1,'Tejas','12345678'),(2,'Tejas','12345678');
/*!40000 ALTER TABLE `u1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `u2`
--

DROP TABLE IF EXISTS `u2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `u2` (
  `ID` int NOT NULL,
  `EName` varchar(10) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `u2`
--

LOCK TABLES `u2` WRITE;
/*!40000 ALTER TABLE `u2` DISABLE KEYS */;
/*!40000 ALTER TABLE `u2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-08 16:13:36
