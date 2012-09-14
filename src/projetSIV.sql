-- phpMyAdmin SQL Dump
-- version 3.3.10deb1
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Ven 14 Septembre 2012 à 15:18
-- Version du serveur: 5.1.62
-- Version de PHP: 5.3.5-1ubuntu7.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `projetSIV`
--

-- --------------------------------------------------------

--
-- Structure de la table `archive`
--

CREATE TABLE IF NOT EXISTS `archive` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nid` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `marque` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `label` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `version` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `genreNat` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `couleur` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `exploitation_agricole` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dateCertif` date NOT NULL,
  `date1erImmat` date NOT NULL,
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `prenom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `addr` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`,`Nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Contenu de la table `archive`
--


-- --------------------------------------------------------

--
-- Structure de la table `en_attente`
--

CREATE TABLE IF NOT EXISTS `en_attente` (
  `id` int(11) NOT NULL,
  `Nid` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `marque` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `label` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `version` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `genreNat` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `couleur` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `exploitation_agricole` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dateCertif` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `date1erImmat` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `prenom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `addr` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`,`Nid`),
  KEY `Nid` (`Nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `en_attente`
--

INSERT INTO `en_attente` (`id`, `Nid`, `marque`, `label`, `version`, `genreNat`, `couleur`, `exploitation_agricole`, `dateCertif`, `date1erImmat`, `nom`, `prenom`, `addr`) VALUES
(1, 'AA-452-QQ', 'renault', 'fuck', 'm16', 'fr', 'bleu', 'non', '2012-09-14 00:00:00', '2012-09-13 00:00:00', 'toto', 'tutu', '25 chemin des anglais 59000 Lille');
