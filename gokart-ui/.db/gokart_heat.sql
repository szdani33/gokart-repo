CREATE DATABASE  IF NOT EXISTS `gokart` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gokart`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: gokart
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `heat`
--

DROP TABLE IF EXISTS `heat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `heat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pilot_fk` int(11) NOT NULL,
  `best_lap` int(11) NOT NULL,
  `date` date NOT NULL,
  `kart_number` int(11) NOT NULL,
  `heat_number` int(11) NOT NULL,
  `laps` int(11) NOT NULL DEFAULT '0',
  `top_speed` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pilot_fk` (`pilot_fk`),
  CONSTRAINT `heat_ibfk_1` FOREIGN KEY (`pilot_fk`) REFERENCES `pilot` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heat`
--

LOCK TABLES `heat` WRITE;
/*!40000 ALTER TABLE `heat` DISABLE KEYS */;
INSERT INTO `heat` VALUES (1,1,38648,'2014-05-24',7,54,10,46.57),(2,1,38878,'2014-05-24',3,56,10,46.30),(3,1,37555,'2014-05-26',7,75,11,47.93),(4,1,37984,'2014-05-26',3,79,11,47.39),(5,1,37768,'2014-05-26',1,81,10,47.66),(6,1,37038,'2014-05-31',6,69,11,48.60),(7,1,36315,'2014-05-31',2,71,11,49.57),(8,1,36467,'2014-05-31',6,73,12,49.36),(9,1,36864,'2014-06-01',6,61,9,48.83),(10,1,36449,'2014-06-01',5,63,11,49.38),(11,1,37336,'2014-06-06',5,78,11,48.21),(12,1,38324,'2014-06-06',2,80,11,46.97),(13,1,37711,'2014-06-06',6,82,11,47.73),(14,3,38984,'2014-05-24',1,54,10,46.17),(15,3,36618,'2014-05-24',2,56,11,49.16),(16,3,36318,'2014-05-25',5,58,11,49.56),(17,3,36302,'2014-05-25',2,60,12,49.58),(18,3,38294,'2014-05-26',8,75,10,47.00),(19,3,36624,'2014-05-26',4,79,11,49.15),(20,3,37202,'2014-05-26',7,81,11,48.38),(21,3,36759,'2014-05-31',7,69,11,48.97),(22,3,37113,'2014-05-31',8,71,11,48.50),(23,3,35473,'2014-05-31',2,73,12,50.74),(24,3,36561,'2014-06-01',7,61,9,49.23),(25,3,36636,'2014-06-01',6,63,11,49.13),(26,3,37601,'2014-06-06',6,78,11,47.87),(27,3,36818,'2014-06-06',5,80,11,48.89),(28,3,38076,'2014-06-06',3,82,11,47.27),(29,2,37534,'2014-05-31',8,69,11,47.96),(30,2,36224,'2014-05-31',5,71,12,49.69),(31,2,36900,'2014-05-31',8,73,12,48.78);
/*!40000 ALTER TABLE `heat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-09  0:40:55