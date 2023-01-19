CREATE DATABASE  IF NOT EXISTS `db_study2_explain` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_study2_explain`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_study2_explain
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `course_mst`
--

DROP TABLE IF EXISTS `course_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_mst` (
  `course_id` int NOT NULL,
  `student_id` int NOT NULL,
  `lecture_id` int NOT NULL,
  `instructor_id` int NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_mst`
--

LOCK TABLES `course_mst` WRITE;
/*!40000 ALTER TABLE `course_mst` DISABLE KEYS */;
INSERT INTO `course_mst` VALUES (1,1,1,1),(2,2,1,1),(3,3,2,2),(4,2,3,3);
/*!40000 ALTER TABLE `course_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructor_mst`
--

DROP TABLE IF EXISTS `instructor_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instructor_mst` (
  `instructor_id` int NOT NULL,
  `instructor_name` varchar(45) NOT NULL,
  `university_id` int DEFAULT NULL,
  PRIMARY KEY (`instructor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructor_mst`
--

LOCK TABLES `instructor_mst` WRITE;
/*!40000 ALTER TABLE `instructor_mst` DISABLE KEYS */;
INSERT INTO `instructor_mst` VALUES (1,'김준일',1),(2,'김준이',2),(3,'김준삼',3);
/*!40000 ALTER TABLE `instructor_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecture_mst`
--

DROP TABLE IF EXISTS `lecture_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecture_mst` (
  `lecture_id` int NOT NULL,
  `lecture_name` varchar(45) NOT NULL,
  `lecture_price` int NOT NULL,
  PRIMARY KEY (`lecture_id`,`lecture_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecture_mst`
--

LOCK TABLES `lecture_mst` WRITE;
/*!40000 ALTER TABLE `lecture_mst` DISABLE KEYS */;
INSERT INTO `lecture_mst` VALUES (1,'java',100000),(2,'python',80000),(3,'c',90000);
/*!40000 ALTER TABLE `lecture_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor_mst`
--

DROP TABLE IF EXISTS `mentor_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mentor_mst` (
  `mentor_id` int NOT NULL,
  `mentor_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mentor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor_mst`
--

LOCK TABLES `mentor_mst` WRITE;
/*!40000 ALTER TABLE `mentor_mst` DISABLE KEYS */;
INSERT INTO `mentor_mst` VALUES (1,'문자영'),(2,'문성현');
/*!40000 ALTER TABLE `mentor_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_mst`
--

DROP TABLE IF EXISTS `student_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_mst` (
  `student_id` int NOT NULL,
  `student_name` varchar(45) NOT NULL,
  `mentor_id` int NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_mst`
--

LOCK TABLES `student_mst` WRITE;
/*!40000 ALTER TABLE `student_mst` DISABLE KEYS */;
INSERT INTO `student_mst` VALUES (1,'김동민',1),(2,'김두영',1),(3,'장진원',2);
/*!40000 ALTER TABLE `student_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `university_mst`
--

DROP TABLE IF EXISTS `university_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `university_mst` (
  `university_id` int NOT NULL,
  `university_name` varchar(45) NOT NULL,
  PRIMARY KEY (`university_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `university_mst`
--

LOCK TABLES `university_mst` WRITE;
/*!40000 ALTER TABLE `university_mst` DISABLE KEYS */;
INSERT INTO `university_mst` VALUES (1,'서울대'),(2,'부산대'),(3,'경성대');
/*!40000 ALTER TABLE `university_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_study2_explain'
--

--
-- Dumping routines for database 'db_study2_explain'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-19 17:36:01
