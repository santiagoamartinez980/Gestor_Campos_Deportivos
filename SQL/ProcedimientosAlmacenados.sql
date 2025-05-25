DELIMITER $$

-- Agregar Cliente
CREATE PROCEDURE agregarCliente(
    IN p_numeroIdentificacion VARCHAR(15),
    IN p_nombre VARCHAR(50),
    IN p_apellidos VARCHAR(50),
    IN p_telefono VARCHAR(20),
    IN p_correo VARCHAR(100),
    IN p_usuario VARCHAR(50),
    IN p_contraseñaCodificada VARCHAR(255)
)
BEGIN
    INSERT INTO clientes (
        numeroIdentificacion, nombre, apellidos,
        telefono, correo, usuario, contraseña
    )
    VALUES (
        p_numeroIdentificacion, p_nombre, p_apellidos,
        p_telefono, p_correo, p_usuario, p_contraseñaCodificada
    );
END $$

-- Validar existencia de usuario
CREATE PROCEDURE validarUsuario(IN user VARCHAR(50))
BEGIN
    SELECT * FROM clientes WHERE usuario = user;
END $$

-- Validar existencia de cédula
CREATE PROCEDURE validarCedula(IN numero VARCHAR(50))
BEGIN
    SELECT * FROM clientes WHERE numeroIdentificacion = numero;
END $$

-- Agregar Reserva
CREATE PROCEDURE agregarReserva(
    IN p_usuario VARCHAR(100),
    IN p_nombreCliente VARCHAR(100),
    IN p_apellidoCliente VARCHAR(100),
    IN p_nombreCampo VARCHAR(100),
    IN p_tipoDeporte VARCHAR(100),
    IN p_fecha DATE,
    IN p_hora TIME,
    IN p_precioFinal INT
)
BEGIN
    INSERT INTO Reserva (
        usuario_cliente, nombre_cliente, apellido_cliente,
        nombre_campo, tipo_deporte, fecha, hora_inicio, precio_total
    )
    VALUES (
        p_usuario, p_nombreCliente, p_apellidoCliente,
        p_nombreCampo, p_tipoDeporte, p_fecha, p_hora, p_precioFinal
    );
END $$

-- Eliminar Reserva
CREATE PROCEDURE eliminarReserva(IN p_id INT)
BEGIN
    DELETE FROM Reserva WHERE id_reserva = p_id;
END $$

-- Agregar Campo Deportivo
CREATE PROCEDURE agregarCampoDeportivo(
    IN p_nombre VARCHAR(100),
    IN p_tipoDeporte VARCHAR(50),
    IN p_ubicacion VARCHAR(150),
    IN p_precioPorHora INT,
    IN p_estado VARCHAR(50),
    IN p_techado VARCHAR(10),
    IN p_urlFoto VARCHAR(255)
)
BEGIN
    INSERT INTO campos_deportivos (
        nombre, tipoDeporte, ubicacion,
        precioPorHora, estado, techado, urlFoto
    )
    VALUES (
        p_nombre, p_tipoDeporte, p_ubicacion,
        p_precioPorHora, p_estado, p_techado, p_urlFoto
    );
END $$

DELIMITER ;