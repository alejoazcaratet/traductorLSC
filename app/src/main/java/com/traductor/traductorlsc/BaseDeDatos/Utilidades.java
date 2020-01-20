package com.traductor.traductorlsc.BaseDeDatos;

public class Utilidades {
    //Constantes campos tabla Vocabulario
    public static final String NOMBRE_BASEDEDATOS = "bd_vocabulario.db";
    public static final String TABLA_VOCABULARIO = "vocabulario";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_PALABRA = "palabra";
    public static final String CAMPO_CATEGORIA = "categoria";
    public static final int VERSION_BASEDEDATOS = 1;

    //Creacion de la tabla en la BD
    public static final String sqlCreate = "CREATE TABLE IF NOT EXISTS " + TABLA_VOCABULARIO + " ("
            + CAMPO_ID + " INTEGER PRIMARY KEY,"
            + CAMPO_PALABRA + " TEXT, "
            + CAMPO_CATEGORIA + " TEXT)";

    //Eliminación de la base de datos en caso de que exista
    public static final String sqlDrop = "DROP TABLE IF EXISTS " + TABLA_VOCABULARIO;

    //Insersión de datos en la BD
    public static final String sqlInsert = "INSERT INTO "+TABLA_VOCABULARIO+" ("+CAMPO_ID+", "+CAMPO_PALABRA+", "+CAMPO_CATEGORIA+")"
            +"VALUES"
            +"(001, 'a', 'ABECEDARIO'),"
            +"(002, 'abajo', 'NOCIONES'),"
            +"(003, 'abril', 'MESES'),"
            +"(004, 'abuela',	'FAMILIA'),"
            +"(005, 'abuelo', 'FAMILIA'),"
            +"(006, 'aburrido', 'SENTIMIENTOS'),"
            +"(007, 'adelante', 'NOCIONES'),"
            +"(008, 'adios', 'SALUDOS'),"
            +"(009, 'aeropuerto', 'LUGARES'),"
            +"(010, 'agosto', 'TEMPORALIDAD'),"
            +"(011, 'agua', 'BEBIDAS'),"
            +"(012, 'alto', 'NOCIONES'),"
            +"(013, 'amarillo', 'COLORES'),"
            +"(014, 'ambulancia', 'TRANSPORTE'),"
            +"(015, 'amiga', 'FAMILIA'),"
            +"(016, 'amigo', 'FAMILIA'),"
            +"(017, 'amor', 'SENTIMIENTOS'),"
            +"(018, 'anillo', 'ACCESORIOS'),"
            +"(019, 'annonuevo', 'FIESTAS'),"
            +"(020, 'anno', 'TEMPORALIDAD'),"
            +"(021, 'arepa', 'ALIMENTOS'),"
            +"(022, 'aretes', 'ACCESORIOS'),"
            +"(023, 'arriba', 'NOCIONES'),"
            +"(024, 'arroz', 'ALIMENTOS'),"
            +"(025, 'atletismo', 'DEPORTES'),"
            +"(026, 'atras', 'NOCIONES'),"
            +"(027, 'avena', 'BEBIDAS'),"
            +"(028, 'avion', 'TRANSPORTE'),"
            +"(029, 'ayer', 'TEMPORALIDAD'),"
            +"(030, 'azul', 'COLORES'),"
            +"(031, 'b', 'ABECEDARIO'),"
            +"(032, 'bajo', 'NOCIONES'),"
            +"(033, 'ballena', 'ANIMALES'),"
            +"(034, 'baloncesto', 'DEPORTES'),"
            +"(035, 'banano', 'FRUTAS'),"
            +"(036, 'banco', 'LUGARES'),"
            +"(037, 'bannar', 'VERBOS'),"
            +"(038, 'banno', 'LUGARES'),"
            +"(039, 'biblioteca', 'LUGARES'),"
            +"(040, 'bicicleta', 'TRANSPORTE'),"
            +"(041, 'bienvenido', 'SALUDOS'),"
            +"(042, 'blanco', 'COLORES'),"
            +"(043, 'blando', 'NOCIONES'),"
            +"(044, 'blusa', 'PRENDAS'),"
            +"(045, 'boca', 'ANATOMIA'),"
            +"(046, 'bombero', 'PROFESIONES'),"
            +"(047, 'bonito', 'NOCIONES'),"
            +"(048, 'borrador', 'UTILES'),"
            +"(049, 'brazos', 'ANATOMIA'),"
            +"(050, 'buenasnoches', 'SALUDOS'),"
            +"(051, 'buenastardes', 'SALUDOS'),"
            +"(052, 'buenosdias', 'SALUDOS'),"
            +"(053, 'bus', 'TRANSPORTE'),"
            +"(054, 'c', 'ABECEDARIO'),"
            +"(055, 'caballo', 'ANIMALES'),"
            +"(056, 'cabello', 'ANATOMIA'),"
            +"(057, 'cabeza', 'ANATOMIA'),"
            +"(058, 'cadena', 'ACCESORIOS'),"
            +"(059, 'cafe', 'BEBIDAS'),"
            +"(060, 'cafe', 'COLORES'),"
            +"(061, 'caminar', 'VERBOS'),"
            +"(062, 'camisa', 'PRENDAS'),"
            +"(063, 'cantante', 'PROFESIONES'),"
            +"(064, 'caracol', 'ANIMALES'),"
            +"(065, 'carne', 'ALIMENTOS'),"
            +"(066, 'carpintero', 'PROFESIONES'),"
            +"(067, 'carro', 'TRANSPORTE'),"
            +"(068, 'casa', 'LUGARES'),"
            +"(069, 'cebolla', 'VERDURAS'),"
            +"(070, 'celos', 'SENTIMIENTOS'),"
            +"(071, 'celular', 'TECNOLOGIA'),"
            +"(072, 'cerca', 'NOCIONES'),"
            +"(073, 'cerdo', 'ANIMALES'),"
            +"(074, 'cero', 'NUMEROS'),"
            +"(075, 'chef', 'PROFESIONES'),"
            +"(076, 'chocolate', 'BEBIDAS'),"
            +"(077, 'cilantro', 'VERDURAS'),"
            +"(078, 'cinco', 'NUMEROS'),"
            +"(079, 'cine', 'LUGARES'),"
            +"(080, 'circulo', 'FIGURAS'),"
            +"(081, 'cocina', 'LUGARES'),"
            +"(082, 'cocodrilo', 'ANIMALES'),"
            +"(083, 'colegio', 'LUGARES'),"
            +"(084, 'color', 'COLORES'),"
            +"(085, 'comer', 'VERBOS'),"
            +"(086, 'comoestas', 'SALUDOS'),"
            +"(087, 'computador', 'TECNOLOGIA'),"
            +"(088, 'conductor', 'PROFESIONES'),"
            +"(089, 'conejo', 'ANIMALES'),"
            +"(090, 'correa', 'ACCESORIOS'),"
            +"(091, 'correr', 'VERBOS'),"
            +"(092, 'corto', 'NOCIONES'),"
            +"(093, 'cuaderno', 'UTILES'),"
            +"(094, 'cuadrado', 'FIGURAS'),"
            +"(095, 'cuarto', 'LUGARES'),"
            +"(096, 'cuatro', 'NUMEROS'),"
            +"(097, 'culpa', 'SENTIMIENTOS'),"
            +"(098, 'cumpleannos', 'FIESTAS'),"
            +"(099, 'd', 'ABECEDARIO'),"
            +"(100, 'debajo', 'NOCIONES'),"
            +"(101, 'delfin', 'ANIMALES'),"
            +"(102, 'dentro', 'NOCIONES'),"
            +"(103, 'derecha', 'NOCIONES'),"
            +"(104, 'diadelamadre', 'FIESTAS'),"
            +"(105, 'diadelamujer', 'FIESTAS'),"
            +"(106, 'diadelidioma', 'FIESTAS'),"
            +"(107, 'diadelninno', 'FIESTAS'),"
            +"(108, 'diadelpadre', 'FIESTAS'),"
            +"(109, 'diadelprofesor', 'FIESTAS'),"
            +"(110, 'diafestivo', 'TEMPORALIDAD'),"
            +"(111, 'dia', 'TEMPORALIDAD'),"
            +"(112, 'diciembre', 'TEMPORALIDAD'),"
            +"(113, 'diez', 'NUMEROS'),"
            +"(114, 'domingo', 'TEMPORALIDAD'),"
            +"(115, 'dormir', 'VERBOS'),"
            +"(116, 'dos', 'NUMEROS'),"
            +"(117, 'drogueria', 'LUGARES'),"
            +"(118, 'duro', 'NOCIONES'),"
            +"(119, 'e', 'ABECEDARIO'),"
            +"(120, 'elefante', 'ANIMALES'),"
            +"(121, 'encima', 'NOCIONES'),"
            +"(122, 'enero', 'TEMPORALIDAD'),"
            +"(123, 'enfermero', 'PROFESIONES'),"
            +"(124, 'enojo', 'SENTIMIENTOS'),"
            +"(125, 'ensalada', 'ALIMENTOS'),"
            +"(126, 'esposa', 'FAMILIA'),"
            +"(127, 'esposo', 'FAMILIA'),"
            +"(128, 'estadio', 'LUGARES'),"
            +"(129, 'estudiante', 'PROFESIONES'),"
            +"(130, 'f', 'ABECEDARIO'),"
            +"(131, 'facebook', 'TECNOLOGIA'),"
            +"(132, 'falda', 'PRENDAS'),"
            +"(133, 'Familia', 'FAMILIA'),"
            +"(134, 'febrero', 'TEMPORALIDAD'),"
            +"(135, 'feliz', 'SENTIMIENTOS'),"
            +"(136, 'feo', 'NOCIONES'),"
            +"(137, 'flaco', 'NOCIONES'),"
            +"(138, 'fotografo', 'PROFESIONES'),"
            +"(139, 'fresa', 'FRUTAS'),"
            +"(140, 'fuera', 'NOCIONES'),"
            +"(141, 'futbol', 'DEPORTES'),"
            +"(142, 'g', 'ABECEDARIO'),"
            +"(143, 'gafas', 'ACCESORIOS'),"
            +"(144, 'gallina', 'ANIMALES'),"
            +"(145, 'gato', 'ANIMALES'),"
            +"(146, 'gimnasio', 'LUGARES'),"
            +"(147, 'gordo', 'NOCIONES'),"
            +"(148, 'gorro', 'PRENDAS'),"
            +"(149, 'gracias', 'SALUDOS'),"
            +"(150, 'grande', 'NOCIONES'),"
            +"(151, 'gris', 'COLORES'),"
            +"(152, 'grupo', 'FAMILIA'),"
            +"(153, 'guanabana', 'FRUTAS'),"
            +"(154, 'guantes', 'PRENDAS'),"
            +"(155, 'h', 'ABECEDARIO'),"
            +"(156, 'habichuela', 'VERDURAS'),"
            +"(157, 'halloween', 'FIESTAS'),"
            +"(158, 'hamburguesa', 'ALIMENTOS'),"
            +"(159, 'hermana', 'FAMILIA'),"
            +"(160, 'hermano', 'FAMILIA'),"
            +"(161, 'hija', 'FAMILIA'),"
            +"(162, 'hijo', 'FAMILIA'),"
            +"(163, 'hola', 'SALUDOS'),"
            +"(164, 'hora', 'TEMPORALIDAD'),"
            +"(165, 'hospital', 'LUGARES'),"
            +"(166, 'hotel', 'LUGARES'),"
            +"(167, 'hoy', 'TEMPORALIDAD'),"
            +"(168, 'huevos', 'ALIMENTOS'),"
            +"(169, 'i', 'ABECEDARIO'),"
            +"(170, 'iglesia', 'LUGARES'),"
            +"(171, 'igual', 'ANATOMIA'),"
            +"(172, 'internet', 'TECNOLOGIA'),"
            +"(173, 'interpretador', 'PROFESIONES'),"
            +"(174, 'izquierda', 'NOCIONES'),"
            +"(175, 'j', 'ABECEDARIO'),"
            +"(176, 'jirafa', 'ANIMALES'),"
            +"(177, 'jueves', 'TEMPORALIDAD'),"
            +"(178, 'jugar', 'VERBOS'),"
            +"(179, 'jugo', 'BEBIDAS'),"
            +"(180, 'julio', 'TEMPORALIDAD'),"
            +"(181, 'junio', 'TEMPORALIDAD'),"
            +"(182, 'k', 'ABECEDARIO'),"
            +"(183, 'l', 'ABECEDARIO'),"
            +"(184, 'lapicero', 'UTILES'),"
            +"(185, 'lapiz', 'UTILES'),"
            +"(186, 'largo', 'NOCIONES'),"
            +"(187, 'leche', 'BEBIDAS'),"
            +"(188, 'lejos', 'NOCIONES'),"
            +"(189, 'lento', 'NOCIONES'),"
            +"(190, 'leon', 'ANIMALES'),"
            +"(191, 'libro', 'UTILES'),"
            +"(192, 'limon', 'FRUTAS'),"
            +"(193, 'limonada', 'BEBIDAS'),"
            +"(194, 'limpiar', 'VERBOS'),"
            +"(195, 'linea', 'FIGURAS'),"
            +"(196, 'll', 'ABECEDARIO'),"
            +"(197, 'lulo', 'FRUTAS'),"
            +"(198, 'lunes', 'TEMPORALIDAD'),"
            +"(199, 'm', 'ABECEDARIO'),"
            +"(200, 'maletin', 'UTILES'),"
            +"(201, 'mama', 'FAMILIA'),"
            +"(202, 'mango', 'FRUTAS'),"
            +"(203, 'manos', 'ANATOMIA'),"
            +"(204, 'manzana', 'FRUTAS'),"
            +"(205, 'mannana', 'TEMPORALIDAD'),"
            +"(206, 'marcador', 'UTILES'),"
            +"(207, 'mariposa', 'ANIMALES'),"
            +"(208, 'martes', 'TEMPORALIDAD'),"
            +"(209, 'marzo', 'TEMPORALIDAD'),"
            +"(210, 'mayo', 'TEMPORALIDAD'),"
            +"(211, 'mayor', 'ANATOMIA'),"
            +"(212, 'megusta', 'SENTIMIENTOS'),"
            +"(213, 'mediano', 'NOCIONES'),"
            +"(214, 'medias', 'PRENDAS'),"
            +"(215, 'medico', 'PROFESIONES'),"
            +"(216, 'menor', 'ANATOMIA'),"
            +"(217, 'mes', 'TEMPORALIDAD'),"
            +"(218, 'mico', 'ANIMALES'),"
            +"(219, 'miedo', 'SENTIMIENTOS'),"
            +"(220, 'miercoles', 'TEMPORALIDAD'),"
            +"(221, 'minuto', 'TEMPORALIDAD'),"
            +"(222, 'mono', 'ANIMALES'),"
            +"(223, 'mora', 'FRUTAS'),"
            +"(224, 'moto', 'TRANSPORTE'),"
            +"(225, 'mucho', 'NOCIONES'),"
            +"(226, 'museo', 'LUGARES'),"
            +"(227, 'musico', 'PROFESIONES'),"
            +"(228, 'n', 'ABECEDARIO'),"
            +"(229, 'nadar', 'VERBOS'),"
            +"(230, 'naranjaa', 'COLORES'),"
            +"(231, 'naranja', 'FRUTAS'),"
            +"(232, 'nariz', 'ANATOMIA'),"
            +"(233, 'natacion', 'DEPORTES'),"
            +"(234, 'navidad', 'FIESTAS'),"
            +"(235, 'negro', 'COLORES'),"
            +"(236, 'nieta', 'FAMILIA'),"
            +"(237, 'nieto', 'FAMILIA'),"
            +"(238, 'ninno', 'FAMILIA'),"
            +"(239, 'noche', 'TEMPORALIDAD'),"
            +"(240, 'novia', 'FAMILIA'),"
            +"(241, 'noviembre', 'TEMPORALIDAD'),"
            +"(242, 'novio', 'FAMILIA'),"
            +"(243, 'nueve', 'NUMEROS'),"
            +"(244, 'ocho', 'NUMEROS'),"
            +"(245, 'octubre', 'TEMPORALIDAD'),"
            +"(246, 'odio', 'SENTIMIENTOS'),"
            +"(247, 'odontologo', 'PROFESIONES'),"
            +"(248, 'ojo', 'ANATOMIA'),"
            +"(249, 'oreja', 'ANATOMIA'),"
            +"(250, 'oso', 'ANIMALES'),"
            +"(251, 'oveja', 'ANIMALES'),"
            +"(252, 'p', 'ABECEDARIO'),"
            +"(253, 'pajaro', 'ANIMALES'),"
            +"(254, 'pan', 'ALIMENTOS'),"
            +"(255, 'panaderia', 'LUGARES'),"
            +"(256, 'pandebono', 'ALIMENTOS'),"
            +"(257, 'pantalla', 'TECNOLOGIA'),"
            +"(258, 'pantalon', 'PRENDAS'),"
            +"(259, 'pantaloneta', 'PRENDAS'),"
            +"(260, 'papaa', 'FAMILIA'),"
            +"(261, 'papa', 'VERDURAS'),"
            +"(262, 'pararse', 'NOCIONES'),"
            +"(263, 'parque', 'LUGARES'),"
            +"(264, 'pastel', 'ALIMENTOS'),"
            +"(265, 'pato', 'ANIMALES'),"
            +"(266, 'peluquero', 'PROFESIONES'),"
            +"(267, 'pepino', 'VERDURAS'),"
            +"(268, 'pequenno', 'NOCIONES'),"
            +"(269, 'pera', 'FRUTAS'),"
            +"(270, 'periodista', 'PROFESIONES'),"
            +"(271, 'perro', 'ANIMALES'),"
            +"(272, 'perro Caliente', 'ALIMENTOS'),"
            +"(273, 'persona', 'FAMILIA'),"
            +"(274, 'pescado', 'ALIMENTOS'),"
            +"(275, 'pez', 'ANIMALES'),"
            +"(276, 'piernas', 'ANATOMIA'),"
            +"(277, 'pies', 'ANATOMIA'),"
            +"(278, 'piloto', 'PROFESIONES'),"
            +"(279, 'pintor', 'PROFESIONES'),"
            +"(280, 'pinna', 'FRUTAS'),"
            +"(281, 'piscina', 'LUGARES'),"
            +"(282, 'pizza', 'ALIMENTOS'),"
            +"(283, 'poco', 'NOCIONES'),"
            +"(284, 'policia', 'PROFESIONES'),"
            +"(285, 'pollito', 'ANIMALES'),"
            +"(286, 'pollo', 'ALIMENTOS'),"
            +"(287, 'prima', 'FAMILIA'),"
            +"(288, 'primo', 'FAMILIA'),"
            +"(289, 'profesor', 'PROFESIONES'),"
            +"(290, 'pulsera', 'ACCESORIOS'),"
            +"(291, 'q', 'ABECEDARIO'),"
            +"(292, 'quiero', 'SENTIMIENTOS'),"
            +"(293, 'r', 'ABECEDARIO'),"
            +"(294, 'radio', 'TECNOLOGIA'),"
            +"(295, 'rapido', 'NOCIONES'),"
            +"(296, 'raton', 'ANIMALES'),"
            +"(297, 'raton', 'TECNOLOGIA'),"
            +"(298, 'rectangulo', 'FIGURAS'),"
            +"(299, 'regla', 'UTILES'),"
            +"(300, 'reloj', 'ACCESORIOS'),"
            +"(301, 'restaurante', 'LUGARES'),"
            +"(302, 'rojo', 'COLORES'),"
            +"(303, 'rosado', 'COLORES'),"
            +"(304, 's', 'ABECEDARIO'),"
            +"(305, 'sabado', 'TEMPORALIDAD'),"
            +"(306, 'sacapunta', 'UTILES'),"
            +"(307, 'saco', 'PRENDAS'),"
            +"(308, 'sala', 'LUGARES'),"
            +"(309, 'salchichas', 'ALIMENTOS'),"
            +"(310, 'sandia', 'FRUTAS'),"
            +"(311, 'sapo', 'ANIMALES'),"
            +"(312, 'segundo', 'TEMPORALIDAD'),"
            +"(313, 'seis', 'NUMEROS'),"
            +"(314, 'semana', 'TEMPORALIDAD'),"
            +"(315, 'sentarse', 'NOCIONES'),"
            +"(316, 'septiembre', 'TEMPORALIDAD'),"
            +"(317, 'serpiente', 'ANIMALES'),"
            +"(318, 'siete', 'NUMEROS'),"
            +"(319, 'sobrina', 'FAMILIA'),"
            +"(320, 'sobrino', 'FAMILIA'),"
            +"(321, 'sombrero', 'PRENDAS'),"
            +"(322, 'supermercado', 'LUGARES'),"
            +"(323, 't', 'ABECEDARIO'),"
            +"(324, 'tarde', 'TEMPORALIDAD'),"
            +"(325, 'te amo', 'SENTIMIENTOS'),"
            +"(326, 'teclado', 'TECNOLOGIA'),"
            +"(327, 'television', 'TECNOLOGIA'),"
            +"(328, 'ten', 'TRANSPORTE'),"
            +"(329, 'tia', 'FAMILIA'),"
            +"(330, 'tiburon', 'ANIMALES'),"
            +"(331, 'tigre', 'ANIMALES'),"
            +"(332, 'tio', 'FAMILIA'),"
            +"(333, 'tomate', 'VERDURAS'),"
            +"(334, 'tortuga', 'ANIMALES'),"
            +"(335, 'trabajo', 'LUGARES'),"
            +"(336, 'tres', 'NUMEROS'),"
            +"(337, 'triangulo', 'FIGURAS'),"
            +"(338, 'triste', 'SENTIMIENTOS'),"
            +"(339, 'tronco', 'ANATOMIA'),"
            +"(340, 'u', 'ABECEDARIO'),"
            +"(341, 'universidad', 'LUGARES'),"
            +"(342, 'uno', 'NUMEROS'),"
            +"(343, 'uva', 'FRUTAS'),"
            +"(344, 'v', 'ABECEDARIO'),"
            +"(345, 'vaca', 'ANIMALES'),"
            +"(346, 'verde', 'COLORES'),"
            +"(347, 'viernes', 'TEMPORALIDAD'),"
            +"(348, 'violeta', 'COLORES'),"
            +"(349, 'voleibol', 'DEPORTES'),"
            +"(350, 'w', 'ABECEDARIO'),"
            +"(351, 'whatsapp', 'TECNOLOGIA'),"
            +"(352, 'x', 'ABECEDARIO'),"
            +"(353, 'y', 'ABECEDARIO'),"
            +"(354, 'yuca', 'VERDURAS'),"
            +"(355, 'z', 'ABECEDARIO'),"
            +"(356, 'zanahoria', 'VERDURAS'),"
            +"(357, 'zapato', 'PRENDAS'),"
            +"(358, 'zoologico', 'LUGARES')";

}