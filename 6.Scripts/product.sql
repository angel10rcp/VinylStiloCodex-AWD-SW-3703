-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.6.1-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for vinylstilos
CREATE DATABASE IF NOT EXISTS `vinylstilos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `vinylstilos`;

-- Dumping structure for table vinylstilos.product
CREATE TABLE IF NOT EXISTS `product` (
  `IDPRODUCT` varchar(5) NOT NULL,
  `NAMEPRODUCT` varchar(25) DEFAULT NULL,
  `DESCRIPTIONPRODUCT` varchar(128) DEFAULT NULL,
  `IMAGEPRODUCT` varchar(64) DEFAULT NULL,
  `PRICE` decimal(6,2) DEFAULT NULL,
  `AMOUNTPRODUCT` int(11) DEFAULT NULL,
  `CATEGORY` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`IDPRODUCT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table vinylstilos.product: ~5 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`IDPRODUCT`, `NAMEPRODUCT`, `DESCRIPTIONPRODUCT`, `IMAGEPRODUCT`, `PRICE`, `AMOUNTPRODUCT`, `CATEGORY`) VALUES
	('A001', 'Almohada PawPatrol', 'Almohada de plumon de PawPatrol', 'Almohada_pawpatrol.jpg', 7.50, 3, 'almohada'),
	('A002', 'Almohada The Simpson', 'Almohada de plumon de The Simpson', 'Almohada_TheSimpson.jpg', 7.50, 3, 'almohada'),
	('A003', 'Almohada Spiderman', 'Almohada de plumon de Spiderman', 'Almohada_Spiderman.jpg', 7.50, 3, 'almohada'),
	('A004', 'Almohada StarWars', 'Almohada de plumon de StarWars', 'Almohada_StarWars.jpg', 7.50, 3, 'almohada'),
	('L001', 'Llavero Marvel', 'Llavero de acero de Marvel', 'Llavero_Marvel', 2.50, 4, 'llavero'),
	('L002', 'Llavero Thor', 'Llavero de acero de Thor', 'Llavero_Thor', 2.50, 4, 'llavero'),
	('L003', 'Llavero Batman', 'Llavero de acero de Batman', 'Lavero_Batman', 2.50, 4, 'llavero'),
	('T001', 'Taza HarryPotter', 'Taza de porcelana de Harry Potter', 'taza_harrypotter.png', 5.50, 5, 'taza'),
	('T002', 'Taza CasaPapel', 'Taza de porcelana de la Casa de Papel', 'taza_casapapel.jpg', 5.50, 5, 'taza'),
	('T003', 'Taza Joker', 'Taza de porcelana del Joker', 'taza_joker.png', 5.50, 5, 'taza'),
	('T004', 'Taza StarWars', 'Taza de porcelana de StarWars', 'taza_starwars.png', 5.50, 5, 'taza');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
