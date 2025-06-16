-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: conciertos
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `info_conciertos`
--

DROP TABLE IF EXISTS `info_conciertos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info_conciertos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `lugar` varchar(200) NOT NULL,
  `foto_url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info_conciertos`
--

LOCK TABLES `info_conciertos` WRITE;
/*!40000 ALTER TABLE `info_conciertos` DISABLE KEYS */;
INSERT INTO `info_conciertos` VALUES (1,'GRANUJA Y ALI AKA','2025-09-13','16:00:00','Pigoanza','https://codigos.allticketscol.com/1749760288425_GUVFM1749759665712_UVKUO816X720GRANUJAXALINEIVA.jpg'),(2,'Festival de Agosto','2025-08-22','19:30:00','Arena Ciudad',''),(4,'Music Fest','2025-11-11','17:00:00','Bogota Plaza','http://imagepi.com/ejemplo'),(7,'FEP','2026-02-20','20:30:00','Bogota','http://example.co'),(12,'March Fest','2026-03-20','16:00:00','Medellin',NULL),(14,'Ejemplo Fest','2026-06-06','19:00:00','Cali','https://example.com.co'),(22,'Inspector','2025-06-14','19:00:00','Royal Center','https://codigos.allticketscol.com/1737415716902_CYXDF1737414657996_WBHEP816x720-2.jpg');
/*!40000 ALTER TABLE `info_conciertos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-13 14:30:38
