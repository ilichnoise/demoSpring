
--
-- Host: localhost    Database: nubelity
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);





DROP TABLE IF EXISTS `detailorder`;

CREATE TABLE `detailorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idpurchaseorder` int(11) DEFAULT NULL,
  `idproduct` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);



DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--
-- Dumping data for table `product`
--


--
-- Table structure for table `purchaseorder`
--

DROP TABLE IF EXISTS `purchaseorder`;

CREATE TABLE `purchaseorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idClient` int(11) NOT NULL,
  PRIMARY KEY (`id`)
);



