package TalonarioConsala.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionsqlserver {

    // URL con Windows Authentication
    private static final String URL = 
        "jdbc:sqlserver://localhost:1433;databaseName=talonarioparcial;integratedSecurity=true;encrypt=false";

    // Driver
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    // Método para obtener conexión
    public Connection getConexion() throws SQLException {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error: Driver no encontrado", e);
        }
    }

    // Método para cerrar conexión
    public void close(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}
