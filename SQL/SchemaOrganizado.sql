-- Crear base de datos
CREATE DATABASE IF NOT EXISTS Gestor_Campos_Deportivos;
USE Gestor_Campos_Deportivos;

-- Tabla: Clientes
CREATE TABLE IF NOT EXISTS clientes (
    numeroIdentificacion VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    telefono VARCHAR(20),
    correo VARCHAR(100),
    usuario VARCHAR(50),
    contraseña VARCHAR(255)
);

-- Tabla: Campos Deportivos
CREATE TABLE IF NOT EXISTS campos_deportivos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipoDeporte VARCHAR(50) NOT NULL,
    ubicacion VARCHAR(150) NOT NULL,
    precioPorHora INT NOT NULL,
    estado VARCHAR(50) NOT NULL,           -- Ej: Disponible, Ocupado, Mantenimiento
    techado VARCHAR(10) NOT NULL,          -- Ej: Sí, No
    urlFoto VARCHAR(255),
    CONSTRAINT nombre_unico UNIQUE (nombre)
);
ALTER TABLE campos_deportivos AUTO_INCREMENT = 187901;

-- Tabla: Reservas
CREATE TABLE IF NOT EXISTS Reserva (
    id_reserva BIGINT PRIMARY KEY AUTO_INCREMENT,
    usuario_cliente VARCHAR(100),
    nombre_cliente VARCHAR(100) NOT NULL,
    apellido_cliente VARCHAR(100) NOT NULL,
    nombre_campo VARCHAR(100) NOT NULL,
    tipo_deporte VARCHAR(100) NOT NULL,
    fecha DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    precio_total INT
);
ALTER TABLE Reserva AUTO_INCREMENT = 108901;

-- Tabla: Administrador
CREATE TABLE IF NOT EXISTS Administrador (
    usuario VARCHAR(50) PRIMARY KEY,
    contraseña VARCHAR(50),
    nombre VARCHAR(50),
    apellidos VARCHAR(50)
);

-- Insert de ejemplo para Administrador
INSERT INTO Administrador (usuario, contraseña, nombre, apellidos)
VALUES ('admin', 'admin', 'defecto', 'defecto');
