-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2024 at 03:29 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `2210010349`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(8) NOT NULL,
  `nama_admin` char(100) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `batu`
--

CREATE TABLE IF NOT EXISTS `batu` (
  `id_batu` int(8) NOT NULL,
  `nama_batu` char(100) DEFAULT NULL,
  `gambar` varchar(255) DEFAULT NULL,
  `keterangan` longtext,
  PRIMARY KEY (`id_batu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batu`
--

INSERT INTO `batu` (`id_batu`, `nama_batu`, `gambar`, `keterangan`) VALUES
(1, 'Granit', '-', 'Granit adalah jenis batuan beku yang terbentuk dari proses pendinginan magma di dalam kerak bumi. Batuan ini terdiri dari mineral-mineral seperti kuarsa, feldspar, dan mika, yang memberikan granit warna, pola, dan tekstur yang beragam. Granit biasanya memiliki tekstur butir yang kasar hingga sedang.\n'),
(2, 'Basalt', '-', 'Basalt adalah jenis batuan beku yang terbentuk dari magma yang mendingin di permukaan Bumi. Ini adalah salah satu jenis batuan yang paling umum di kerak Bumi.'),
(3, 'Sandstone', '-', 'Sandstone adalah jenis batuan sedimen yang terbentuk dari partikel pasir yang diikat bersama oleh tekanan dan adhesi. Proses pembentukan sandstone melibatkan pengendapan partikel pasir di bawah tekanan dan perubahan kimia atau fisik yang mengikat partikel tersebut bersama-sama menjadi batuan padat. Sandstone memiliki berbagai warna, tekstur dan pola tergantung pada sumber pasir, kondisi pengendapan, dan proses metamorfosis.\n'),
(4, 'Gneiss', '-', 'Gneiss adalah jenis batuan metamorfik yang terbentuk dari batuan asal seperti granit atau batu beku lainnya yang mengalami proses metamorfosis. Proses metamorfosis ini terjadi karena tekanan tinggi, suhu tinggi, dan kadang-kadang paparan zat kimia tertentu dalam kerak bumi. Akibatnya, struktur mineral dan tekstur batuan asal mengalami perubahan, menghasilkan batuan metamorfik yang memiliki pola dan lapisan yang khas.\n'),
(5, 'Marmer', '-', 'Marmer adalah jenis batuan metamorfik yang terbentuk dari proses metamorfosis batuan kapur. Batuan ini terbentuk ketika batuan kapur (yang awalnya terbentuk dari endapan kerang, cangkang, dan fragmen organik lainnya di dasar laut mengalami tekanan tinggi dan suhu tinggi dalam proses metamorfosis. Proses ini mengubah struktur kimia dan kristal batuan kapur, menghasilkan marmer yang memiliki tekstur dan pola unik.');

-- --------------------------------------------------------

--
-- Table structure for table `batu_cari`
--

CREATE TABLE IF NOT EXISTS `batu_cari` (
  `id_cari` int(8) NOT NULL,
  `id_batu` int(8) DEFAULT NULL,
  `warna` char(50) DEFAULT NULL,
  `tekstur` char(100) DEFAULT NULL,
  `struktur` varchar(255) DEFAULT NULL,
  `ukuran_butir` varchar(255) DEFAULT NULL,
  `granularitas` varchar(255) DEFAULT NULL,
  `jenis` char(100) DEFAULT NULL,
  `bentuk_cristal` char(100) DEFAULT NULL,
  `drajat_pembundaran` varchar(255) DEFAULT NULL,
  `drajat_kristalisasi` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cari`),
  KEY `id_batu` (`id_batu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batu_cari`
--

INSERT INTO `batu_cari` (`id_cari`, `id_batu`, `warna`, `tekstur`, `struktur`, `ukuran_butir`, `granularitas`, `jenis`, `bentuk_cristal`, `drajat_pembundaran`, `drajat_kristalisasi`) VALUES
(1, 5, 'Putih, merah muda, abu-abu, hijau', 'Halus', 'Menengah hingga kasar', 'Granular', 'Putih, merah muda, abu-abu, hijau', 'Metamorphic', 'Putih, merah muda, abu-abu, hijau', 'Anguler hingga sub-anguler', 'Tinggi'),
(2, 3, 'Beragam (merah, kuning, coklat, putih)', 'Medium', 'Menengah', 'Granular', 'Beragam (merah, kuning, coklat, putih)', 'Sedimentary', 'Beragam (merah, kuning, coklat, putih)', 'Bulat hingga sub-bulat', 'Tidak ada'),
(3, 1, 'Abu-abu, putih, merah muda', 'Kasar', 'Menengah hingga kasar', 'Granular', 'Abu-abu, putih, merah muda ', 'Igneous (Intrusif)', 'Abu-abu, putih, merah muda', 'Anguler hingga sub-anguler', 'Tinggi'),
(4, 2, 'Hitam, abu-abu gelap', 'Halus hingga sangat halus', 'Sangat halus', 'Non-granular', 'Hitam, abu-abu gelap', 'Igneous (Ekstrusif)', 'Hitam, abu-abu gelap', 'Anguler', 'Rendah hingga menengah'),
(5, 4, 'Beragam (putih, abu-abu, merah muda, hitam)', 'Kasar', 'Menengah hingga kasar', 'Granular', 'Beragam (putih, abu-abu, merah muda, hitam)', 'Memorphic', 'Beragam (putih, abu-abu, merah muda, hitam)', 'Anguler, umumnya prismatik', 'Tinggi');

-- --------------------------------------------------------

--
-- Table structure for table `batu_ciri`
--

CREATE TABLE IF NOT EXISTS `batu_ciri` (
  `id_ciri_batu` int(8) NOT NULL,
  `ciri` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_ciri_batu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `batu_nilai_ciri`
--

CREATE TABLE IF NOT EXISTS `batu_nilai_ciri` (
  `id_nilai_ciri` int(8) NOT NULL,
  `id_ciri_batu` int(8) DEFAULT NULL,
  `nilai` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_nilai_ciri`),
  KEY `id_ciri_batu` (`id_ciri_batu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `informasin`
--

CREATE TABLE IF NOT EXISTS `informasin` (
  `id_informasi` int(8) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `tingkat` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_informasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `materi`
--

CREATE TABLE IF NOT EXISTS `materi` (
  `id_materi` int(8) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `gambar` blob,
  PRIMARY KEY (`id_materi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mineral`
--

CREATE TABLE IF NOT EXISTS `mineral` (
  `id_mineral` int(8) NOT NULL,
  `mineral` varchar(255) DEFAULT NULL,
  `gambar` varchar(255) DEFAULT NULL,
  `keterangan` longtext NOT NULL,
  PRIMARY KEY (`id_mineral`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mineral`
--

INSERT INTO `mineral` (`id_mineral`, `mineral`, `gambar`, `keterangan`) VALUES
(1, 'Kuarsa (Quartz)', '-', 'Mineral umum yang terdapat di banyak jenis batuan.'),
(2, 'Pirit (Pyrite)', '-', 'Sering disebut "emas bodoh" karena kemiripannya dengan emas. '),
(3, 'Mika (Mica) ', '-', 'Mineral yang mudah terbelah menjadi lembaran tipis.'),
(4, 'Galena', '-', 'Sumber utama timah hitam.'),
(5, ' Hematit (Hematite) ', '-', 'Sumber utama besi.');

-- --------------------------------------------------------

--
-- Table structure for table `mineral_cari`
--

CREATE TABLE IF NOT EXISTS `mineral_cari` (
  `id_min_cari` int(8) NOT NULL,
  `id_mineral` int(8) DEFAULT NULL,
  `warna` char(100) DEFAULT NULL,
  `bentuk_kristal` char(100) DEFAULT NULL,
  `tekstur` varchar(255) DEFAULT NULL,
  `kilap` varchar(255) DEFAULT NULL,
  `kekerasan` varchar(255) DEFAULT NULL,
  `gores` varchar(255) DEFAULT NULL,
  `belahan` varchar(255) DEFAULT NULL,
  `pecahan` varchar(255) DEFAULT NULL,
  `tenaciti` varchar(255) DEFAULT NULL,
  `berat_jenis` varchar(255) DEFAULT NULL,
  `derajat_kemagnetan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_min_cari`),
  KEY `id_mineral` (`id_mineral`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mineral_cari`
--

INSERT INTO `mineral_cari` (`id_min_cari`, `id_mineral`, `warna`, `bentuk_kristal`, `tekstur`, `kilap`, `kekerasan`, `gores`, `belahan`, `pecahan`, `tenaciti`, `berat_jenis`, `derajat_kemagnetan`) VALUES
(1, 3, 'Berbagai warna, biasanya tidak berwarna atau coklat.', 'Monoklinik', 'Halus', 'Kaca hingga mutiara. ', '2.5-3 (Skala Mohs).', 'Putih', 'Sempurna satu arah. ', 'Ridak rata', 'Fleksibel tapi tidak elastis. ', '2.7-3.1. ', '-'),
(2, 1, 'Tidak berwarna hingga berbagai warna.', 'Heksagonal', 'Halus', 'Kaca', '7 (Skala Mohs)', 'Putih', '-', 'Konkoidal', 'Rapuh', '2.65', '-'),
(3, 2, 'Kuning keemasan', 'Kubus', 'Kasar', 'Logam', '6-6.5 (Skala Mohs)', 'Hitam kehijauan', 'Tidak Sempurna', 'Tidak Rata', 'Rapuh', '4.9 - 5.2', 'Sedikit magnetik jika mengandung besi'),
(4, 5, 'Merah kehitaman', 'Trigonal', 'Halus hingga kasar', 'Logam hingga sub-logam', '5.5 8 6.5 (Skala Mohs)', 'Merah', '-', 'Tidak rata', 'Rapuh', '5.3', 'Sedikit magnetik'),
(5, 4, 'Abu-abu keperakan', 'Kubus', 'Kasar', 'Logam', '2.5 - 2.75 (Skala Mohs)', 'Hitam keabu-abuan', 'Sempurna tiga arah', 'Sub-konkidal', 'Rapuh', '7.4 - 7.6', '-');

-- --------------------------------------------------------

--
-- Table structure for table `mineral_ciri`
--

CREATE TABLE IF NOT EXISTS `mineral_ciri` (
  `id_min_ciri` int(8) NOT NULL,
  `min_ciri` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_min_ciri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nilai_min_ciri`
--

CREATE TABLE IF NOT EXISTS `nilai_min_ciri` (
  `id_min_nilai` int(8) NOT NULL,
  `id_min_ciri` int(8) DEFAULT NULL,
  `min_nilai_ciri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_min_nilai`),
  KEY `id_min_ciri` (`id_min_ciri`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `uji`
--

CREATE TABLE IF NOT EXISTS `uji` (
  `nik` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `telp` varchar(12) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `batu_cari`
--
ALTER TABLE `batu_cari`
  ADD CONSTRAINT `batu_cari_ibfk_1` FOREIGN KEY (`id_batu`) REFERENCES `batu` (`id_batu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `batu_nilai_ciri`
--
ALTER TABLE `batu_nilai_ciri`
  ADD CONSTRAINT `batu_nilai_ciri_ibfk_1` FOREIGN KEY (`id_ciri_batu`) REFERENCES `batu_ciri` (`id_ciri_batu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `mineral_cari`
--
ALTER TABLE `mineral_cari`
  ADD CONSTRAINT `mineral_cari_ibfk_1` FOREIGN KEY (`id_mineral`) REFERENCES `mineral` (`id_mineral`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `nilai_min_ciri`
--
ALTER TABLE `nilai_min_ciri`
  ADD CONSTRAINT `nilai_min_ciri_ibfk_1` FOREIGN KEY (`id_min_ciri`) REFERENCES `mineral_ciri` (`id_min_ciri`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
