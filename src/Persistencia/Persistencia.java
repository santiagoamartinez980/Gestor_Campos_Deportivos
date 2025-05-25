
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Persistencia {

    public static Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/Gestor_Campos_Deportivos";
        String usuario = "root";
        String contraseña = "1A2B3C#HOLASQL*siempre";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✅");
            return conexion;
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
            return null;

    }
}
}
