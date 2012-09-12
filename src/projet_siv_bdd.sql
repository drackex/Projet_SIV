-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mer 12 Septembre 2012 à 08:06
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `projet_siv`
--

-- --------------------------------------------------------

--
-- Structure de la table `pdf`
--

CREATE TABLE IF NOT EXISTS `pdf` (
  `id` int(20) NOT NULL,
  `immatriculation` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT 'no d''immatriculation du véhicule',
  `date_imp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'date d''impression',
  `date_gene` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT 'date de génération du document',
  `impression` tinyint(1) NOT NULL COMMENT 'statut de l''impression: 1=imprimé 0=non imprimé',
  PRIMARY KEY (`immatriculation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
