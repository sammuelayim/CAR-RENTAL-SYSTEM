-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2022 at 05:36 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fruit_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `addcars`
--

CREATE TABLE `addcars` (
  `id` int(11) NOT NULL,
  `carName` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `capacity` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phoneno` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`id`, `first_name`, `last_name`, `phoneno`, `gender`, `username`, `password`) VALUES
(1, 'king', 'nazir', 'MALE', '0234456789', 'kingnazir', '12345'),
(2, 'johnny', 'sins', 'MALE', '0245567890', 'johnnysins', '1234'),
(3, 'jack', 'brown', 'MALE', '0245567789', 'jackbrown', '1234'),
(4, 'k', 'k', 'FEMALE', '0234456789', 'kk', '12'),
(5, 'Obiba', 'Yaa', 'FEMALE', '024456789', 'ObibaYaa', '12345'),
(6, 'k', 'a', 'MALE', '0554871170', 's', '123'),
(7, 'karis', 'pono', 'MALE', '024432167', 'karispono360', '12345'),
(8, '', '', 'MALE', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addcars`
--
ALTER TABLE `addcars`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addcars`
--
ALTER TABLE `addcars`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
