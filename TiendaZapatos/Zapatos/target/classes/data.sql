
INSERT INTO `modelos` (`Nombre`) VALUES
('Samba'),
('Classic'),
('Air Force 1'),
('Yeezy 500'),
('Classic K');

INSERT INTO `tallaColor` (`Talla`, `Color`, `Stock`) VALUES
(45, 'Negro', 10),
(40, 'Pink', 5),
(43, 'Pink', 8),
(38, 'Pink', 12),
(42, 'Pink', 7),
(36, 'Pink', 6),
(43, 'Blanco', 8),
(44, 'Beige', 4),
(38, 'Azul Marino', 3);


INSERT INTO `marcas` (`Nombre`) VALUES
('Adidas'),
('Crocs'),
('Nike');

INSERT INTO `zapatos` (`idMarca`, `idModelo`, `idTallaColor`, `Precio`, `Tipo`, `imagen`, `descripcion`) VALUES
(1, 1, 1, 100, 'Zapatilla', 'https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/d0561b42bd25442e9144a8bf0119046b_9366/Zapatilla_Samba_OG_Negro_B75807_09_standard.jpg', 'Nacida en los campos de fútbol, la Samba es un icono atemporal del estilo urbano. Fiel a su legado, la Samba presenta una elegante silueta de perfil bajo, una parte superior de piel suave, refuerzos de ante y suela de goma, lo que la convierte en una zapatilla imprescindible dentro y fuera del terreno de juego.'),
(2, 2, 2, 80, 'Chancla', 'https://res.cloudinary.com/dlkyq6ldb/image/upload/v1710153991/images/qrv0miptnt9q185h6uir.jpg', 'Disfruta de un ajuste a tu medida, resistente al agua y con ventilación para mayor transpirabilidad. Crocs Classic es el zapato perfecto para cualquier ocasión. Completamente moldeado con material Croslite. Increíblemente ligeras y súper divertidas en los pies.Perfectas para el agua y flotantes, sólo pesan unos gramos. Los agujeros de ventilación aportan transpirabilidad a la vez que evacúan el agua y la suciedad. Fáciles de limpiar, de secado rápido. La tira trasera pivotante permite un ajuste más preciso.'),
(3, 3, 3, 120, 'Zapatilla', 'https://res.cloudinary.com/dlkyq6ldb/image/upload/v1710153645/images/qjlopobtxpqnkeislwrz.jpg', 'El fulgor sigue vivo en las Nike Air Force 1, un modelo original de baloncesto que introduce un nuevo giro a sus ya característicos revestimientos con costuras duraderas, sus acabados impecables y la cantidad perfecta de reflectante.'),
(1, 4, 4, 210, 'Zapatilla', 'https://res.cloudinary.com/dlkyq6ldb/image/upload/v1710154383/images/tfrydthec9xgv3z9xqt8.png', 'Las Yeezy 500 son una línea de zapatillas deportivas diseñadas por Kanye West en colaboración con Adidas. Estas zapatillas se caracterizan por su diseño distintivo y su construcción de alta calidad. El modelo presenta una parte superior de ante, malla y cuero, con detalles reflectantes en algunos modelos. '),
(2, 5, 5, 75, 'Bota', 'https://res.cloudinary.com/dlkyq6ldb/image/upload/v1710231521/images/df7y5s369ddccayjqfsb.jpg', '');

INSERT INTO `usuarios` (`apellidos`, `email`, `nombre`, `password`, `fechaNac`) VALUES
('Ponte Yanez', 'javi@gmail.com', 'Javi', '1234', 2004-12-29);

INSERT INTO `carrito` (`idusuarios`, `idZapatos`) VALUES
(1, 1);

INSERT INTO `tallas` (`idzapatos`, `tallas`) VALUES
(1, 40),
(1, 43),
(2, 44),
(2, 38),
(3, 46),
(3, 43),
(4, 42),
(4, 39),
(5, 36),
(5, 44);