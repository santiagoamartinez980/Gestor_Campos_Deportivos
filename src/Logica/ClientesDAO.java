    
package Logica;

import Persistencia.Persistencia;

import gestor_campos_deportivos.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesDAO {
    
    public static void registrarCliente(Clientes cliente) {
        Connection conexion = Persistencia.conectar();
        
        if (conexion != null) {
            String sql = "CALL agregarCliente(?, ?, ?, ?, ?, ?, ?)";

            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, cliente.getNumeroIdentificacion());
                stmt.setString(2, cliente.getNombre());
                stmt.setString(3, cliente.getApellidos());
                stmt.setString(4, cliente.getTelefono());
                stmt.setString(5, cliente.getCorreo());
                stmt.setString(6, cliente.getUsuario());
                stmt.setString(7, cliente.getHashContraseña()); 
                stmt.executeUpdate();
                System.out.println( "¡Operación exitosa!");

                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println( "¡Operación Fallida!\n" + e.getMessage());}}        
    }
    
    public static boolean validarExistencia(Clientes cliente) {
        Connection conexion = Persistencia.conectar();

    if (conexion != null) {
        String sql = "CALL validarUsuario(?)";
        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, cliente.getUsuario());  // Aquí usamos getUsuario()
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Si hay resultados, el usuario existe
        } catch (Exception e) {
            System.out.println("Error al validar existencia: " + e.getMessage());
        }
    }

    return false;
    }
    
    public static boolean validarCedula(Clientes cliente) {
        Connection conexion = Persistencia.conectar();

    if (conexion != null) {
        String sql = "CALL validarCedula(?)";
        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, cliente.getNumeroIdentificacion());  // Aquí usamos getUsuario()
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Si hay resultados, el usuario existe
        } catch (Exception e) {
            System.out.println("Error al validar existencia: " + e.getMessage());
        }
    }

    return false;
    }

    public static boolean inisioSesion(String usuario, String contraseña) {
        Connection conexion = Persistencia.conectar();
        if (conexion != null) {
            String sql = "SELECT * FROM Clientes WHERE usuario = ? AND contraseña = ?";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, usuario);
                stmt.setString(2, contraseña);
                ResultSet rs = stmt.executeQuery();
                return rs.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            }        
        return false;
    }

    public static String obtenerContraseñaPorUser(String usuario) {
    String contraseñaCodificada = null;
    Connection conexion = Persistencia.conectar();  // Usa tu método para conectar

    if (conexion != null) {
        String sql = "SELECT contraseña FROM clientes WHERE usuario = ?";

        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, usuario);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                contraseñaCodificada = rs.getString("contraseña");  // obtiene el valor de la columna "contraseña codificada"
            }

            rs.close();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "✅ Usuario incorrecto o no encontrado");
        }
    }

    return contraseñaCodificada;
}

public static Clientes obtenerDatosClientes(String usuario) {
    Connection conexion = Persistencia.conectar();
    Clientes persona = null;

    if (conexion != null) {
        String sql = "SELECT * FROM clientes WHERE usuario = ?";

        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, usuario); // <-- AQUI se pasa el parámetro
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String cedula = rs.getString("numeroIdentificacion");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String hashClave = rs.getString("contraseña");

                persona = new Clientes(cedula, nombre, apellidos, telefono, correo, usuario, hashClave);
            }

            rs.close();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener cliente: " + e.getMessage());
        }
    }

    return persona;
}

}
