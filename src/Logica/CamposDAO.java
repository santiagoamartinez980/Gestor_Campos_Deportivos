package Logica;

import Persistencia.Persistencia;
import gestor_campos_deportivos.Campos_Deportivos;
import gestor_campos_deportivos.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;


public class CamposDAO {
    
    public static void llenarComboCampo(String tipoDeporte, JComboBox comboCampo) {
         Connection conexion = Persistencia.conectar();


        if (conexion != null) {
            String sql = "SELECT nombre FROM campos_deportivos WHERE tipoDeporte = ?";

            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, tipoDeporte); 
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
    
    
    public static Campos_Deportivos obtenerInfoPorNombre(String nombre) {
        Connection conexion = Persistencia.conectar();
        Campos_Deportivos campo = null; 

        if (conexion != null) {
            String sql = "SELECT * FROM campos_deportivos WHERE nombre = ?";

            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nombre);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String tipoDeporte = rs.getString("tipoDeporte");
                    String ubicacion = rs.getString("ubicacion");
                    int precioPorHora = rs.getInt("precioPorHora");
                    String estado = rs.getString("estado");
                    String techado = rs.getString("techado");
                    String urlFoto = rs.getString("urlFoto");

                    campo = new Campos_Deportivos(nombre, tipoDeporte, ubicacion, precioPorHora, estado, techado, urlFoto);
                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al obtener campo: " + e.getMessage());
            }
        }

        return campo; 
    }


    
    
 }

 