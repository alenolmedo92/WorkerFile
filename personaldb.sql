-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2022 a las 11:31:53
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `personaldb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `IDdireccion` int(9) NOT NULL,
  `calle` varchar(50) NOT NULL,
  `cardinal` varchar(20) NOT NULL,
  `numeracion` varchar(10) NOT NULL,
  `departamento` varchar(75) NOT NULL,
  `provincia` varchar(75) NOT NULL,
  `pais` varchar(75) NOT NULL,
  `codigopostal` varchar(10) NOT NULL,
  `IDpersonal` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`IDdireccion`, `calle`, `cardinal`, `numeracion`, `departamento`, `provincia`, `pais`, `codigopostal`, `IDpersonal`) VALUES
(1, 'LapridaS/N', 'Sur', '12', 'Zonda', 'San Juan', 'Argentina', '5401', 2),
(2, 'calle falsa', 'norte', '123', 'chimbas', 'san juan', 'argentina', '5413', 3),
(3, 'ABRAHAM TAPIA ', 'OESTE', '120', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 10),
(4, 'GENERAL ACHA TORRE  O  -4To C ', 'SUR', '744', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 15),
(5, 'PEDRO DE VALDIVIA 400 ', 'ESTE', '400', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 1),
(7, '9 DE JULIO ', 'ESTE', '704', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 20),
(8, 'LOS ARAYANES ', 'SUR', '808', 'SANTA LUCIA', 'SAN JUAN', 'ARGENTINA', '5411', 13),
(9, 'SAN LUIS', 'OESTE', '2386', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 11),
(10, 'CHILE MZNA 5. DPTO A', 'ESTE', '432', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 4),
(11, 'PARAGUAY ', 'OESTE', '241', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 5),
(12, '9 DE JULIO  ', 'OESTE', '2651', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 6),
(13, 'BURGALAT ', 'ESTE', '1881', 'SANTA LUCIA', 'SAN JUAN', 'ARGENTINA', '5411', 7),
(14, 'AV. P.A. DE SARMIENTO', 'SUR', '450', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 8),
(15, 'AVELLANEDA ', '', '2894', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 21),
(16, 'DEMETRIO PEREZ ', 'SUR', '428', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 22),
(17, '25 DE MAYO', 'ESTE', '510', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 23),
(18, 'LOS ARAYANES', 'SUR', '902', 'SANTA LUCIA', 'SAN JUAN', 'ARGENTINA', '5411', 24),
(19, 'ENTRE RIOS', 'NORTE', '308', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 25),
(21, 'MONO.BLOCK.5 2? A', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 16),
(22, 'SANTA MARIA DE ORO', 'SUR', '113', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 17),
(23, 'GRAL PAZ', 'OESTE', '2249', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 18),
(24, 'AV. RIOJA', 'NORTE', '466', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 45),
(25, 'B? LAS ACACIAS Casa 62 ', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 44),
(26, 'SEC 6 MONOB 1.1  B ', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 47),
(27, 'SECTOR II 2? A EDIFICIO 1 MBK.2', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 48),
(28, 'MZNA.  F CASA 28', '', '', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 49),
(29, 'RECABARREN ', 'OESTE', '414', 'RAWSON', 'CORDOBA', 'ARGENTINA', '5425', 50),
(30, 'DIAGUITAS', '', '76', 'JACHAL', 'CORDOBA', 'ARGENTINA', '5460', 51),
(31, 'BENJAMIN AGUILAR', 'OESTE', '126', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 52),
(32, 'CASA 1  MZNA D    ', '', '', 'RAWSON', 'SANTIAGO', 'ARGENTINA', '5425', 53),
(33, 'SANTE FE', 'OESTE', '361', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 54),
(34, 'SAN RAFAEL', 'OESTE', '1536', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 61),
(35, 'BALAGUER    T.7    DTO. F       P.B.', 'SUR', '86', 'SANTA LUCIA', 'SAN JUAN', 'ARGENTINA', '5411', 65),
(36, 'ENTRE RIOS', 'SUR', '548', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 70),
(37, 'SALTA', 'NORTE', '262', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 62),
(38, 'B? NATANIA III MZNA C    CASA 7 ', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 19),
(39, 'MZNA  D - CASA 19', '', '', 'CAPITAL', 'SAN JUAN', 'ARGENTINA', '5400', 30),
(40, 'C.SARMIENTO', 'OESTE', '181', 'CAPITAL', 'CORDOBA', 'ARGENTINA', '5400', 35),
(41, 'NEUQUEN ', 'OESTE', '1313', 'CHIMBAS', 'SAN JUAN', 'ARGENTINA', '5413', 38),
(42, 'MZNA C    -  CASA  13', '', '', 'CAPITAL', '', 'ARGENTINA', '5400', 37),
(43, 'Calle falsa', 'norte', '123', 'san juan', 'San juan', 'argentinolandia', '5412', 9),
(47, 'qwqwq', 'ww', 'qwqw', 'www', 'qwqw', 'qqq', 'qwqw', 63),
(48, 'qwer', 'qw', 'qw', 'qw', 'qw', 'qw', 'qw', 14),
(49, '23', '23', '23', '23', '23', '23', '23', 26),
(51, 'calle falsa', 'norte', '123', 'chimbas', 'san juan', 'argentina', '5413', 3),
(52, 'calle falsa', 'norte', '123', 'chimbas', 'san juan', 'argentina', '5413', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `id_personal` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `dni` varchar(10) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `charge` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `doa` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`id_personal`, `name`, `surname`, `dni`, `dob`, `charge`, `email`, `phone`, `doa`) VALUES
(1, 'Daniel', 'Ortiz', '33333333', '23/04/1990', 'Secretario', 'dani@mail.com', '5554442', '22/07/2019'),
(2, 'Fernando', 'Barrios', '10914409', '14/11/1953', 'Gerente', 'mailtobarrios@mail.com', '555222', '20/11/2010'),
(3, 'Alejandro', 'Olmedo', '36544591', '23/04/1992', 'Programador', 'ale@mailto.com', '123654', ''),
(4, 'SANCHEZ ', 'LILIA ANGELICA', '24426956', '14/5/1975', 'KINESIOLOGA', '', '', '26/12/1996'),
(5, 'SOSA ', 'BEATRIZ LEANDRA', '20943087', '1/10/1969', 'KINESIOLOGA', '', '', '30/5/1995'),
(6, 'ROBLEDO ', 'OSCAR MARIO', '21608665', '11/10/1970', 'LICENCIADO EN KINESI', '', '', '13/12/1998'),
(7, 'VIEYRA ', 'GRACIELA MATILDE', '21357676', '20/1/1970', 'KINESIOLOGA', '', '2644226750', '2/7/1990'),
(8, 'RUIZ ', 'ENRIQUE OSVALDO', '20897734', '27/9/1969', 'KINESIOLOGO', '', '', '1/5/1994'),
(9, 'VALLVE ', 'LUCIA OLGA', '20594368', '24/2/1969', 'KINESIOLOGA', '', '2644274165', '12/5/1979'),
(10, 'LUJAN ', 'MARCOS MARIO', '16675347', '27/8/1963', 'KINESIOLOGO', '', '', '20/5/1998'),
(11, 'ABATEDAGA', 'MARIA ELENA', '18205999', '25/9/1966', 'LICENCIADA EN KINESI', 'iturrieta@interredes.com.ar', '2644225399', '7/2/1993'),
(12, 'CAMPORA ', 'OLGA ARGENTINA', '18560564', '22/11/1967', 'FISIOTERAPEUTA', '', '', '2/12/1998'),
(13, 'EROSTARBE  RODRIGUEZ', 'MARIA ROSA', '20130430', '11/2/1968', 'LICENCIADA EN KINESI', 'marenchu@hotmail.com', '2644210903', '12/8/1998'),
(14, 'GUERRERO ', 'PATRICIA IRENE', '21358062', '17/12/1970', 'LICENCIADA EN KINESI', '', '2644222945', '3/7/1998'),
(15, 'BRIZUELA ', 'AYDA MARGARITA', '21610985', '6/10/1970', 'LICENCIADA EN KINESI', '', '', '5/3/1999'),
(16, 'MALBERTI ', 'LUCY SUSANA', '20887737', '17/11/1969', 'LICENCIADA EN KINESI', 'biyinamalberti@yahoo.com.ar', '2644250759', '11/11/1997'),
(17, 'HEREDIA ', 'MARIA CRISTINA', '21610756', '21/9/1970', 'FISIOTERAPEUTA', 'cristiheredia@hotmail.com', '2644233964', '15/3/1993'),
(18, 'PERIN ', 'PEDRO HUGO', '21359836', '8/1/1970', 'LICENCIADO EN KINESI', 'perinhugo033@gmail.com', '2644221675', '10/5/1987'),
(19, 'ARIZA ', 'MONICA CELESTE', '21040014', '17/8/1969', 'LICENCIADA EN KINESI', '', '2644217046', '10/1/1998'),
(20, 'TORIONI', 'DELIA', '17625110', '28/2/1966', 'FISIOTERAPEUTA', '', '2644238171', '18/5/1994'),
(21, 'NICOLIA', 'CRISTINA BEATRIZ', '16020281', '8/5/1962', 'LICENCIADA EN KINESI', 'cristinanicolia@hotmail.com', '2644250175', '30/8/1986'),
(22, 'AGUIAR ', 'ANA CATALINA', '21591838', '30/6/1970', 'FISIOTERAPEUTA', 'anaguiar11@hotmail.com', '2644231814', '21/6/1996'),
(23, 'LOBOS GONZALEZ', 'SILVIA CRISTINA', '22011811', '22/6/1952', 'LICENCIADA EN KINESI', '', '', '25/7/1995'),
(24, 'TORRENT ', 'JORGE LUIS', '21809227', '11/11/1970', 'LICENCIADO EN KINESI', 'jorgeluistorrent@gmail.com', '2644237740', '14/3/1994'),
(25, 'JALIFE ', 'SUSANA', '22107374', '22/7/1971', 'FISIOTERAPEUTA', '', '', '11/9/1996'),
(26, 'GIL ALDAY ', 'INA HELVECIA', '21609718', '28/8/1970', 'LICENCIADA EN KINESI', '', '2644211095', '19/10/1996'),
(27, 'MIRANDA', 'MARIA NORMA', '20275427', '24/11/1968', 'LICENCIADA EN KINESI', '', '2644251497', '13/3/1998'),
(28, 'BECERRA ', 'SILVIA RAQUEL', '20275753', '12/5/1969', 'LICENCIADA EN KINESI', '', '2644220263', '3/4/1992'),
(29, 'TORRES ', 'MARIA INES', '21895346', '5/6/1971', 'FISIOTERAPEUTA', '', '', '21/5/1989'),
(30, 'PONT', 'MARIA MERCEDES', '17923779', '21/2/1967', 'LICENCIADA EN KINESI', 'mariamercedespont@hotmail.com', '2644222939', '14/4/1996'),
(31, 'PISTOIA ', 'SUSANA AMALIA', '18589082', '1/10/1967', 'FISIOTERAPEUTA', 'ami_04_47@hotmail.com', '2644266181', '14/7/1994'),
(32, 'GALLO', 'MARIA ALEJANDRA', '20463370', '8/11/1968', 'FISIOTERAPEUTA', '', '', '5/12/1994'),
(33, 'ACEITUNO ', 'LILIANA CECILIA', '21609799', '19/10/1970', 'KINESIOLOGA', '', '', '9/8/1988'),
(34, 'CARPIO ', 'CLARA DE LAS MERCEDES', '18201408', '5/7/1967', 'LICENCIADA EN KINESI', 'claritacarpio23@gmail.com', '', '28/4/1981'),
(35, 'AGUIAR ', 'ALICIA VERONICA', '21609685', '16/8/1970', 'KINESIOLOGA', '', '2644237158', '15/8/1978'),
(36, 'COLOMBO ', 'SANDRA VIVIANA', '22358914', '24/9/1971', 'LICENCIADA EN KINESI', 'sandravcolombo@gmail.com', '2644217539', '27/5/1994'),
(37, 'SAENZ DE REGADERA ', 'CARLOS HORACIO', '20132574', '9/9/1968', 'LICENCIADO EN KINESI', 'carlos_taca@yahoo.com.ar', '2644239619', '6/6/1985'),
(38, 'PAROLI  QUIROGA', 'LILIANA MARGARITA', '21609903', '29/12/1970', 'LICENCIADA EN KINESI', 'liliparoli@live.com.ar', '2644227243', '14/10/1993'),
(39, 'SALINAS ', 'MIGUEL ORLANDO', '22064287', '30/5/1971', 'LICENCIADO EN KINESI', 'miguelsalinas59@gmail.com', '2644214364', '4/7/1994'),
(40, 'NIEVAS ', 'SANDRA ELVIRA', '14347530', '14/8/1960', 'FISIOTERAPEUTA', '', '', '7/6/1997'),
(41, 'CANTO ', 'CONRADO', '22705777', '17/8/1972', 'KINESIOLOGO', '', '', '7/1/1976'),
(42, 'PEREA ', 'LILIANA', '22658808', '21/4/1972', 'FISIOTERAPEUTA', '', '', '11/1/1997'),
(43, 'TORRES ', 'CELIA SUSANA', '22369674', '29/12/1971', 'FISIOTERAPEUTA', '', '2644332425', '3/11/1984'),
(44, 'MERINO CULLER', 'SILVIA MARGARITA', '23058090', '30/1/1973', 'FISIOTERAPEUTA', 'cusimer@uolsinectis.com.ar', '2644341439', '24/2/1987'),
(45, 'PORTILLO ', 'JORGE ALBERTO', '22663903', '7/4/1972', 'KINESIOLOGO', '', '', '14/5/1998'),
(46, 'RAMONDA ', 'STELLA MARIS', '23283558', '2/4/1971', 'LICENCIADA EN KINESI', '', '', '15/2/1998'),
(47, 'PREISZ ', 'CECILIA SANDRA', '22358513', '20/9/1971', 'FISIOTERAPEUTA', 'ceciliapreiszh@gmail.com', '2647421195', '4/3/1995'),
(48, 'PONCE ', 'JORGE LUIS', '22663851', '8/3/1972', 'FISIOTERAPEUTA', '', '', '5/10/1998'),
(49, 'DI LORENZO ', 'JOSE ARTURO', '22958387', '5/2/1973', 'LICENCIADO EN KINESI', 'arturodilorenzo@gmail.com', '2644217889', '5/11/1996'),
(50, 'NAVARRO ', 'MONICA BEAT RIZ', '22902131', '13/11/1972', 'LICENCIADA EN KINESI', '', '', '22/4/1998'),
(51, 'ZAMORA ', 'OSCAR ALFREDO', '16931552', '14/1/1964', 'KINESIOLOGO', 'oscaralfredozamora60@gmail. com', '2644344981', '31/8/1994'),
(52, 'LANDOLFO ', 'ALICIA MARIA', '20302300', '11/12/1968', 'FISIOTERAPEUTA', 'aliciamlandolfo@hotmail.com.ar', '2644225026', '19/12/1994'),
(53, 'ALONSO ', 'JOSE FLORENTINO', '22394165', '26/1/1972', 'KINESIOLOGO', '', '', '24/9/1993'),
(54, 'CAPARA ', 'MARIA BEATRIZ', '18008759', '19/8/1967', 'KINESIOLOGA', '', '', '27/11/1994'),
(55, 'STUSEK ', 'ALEJANDRA VERONICA', '22959384', '14/3/1973', 'LICENCIADA EN KINESI', '', '', '14/9/1993'),
(56, 'BELELLI ', 'SILVIA ESTELA', '23977645', '23/05/1974', 'LICENCIADA EN KINESI', 'silviabelelli1962@gmail.com', '2644261411', '25/3/1998'),
(57, 'LOPEZ ', 'MARIA DEL VALLE', '22788276', '17/10/1972', 'LICENCIADA EN KINESI', '', '2644252898', '20/1/1996'),
(58, 'CORIA ', 'MARIA BEATRIZ', '21901275', '21/11/1970', 'LICENCIADA EN KINESI', '', '2644228609', '16/6/1998'),
(59, 'ALBARRACIN ', 'RODOLFO ALEJANDRO', '13961809', '13/12/1959', 'KINESIOLOGO', 'r.albarracinlanda@gmail.com', '2644227679', '1/2/1997'),
(60, 'RUARTE ', 'NORA ELIZABETH DEL VALLE', '17243558', '11/1/1965', 'LICENCIADA EN KINESI', '', '', '8/12/1990'),
(61, 'AREVALO ', 'OSCAR ALBERTO', '22705558', '21/4/1972', 'LICENCIADO EN KINESI', 'albearevalo@yahoo.com.ar', '2644250602', '27/5/1997'),
(62, 'INGLESE ', 'SABINO ORLANDO', '22063550', '20/3/1971', 'LICENCIADO EN KINESI', 'sabinoinglese@yahoo.com.ar', '2644264520', '29/5/1998'),
(63, 'REINA ', 'MARTA PATRICIA', '23027889', '21/10/1972', 'FISIOTERAPEUTA', 'pato.rei1@hotmail.com', '2644330221', '7/2/1996'),
(64, 'MUT ', 'JUAN ROBERTO', '21655543', '14/8/1970', 'FISIOTERAPEUTA', '', '', '30/3/1993'),
(65, 'STURMA ', 'NANCY GRACIELA', '24026483', '23/11/1974', 'LICENCIADA EN KINESI', 'nancysturma_014@hotmail.com', '2644310108', '29/3/1998'),
(66, 'DE LA VEGA ', 'ALFREDO HUMBERTO', '23545174', '19/8/1973', 'FISIOTERAPEUTA', '', '', '24/10/1997'),
(67, 'DI YENNO ', 'ANA MARIA', '22358484', '15/9/1971', 'FISIOTERAPEUTA', '', '', '10/12/1996'),
(68, 'BUSTOS', 'MARIA AZUCENA', '20881303', '29/3/1969', 'LICENCIADA EN KINESI', 'asubustos@hotmail.com', '2644262674', '11/12/1996'),
(69, 'ORDO?EZ ', 'CECILIA  MARIA', '23545741', '23/2/1974', 'FISIOTERAPEUTA', '', '', '12/12/1996'),
(70, 'POBLETE ', 'SONIA DEBORA BEATRIZ', '23977059', '12/3/1974', 'LICENCIADA EN KINESI', '', '', '13/12/1996'),
(71, 'Saitama ma', 'Mayor Ma', '9876543', '', '', '', '', ''),
(72, 'Alude', 'asas', 'asas', 'asas', 'asasa', 'asasasa', 'asasas', 'asasasa'),
(73, 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa', 'aa'),
(74, 'qqq', 'qqq', 'qqqqqq', 'qqqq', 'qq', 'qqqq', 'qq', 'qqq'),
(75, 'nuevo', 'nuevo', 'nuevo', 'nuevo', 'nuevo', 'nuevo', 'nuevo', 'nuevo'),
(76, 'Shaku', 'Alud', '123456', '10/10/1980', 'Director', 'mail@mail.com', '23234545', '12/12/1999'),
(77, 'Alude', 'asas', 'asas', 'asas', 'asasa', 'asasasa', 'asasas', 'asasasa'),
(78, 'alud', 'ulad', '3456789', '', '', '', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`IDdireccion`),
  ADD KEY `IDpersonal` (`IDpersonal`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`id_personal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `IDdireccion` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT de la tabla `personal`
--
ALTER TABLE `personal`
  MODIFY `id_personal` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD CONSTRAINT `direccion_ibfk_1` FOREIGN KEY (`IDpersonal`) REFERENCES `personal` (`id_personal`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
