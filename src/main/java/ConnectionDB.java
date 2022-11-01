import java.sql.*;

public class ConnectionDB {
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldb", "root", "");
        } catch (SQLException e) {
            System.out.println(e + "\nNose pudo conectar a la Base de Datos.");
        }
        return connection;
    }

    public static void Close(ResultSet resultSet, PreparedStatement statement, Connection conn){
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }

            System.out.println("Disconnected fron BD.");
        } catch (SQLException e) {
            System.out.println("Error en las operaciones a base de datos.");
            e.printStackTrace(System.out);
        }
    }

}

