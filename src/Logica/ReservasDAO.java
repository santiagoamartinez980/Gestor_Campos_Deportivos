package Logica;

import Persistencia.Persistencia;
import gestor_campos_deportivos.Campos_Deportivos;
import gestor_campos_deportivos.Clientes;
import gestor_campos_deportivos.Reservas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ReservasDAO {
    
    
public static boolean almacenarReserva(Reservas reserva) {
    Connection conexion = null;
    PreparedStatement stmt = null;
    boolean exito = false;
    
    try {
        conexion = Persistencia.conectar();
        
        if (conexion != null) {
            String sql = "CALL agregarReserva(?, ?, ?, ?, ?, ?, ?, ?)";
            Clientes cliente = reserva.getCliente();
            Campos_Deportivos campo = reserva.getCampo();
            
            stmt = conexion.prepareStatement(sql);
            stmt.setString(1, cliente.getUsuario());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellidos());
            stmt.setString(4, campo.getNombre());
            stmt.setString(5, campo.getTipoDeporte());
            
            // Convertir fecha de util.Date a sql.Date
            java.util.Date fechaUtil = reserva.getFecha(); 
            java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
            stmt.setDate(6, fechaSQL);
            
            // Convertir hora de "h:mm a" a "HH:mm:ss"
            String hora12 = reserva.getHora(); // Ejemplo: "4:00 PM"
            SimpleDateFormat amPmFormat = new SimpleDateFormat("h:mm a", Locale.US);
            SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat("HH:mm:ss");
            
            try {
                java.util.Date date = amPmFormat.parse(hora12);
                String hora24 = twentyFourHourFormat.format(date);
                stmt.setString(7, hora24);
                System.out.println("Almacenando reserva con hora: " + hora24);
            } catch (ParseException e) {
                System.out.println("Error al parsear la hora: " + e.getMessage());
                e.printStackTrace();
                stmt.setString(7, hora12); // Usar la hora original si hay error
            }
            
            int precioFinal = reserva.calcularPrecioFinal(campo.getPrecioPorHora(), reserva.getJornada());
            stmt.setInt(8, precioFinal);
            
            int resultado = stmt.executeUpdate();
            exito = (resultado > 0);
            
            System.out.println(exito ? "¡Operación exitosa!" : "No se realizó ningún cambio en la base de datos");
            return exito;
        }
        
        return false;
    } catch (SQLException e) {
        System.out.println("¡Operación Fallida!\n" + e.getMessage());
        e.printStackTrace();
        return false;
    } finally {
        
        if (stmt != null) try { stmt.close(); } catch (SQLException e) { /* ignorar */ }
        if (conexion != null) try { conexion.close(); } catch (SQLException e) { /* ignorar */ }
    } }
    
    public static void consultaReservas(DefaultTableModel modelo, JTable tablaDestino, String usuario) {
        Connection conexion = Persistencia.conectar();
        String sql = "SELECT id_reserva, usuario_cliente, nombre_cliente, apellido_cliente, nombre_campo, tipo_deporte, fecha, hora_inicio, hora_registro, precio_total FROM Reserva WHERE usuario_cliente = ?";
        ResultSet rs = null;

        try {
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, usuario); 
            rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("id_reserva"),
                    rs.getString("usuario_cliente"),
                    rs.getString("nombre_cliente"),
                    rs.getString("apellido_cliente"),
                    rs.getString("nombre_campo"),
                    rs.getString("tipo_deporte"),
                    rs.getDate("fecha"),
                    rs.getTime("hora_inicio"),
                    rs.getString("hora_registro"),
                    rs.getDouble("precio_total")
                };

                modelo.addRow(fila);
            }

            tablaDestino.setModel(modelo); // Se lo pasas como parámetro

        } catch (SQLException e) {
            System.out.println("¡Operación Fallida!\n" + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (conexion != null) conexion.close(); } catch (Exception e) {}
        }
    }

    public static void eliminarReserva(int idReserva) throws SQLException {
        Connection conexion = Persistencia.conectar();
        String sql = "CALL eliminarReserva(?)";
        PreparedStatement stmt = conexion.prepareStatement(sql);
        stmt.setInt(1, idReserva);
        stmt.executeUpdate();

    }
    
    public static boolean verificarReservaDisponible(String nombre, Date fecha, String hora) throws SQLException {
    Connection conexion = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean disponible = true;
    
        try {
            conexion = Persistencia.conectar();
            String sql = "SELECT COUNT(*) AS cantidad FROM reserva WHERE nombre_campo = ? AND fecha = ? AND hora_inicio = ?";
            pst = conexion.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setDate(2, new java.sql.Date(fecha.getTime()));

            // Convertir la hora al formato que espera la base de datos
            SimpleDateFormat inputFormat = new SimpleDateFormat("h:mm a", Locale.US);
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            try {
                java.util.Date parsedTime = inputFormat.parse(hora);
                String formattedTime = outputFormat.format(parsedTime);
                pst.setString(3, formattedTime);
                System.out.println("Verificando disponibilidad: " + nombre + ", fecha: " + fecha + ", hora: " + formattedTime);
            } catch (ParseException e) {
                System.out.println("Error al parsear la hora en verificarReservaDisponible: " + e.getMessage());
                e.printStackTrace();
                pst.setString(3, hora); // Si falla, usamos la hora original
            }

            rs = pst.executeQuery();

            if (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                disponible = (cantidad == 0); // Si hay registros, no está disponible
                System.out.println("Cantidad de reservas encontradas: " + cantidad + ", disponible: " + disponible);
            }

            return disponible;
        } catch (SQLException e) {
            System.out.println("Error al verificar disponibilidad: " + e.getMessage());
            e.printStackTrace();
            throw e;
        } finally {
            // Cerrar recursos en orden inverso
            if (rs != null) try { rs.close(); } catch (SQLException e) { /* ignorar */ }
            if (pst != null) try { pst.close(); } catch (SQLException e) { /* ignorar */ }
            if (conexion != null) try { conexion.close(); } catch (SQLException e) { /* ignorar */ }
        }
    }
}


    

