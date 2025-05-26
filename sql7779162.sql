-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-05-2025 a las 10:25:26
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sql7779162`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `locales`
--

CREATE TABLE `locales` (
  `NombreLocal` varchar(30) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Ubicacion` varchar(60) NOT NULL,
  `Valoracion` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `locales`
--

INSERT INTO `locales` (`NombreLocal`, `Tipo`, `Ubicacion`, `Valoracion`) VALUES
('Abril', 'Discoteca', 'C Luis Montoto', 5.6),
('Koko', 'Discoteca', 'Pl. de la Encarnación', 9.9),
('La Cafetera ', 'Cafetería', 'C/ Petrarca ', 10),
('La paraita', 'Cervecería', 'C/  José Márquez', 3.4),
('Macarella', 'Restaurante', 'C Juan sierra', 5.5),
('Monstruo de la Cerveza', 'Cervecería', 'C/ Victor Tuesta', 6.3),
('Petisu', 'Cafetería', 'C/ Marques de nervion', 7.8),
('Taberna Manue', 'Restaurante', 'C/ Ramón Pérez', 1.5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `NombreUsuario` varchar(30) NOT NULL,
  `Contrasena` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`NombreUsuario`, `Contrasena`) VALUES
('usu', 'contra'),
('usuario', 'usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valoracion`
--

CREATE TABLE `valoracion` (
  `NombreUsuario` varchar(30) NOT NULL,
  `NombreLocal` varchar(30) NOT NULL,
  `Puntuacion` float NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `locales`
--
ALTER TABLE `locales`
  ADD PRIMARY KEY (`NombreLocal`),
  ADD UNIQUE KEY `Ubicacion` (`Ubicacion`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`NombreUsuario`);

--
-- Indices de la tabla `valoracion`
--
ALTER TABLE `valoracion`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `NombreUsuario` (`NombreUsuario`),
  ADD KEY `NombreLocal` (`NombreLocal`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `valoracion`
--
ALTER TABLE `valoracion`
  ADD CONSTRAINT `valoracion_ibfk_1` FOREIGN KEY (`NombreUsuario`) REFERENCES `usuarios` (`NombreUsuario`),
  ADD CONSTRAINT `valoracion_ibfk_2` FOREIGN KEY (`NombreLocal`) REFERENCES `locales` (`NombreLocal`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
