-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2021 at 05:15 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop_btl_qlmt_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `may_tinh`
--

CREATE TABLE `may_tinh` (
  `so_hieu` int(11) NOT NULL,
  `ten` varchar(256) COLLATE utf8_vietnamese_ci NOT NULL,
  `xuat_xu` varchar(256) COLLATE utf8_vietnamese_ci NOT NULL,
  `nam_nhap` int(11) NOT NULL,
  `cau_hinh` varchar(256) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `may_tinh`
--

INSERT INTO `may_tinh` (`so_hieu`, `ten`, `xuat_xu`, `nam_nhap`, `cau_hinh`) VALUES
(2, 'Apple MacBook Pro M1', 'Nhập khẩu', 2021, 'Rất mạnh'),
(3, 'Dell XPS 15', 'N?i ??a', 2021, 'M?nh');

-- --------------------------------------------------------

--
-- Table structure for table `phong_hoc`
--

CREATE TABLE `phong_hoc` (
  `ma_phong` int(11) NOT NULL,
  `ten_phong` varchar(256) COLLATE utf8_vietnamese_ci NOT NULL,
  `so_may` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `phong_hoc`
--

INSERT INTO `phong_hoc` (`ma_phong`, `ten_phong`, `so_may`) VALUES
(1, 'P402-A3', 20),
(2, 'P504-A3', 30);

-- --------------------------------------------------------

--
-- Table structure for table `ql_may_tinh`
--

CREATE TABLE `ql_may_tinh` (
  `so_hieu` int(11) NOT NULL,
  `ma_phong` int(11) NOT NULL,
  `so_luong` int(11) NOT NULL,
  `tinh_trang` varchar(256) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `ql_may_tinh`
--

INSERT INTO `ql_may_tinh` (`so_hieu`, `ma_phong`, `so_luong`, `tinh_trang`) VALUES
(2, 1, 12, 'Mới'),
(3, 1, 8, 'Mới');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `may_tinh`
--
ALTER TABLE `may_tinh`
  ADD PRIMARY KEY (`so_hieu`);

--
-- Indexes for table `phong_hoc`
--
ALTER TABLE `phong_hoc`
  ADD PRIMARY KEY (`ma_phong`);

--
-- Indexes for table `ql_may_tinh`
--
ALTER TABLE `ql_may_tinh`
  ADD PRIMARY KEY (`so_hieu`,`ma_phong`),
  ADD KEY `ma_phong` (`ma_phong`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `may_tinh`
--
ALTER TABLE `may_tinh`
  MODIFY `so_hieu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `phong_hoc`
--
ALTER TABLE `phong_hoc`
  MODIFY `ma_phong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ql_may_tinh`
--
ALTER TABLE `ql_may_tinh`
  ADD CONSTRAINT `ql_may_tinh_ibfk_1` FOREIGN KEY (`ma_phong`) REFERENCES `phong_hoc` (`ma_phong`),
  ADD CONSTRAINT `ql_may_tinh_ibfk_2` FOREIGN KEY (`so_hieu`) REFERENCES `may_tinh` (`so_hieu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
