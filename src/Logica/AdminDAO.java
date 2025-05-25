package Logica;

import Persistencia.Persistencia;
import com.mysql.cj.jdbc.CallableStatement;
import gestor_campos_deportivos.Administrador;
import gestor_campos_deportivos.Campos_Deportivos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AdminDAO {
    
public static void agregarCampo(Campos_Deportivos campo) {
    Connection conexion = Persistencia.conectar();

        
        if (conexion != null) {
            String sql = "CALL agregarCampoDeportivo( ?, ?, ?, ?, ?,?,?)";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, campo.getNombre());
                stmt.setString(2, campo.getTipoDeporte());
                stmt.setString(3, campo.getUbicacion());
                stmt.setInt(4, campo.getPrecioPorHora());
                stmt.setString(5, campo.getEstado());
                stmt.setString(6, campo.getTechado());
                stmt.setString(7, campo.getUrlFoto());

                stmt.execute();
                JOptionPane.showMessageDialog(null, "Campo deportivo guardado exitosamente");

                stmt.close();
                conexion.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos");}
        }
}    
 
public static Administrador obtenerInfoAdmin(String usuario) {
    Administrador admin = null;
    
    String contraseña = null;
    String nombre = null;
    String apellidos = null;
    Connection conexion = Persistencia.conectar();

    if (conexion != null) {
        String sql = "SELECT contraseña, nombre, apellidos FROM administrador WHERE usuario = ?";

        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, usuario);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                contraseña = rs.getString("contraseña");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                
            }
            admin = new Administrador(usuario, contraseña, nombre, apellidos);
            rs.close();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al obtener la contraseña del admin: " + e.getMessage());
        }
        
    }

    return admin;
}
    
    public static int eliminarCampoPorNombre(String nombreCampo) {
        int filasAfectadas = 0;
        Connection conexion = Persistencia.conectar();

        if (conexion != null) {
            try {
                String sql = "DELETE FROM campos_deportivos WHERE nombre = ?";
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nombreCampo);

                // Ejecutar la eliminación real
                filasAfectadas = stmt.executeUpdate();

                stmt.close();
                conexion.close();

                System.out.println("Eliminación completada. Filas afectadas: " + filasAfectadas);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error de conexión a la base de datos.");
        }
    return filasAfectadas;
}

     public static void llenarComboCampoAdmin(JComboBox comboCampo) {
         Connection conexion = Persistencia.conectar();


        if (conexion != null) {
            String sql = "SELECT nombre FROM campos_deportivos";

            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                comboCampo.removeAllItems();

                while (rs.next()) {

                    String nombre = rs.getString("nombre");
                    comboCampo.addItem(nombre);

                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al obtener cliente: " + e.getMessage());
            }
        }
    }
}