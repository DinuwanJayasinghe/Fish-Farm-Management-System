-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: fishing_management_system
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `details_of_platy`
--

DROP TABLE IF EXISTS `details_of_platy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `details_of_platy` (
  `Fish_ID` varchar(45) NOT NULL,
  `Available_Varieties` varchar(45) DEFAULT NULL,
  `Size` varchar(45) DEFAULT NULL,
  `Price` varchar(45) DEFAULT NULL,
  `Availability` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Fish_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details_of_platy`
--

LOCK TABLES `details_of_platy` WRITE;
/*!40000 ALTER TABLE `details_of_platy` DISABLE KEYS */;
INSERT INTO `details_of_platy` VALUES ('P001','Black Platy','1 Inch','Rs 100.00','4'),('P002','Marigold Platy','2 Incheres','Rs 100.00','4'),('P003','Sunderst Platy','2 Incheres','Rs 100.00','4'),('P004','Sunset Platy','4 Incheres','Rs 300.00','2'),('P005','Bloodred Platy','3 Incheres','Rs200.00','4'),('P006','Sunset Platy','2 Incheres','Rs 120.00','4');
/*!40000 ALTER TABLE `details_of_platy` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-24 11:56:01
