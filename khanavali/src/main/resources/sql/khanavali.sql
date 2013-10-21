CREATE DATABASE  IF NOT EXISTS `khanavali` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `khanavali`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: khanavali
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `addressId` bigint(20) NOT NULL,
  `line1` varchar(45) DEFAULT NULL,
  `line2` varchar(45) DEFAULT NULL,
  `postcode` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `categoryId` int(11) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `categoryDescription` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerId` bigint(20) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `middleName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  `emailId` varchar(45) DEFAULT NULL,
  `phoneNumber` varchar(45) DEFAULT NULL,
  `mobileNumber` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `blacklisted` tinyint(1) DEFAULT NULL,
  `addressId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`customerId`),
  KEY `customer-address_idx` (`addressId`),
  CONSTRAINT `customer-address` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discountcodes`
--

DROP TABLE IF EXISTS `discountcodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discountcodes` (
  `discountCodeId` int(11) NOT NULL,
  `discountCode` varchar(45) DEFAULT NULL,
  `discountPercent` double DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `dateFrom` date DEFAULT NULL,
  `dateTo` date DEFAULT NULL,
  PRIMARY KEY (`discountCodeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discountcodes`
--

LOCK TABLES `discountcodes` WRITE;
/*!40000 ALTER TABLE `discountcodes` DISABLE KEYS */;
/*!40000 ALTER TABLE `discountcodes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discounts`
--

DROP TABLE IF EXISTS `discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discounts` (
  `discountId` int(11) NOT NULL,
  `discountCountId` int(11) DEFAULT NULL,
  `dishId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`discountId`),
  KEY `discount-code_idx` (`discountCountId`),
  KEY `discount-dish_idx` (`dishId`),
  CONSTRAINT `discount-code` FOREIGN KEY (`discountCountId`) REFERENCES `discountcodes` (`discountCodeId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `discount-dish` FOREIGN KEY (`dishId`) REFERENCES `dish` (`dishId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discounts`
--

LOCK TABLES `discounts` WRITE;
/*!40000 ALTER TABLE `discounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dish`
--

DROP TABLE IF EXISTS `dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish` (
  `dishId` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `shortDescription` varchar(45) DEFAULT NULL,
  `longDescription` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `minPortions` int(11) DEFAULT NULL,
  `portionSize` int(11) DEFAULT NULL,
  `portionIncrement` int(11) DEFAULT NULL,
  `imageUrl` varchar(100) DEFAULT NULL,
  `categoryId` int(11) DEFAULT NULL,
  `portionTypeId` int(11) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`dishId`),
  KEY `dish-portion_idx` (`portionTypeId`),
  KEY `dish-category_idx` (`categoryId`),
  CONSTRAINT `dish-category` FOREIGN KEY (`categoryId`) REFERENCES `category` (`categoryId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `dish-portion` FOREIGN KEY (`portionTypeId`) REFERENCES `portiontypes` (`portionTypeId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish`
--

LOCK TABLES `dish` WRITE;
/*!40000 ALTER TABLE `dish` DISABLE KEYS */;
INSERT INTO `dish` VALUES (9,'Kesari bath','Sweet sooji halwa','Roasted rava and sweetened',20,1,1,1,'http://localhost:8080/images/001.png',NULL,NULL,1),(10,'Idli','Steamed rice cakes','Steamed rice cakes',20,1,1,1,'http://localhost:8080/images/002.png',NULL,NULL,1),(11,'Vada','Fied lentil cakes','Fried lentil cakes',20,1,1,1,'http://localhost:8080/images/003.png',NULL,NULL,1),(12,'Khara bath','Savoury sooji halwa','Roasted rava and spiced',20,1,1,1,'http://localhost:8080/images/004.png',NULL,NULL,1);
/*!40000 ALTER TABLE `dish` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dishrelations`
--

DROP TABLE IF EXISTS `dishrelations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dishrelations` (
  `dishRelationId` int(11) NOT NULL,
  `dishId` bigint(20) DEFAULT NULL,
  `relatedDishId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`dishRelationId`),
  KEY `dish-relateddish_idx` (`dishId`),
  KEY `dish-relatedef_idx` (`relatedDishId`),
  CONSTRAINT `dish-relateddish` FOREIGN KEY (`dishId`) REFERENCES `dish` (`dishId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `dish-relatedef` FOREIGN KEY (`relatedDishId`) REFERENCES `dish` (`dishId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dishrelations`
--

LOCK TABLES `dishrelations` WRITE;
/*!40000 ALTER TABLE `dishrelations` DISABLE KEYS */;
/*!40000 ALTER TABLE `dishrelations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `orderId` varchar(100) NOT NULL,
  `correlationId` varchar(100) DEFAULT NULL,
  `customerId` bigint(20) DEFAULT NULL,
  `itemId` bigint(20) DEFAULT NULL,
  `orderPrice` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `parentOrder` tinyint(1) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `customer_idx` (`customerId`),
  KEY `item_idx` (`itemId`),
  KEY `selfcorrelation_idx` (`correlationId`),
  CONSTRAINT `customer-order` FOREIGN KEY (`customerId`) REFERENCES `customer` (`customerId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `item-order` FOREIGN KEY (`itemId`) REFERENCES `dish` (`dishId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `selfcorrelation-order` FOREIGN KEY (`correlationId`) REFERENCES `order` (`orderId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portiontypes`
--

DROP TABLE IF EXISTS `portiontypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portiontypes` (
  `portionTypeId` int(11) NOT NULL,
  `portionType` int(11) DEFAULT NULL,
  `portionTypeDescription` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`portionTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portiontypes`
--

LOCK TABLES `portiontypes` WRITE;
/*!40000 ALTER TABLE `portiontypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `portiontypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tagdefinition`
--

DROP TABLE IF EXISTS `tagdefinition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tagdefinition` (
  `tagDefinitionId` int(11) NOT NULL,
  `tag` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tagDefinitionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tagdefinition`
--

LOCK TABLES `tagdefinition` WRITE;
/*!40000 ALTER TABLE `tagdefinition` DISABLE KEYS */;
/*!40000 ALTER TABLE `tagdefinition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tags`
--

DROP TABLE IF EXISTS `tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tags` (
  `tagId` int(11) NOT NULL,
  `dishId` bigint(20) DEFAULT NULL,
  `tagDefinitionId` int(11) DEFAULT NULL,
  PRIMARY KEY (`tagId`),
  KEY `tag-dish_idx` (`dishId`),
  KEY `tag-tagdef_idx` (`tagDefinitionId`),
  CONSTRAINT `tag-dish` FOREIGN KEY (`dishId`) REFERENCES `dish` (`dishId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tag-tagdef` FOREIGN KEY (`tagDefinitionId`) REFERENCES `tagdefinition` (`tagDefinitionId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tags`
--

LOCK TABLES `tags` WRITE;
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-21 21:40:58
