-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 09, 2024 at 01:50 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis_penangan`
--

CREATE TABLE `jenis_penangan` (
  `jenis_penangan` varchar(255) DEFAULT NULL,
  `harga` decimal(20,6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` char(11) NOT NULL,
  `nama_obat` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `jenis_obat` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `jenis_penyakit` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `stok` char(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `harga_obat` decimal(20,6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int NOT NULL,
  `NoIdentitas` varchar(20) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `identitas` varchar(255) DEFAULT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `jk` char(10) DEFAULT NULL,
  `no_telp` char(20) DEFAULT NULL,
  `no_wali` char(20) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `riwayat_penyakit` text,
  `gol_darah` char(5) DEFAULT NULL,
  `alergi_obat` text,
  `update_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `NoIdentitas`, `nama`, `identitas`, `jurusan`, `jk`, `no_telp`, `no_wali`, `alamat`, `riwayat_penyakit`, `gol_darah`, `alergi_obat`, `update_at`, `created_at`) VALUES
(1, '231', 'Coba', 'SADAD', 'KOMPUTER', 'Dosen', '123124', '123123', 'ASDAS', 'Laki-Laki', 'D', 'ASDA', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `penangan`
--

CREATE TABLE `penangan` (
  `id_penanganan` int NOT NULL,
  `id_user` int NOT NULL,
  `id_pasien` int NOT NULL,
  `jenis_penangan` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '',
  `diagnosa` text NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rekap_obat`
--

CREATE TABLE `rekap_obat` (
  `id_obat` char(11) DEFAULT NULL,
  `id_penangan` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `name`, `password`, `create_at`, `update_at`) VALUES
(1, 'Vi', 'Davi Hanan', '123', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis_penangan`
--
ALTER TABLE `jenis_penangan`
  ADD UNIQUE KEY `jenis_penangan` (`jenis_penangan`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`),
  ADD UNIQUE KEY `NoIdentitas` (`NoIdentitas`);

--
-- Indexes for table `penangan`
--
ALTER TABLE `penangan`
  ADD PRIMARY KEY (`id_penanganan`),
  ADD KEY `dokter` (`id_user`),
  ADD KEY `pas` (`id_pasien`),
  ADD KEY `penangan` (`jenis_penangan`);

--
-- Indexes for table `rekap_obat`
--
ALTER TABLE `rekap_obat`
  ADD KEY `obatin` (`id_obat`),
  ADD KEY `penanga` (`id_penangan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `penangan`
--
ALTER TABLE `penangan`
  ADD CONSTRAINT `dokter` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `pas` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `penangan` FOREIGN KEY (`jenis_penangan`) REFERENCES `jenis_penangan` (`jenis_penangan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rekap_obat`
--
ALTER TABLE `rekap_obat`
  ADD CONSTRAINT `obatin` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `penanga` FOREIGN KEY (`id_penangan`) REFERENCES `penangan` (`id_penanganan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
