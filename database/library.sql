-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `books` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(40) NOT NULL,
  `author` char(40) NOT NULL,
  `owner` char(40) DEFAULT NULL,
  `rent_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `is_available` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Suc ve Ceza','Dostoevsky',NULL,NULL,NULL,1),(2,'Kürk Mantolu Madonna','Sabahattin Ali',NULL,NULL,NULL,1),(3,'Aya Yolculuk','Jules Verne','2','2017-12-21','2018-01-21',0),(4,'Simyacı','Paulo Coelh',NULL,NULL,NULL,1),(5,'1984','George Orwell',NULL,NULL,NULL,1),(6,'Başlangıç','Dan Brown',NULL,NULL,NULL,1),(7,'Harry Potter ve Felsefe Taşı','J.K Rowling',NULL,NULL,NULL,1),(8,'Harry Potter ve Sırlar Odası','J.K Rowling',NULL,NULL,NULL,1),(9,'Harry Potter ve Azkaban Tutsağı','J.K Rowling',NULL,NULL,NULL,1),(10,'Harry Potter ve Ateş Kadehi','J.K Rowling','2','2017-12-22','2018-01-22',0),(11,'Harry Potter ve Zümrüdanka Yoldaşlığı','J.K Rowling','2','2017-12-22','2018-01-22',0),(12,'Harry Potter ve Melez Prens','J.K Rowling',NULL,NULL,NULL,1),(13,'Harry Potter ve Ölüm Yadigarları','J.K Rowling',NULL,NULL,NULL,1),(14,'Yüzüklerin Efendisi Yüzük Kardeşliği','J.R.R Tolkien',NULL,NULL,NULL,1),(15,'Yüzüklerin Efendisi İki Kule','J.R.R Tolkien',NULL,NULL,NULL,1),(16,'Yüzüklerin Efendisi Kralın Dönüşü','J.R.R Tolkien',NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(40) NOT NULL,
  `book1` char(40) DEFAULT NULL,
  `book2` char(40) DEFAULT NULL,
  `book3` char(40) DEFAULT NULL,
  `password` char(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (2,'test','Aya Yolculuk','Harry Potter ve Ateş Kadehi','Harry Potter ve Zümrüdanka Yoldaşlığı','123'),(3,'utku',NULL,NULL,NULL,'123'),(4,'eda',NULL,NULL,NULL,'123'),(5,'Mustafa Çelik',NULL,NULL,NULL,'123'),(7,'Edanur Yılmaz',NULL,NULL,NULL,'1356'),(8,'deneme',NULL,NULL,NULL,'123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-25  4:46:15
