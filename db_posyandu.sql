-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2023 at 07:18 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_posyandu`
--

-- --------------------------------------------------------

--
-- Table structure for table `bayi`
--

CREATE TABLE `bayi` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `nama_ibu` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bidan`
--

CREATE TABLE `bidan` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `pendidikan terakhir` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ibu_hamil`
--

CREATE TABLE `ibu_hamil` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `gol_darah` varchar(2) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `nama_suami` varchar(50) NOT NULL,
  `tempat_lahir _suami` varchar(50) NOT NULL,
  `tanggal_lahir_suami` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `imunisasi`
--

CREATE TABLE `imunisasi` (
  `id` int(11) NOT NULL,
  `Id_bayi` int(11) NOT NULL,
  `tanggal_imunisasi` date NOT NULL,
  `usia` int(5) NOT NULL,
  `jenis_imunisasi` varchar(50) NOT NULL,
  `jenis_vitamin` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kader`
--

CREATE TABLE `kader` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `pendidikan terakhir` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pemeriksaan_ibu_hamil`
--

CREATE TABLE `pemeriksaan_ibu_hamil` (
  `id` int(11) NOT NULL,
  `id_ibu_hamil` int(11) NOT NULL,
  `usia_kandungan` int(5) NOT NULL,
  `hamil_ke` int(5) NOT NULL,
  `riwayat_penyakit` varchar(50) NOT NULL,
  `bb` int(5) NOT NULL,
  `tb` int(5) NOT NULL,
  `deteksi` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penimbangan`
--

CREATE TABLE `penimbangan` (
  `id` int(11) NOT NULL,
  `Id_bayi` int(11) NOT NULL,
  `tanggal_timbang` date NOT NULL,
  `bb` int(5) NOT NULL,
  `tb` int(5) NOT NULL,
  `deteksi` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bayi`
--
ALTER TABLE `bayi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bidan`
--
ALTER TABLE `bidan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ibu_hamil`
--
ALTER TABLE `ibu_hamil`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `imunisasi`
--
ALTER TABLE `imunisasi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Id_bayi` (`Id_bayi`);

--
-- Indexes for table `kader`
--
ALTER TABLE `kader`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pemeriksaan_ibu_hamil`
--
ALTER TABLE `pemeriksaan_ibu_hamil`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ibu_hamil` (`id_ibu_hamil`);

--
-- Indexes for table `penimbangan`
--
ALTER TABLE `penimbangan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Id_bayi` (`Id_bayi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `imunisasi`
--
ALTER TABLE `imunisasi`
  ADD CONSTRAINT `imunisasi_ibfk_1` FOREIGN KEY (`Id_bayi`) REFERENCES `bayi` (`id`);

--
-- Constraints for table `pemeriksaan_ibu_hamil`
--
ALTER TABLE `pemeriksaan_ibu_hamil`
  ADD CONSTRAINT `pemeriksaan_ibu_hamil_ibfk_1` FOREIGN KEY (`id_ibu_hamil`) REFERENCES `ibu_hamil` (`id`);

--
-- Constraints for table `penimbangan`
--
ALTER TABLE `penimbangan`
  ADD CONSTRAINT `penimbangan_ibfk_1` FOREIGN KEY (`Id_bayi`) REFERENCES `bayi` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
