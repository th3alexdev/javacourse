package JDBC;

import java.sql.*;

public class JDBCI {
    public static void main(String[] args) throws SQLException {

        /*
          This is one way to make the connection,
          but it has some problems in the complexity of the code.
        */
        final String DB_HOST = "jdbc:mysql://localhost:3306/gamestore?serverTimezone=UTC";
        final String DB_USERNAME = "root2";
        final String DB_PASSWORD = "";

        Connection conn = null;
        Statement query = null;
        ResultSet result = null;

        try {
            conn = DriverManager.getConnection(DB_HOST, DB_USERNAME, DB_PASSWORD);
            query = conn.createStatement();
            result = query.executeQuery("SELECT * FROM clientes");

            while (result.next()) {
                System.out.print(result.getInt(1)); // idClient
                System.out.print(" | ");
                System.out.print(result.getString(2)); // client_name
                System.out.print(" | ");
                System.out.print(result.getString(3)); // lastname_client
                System.out.print(" | ");
                System.out.print(result.getTimestamp(6)); // birthdate
                System.out.print(" | ");
                System.out.print(result.getString(7)); // rif
                System.out.print(" | ");
                System.out.println();
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } finally {
            try {
                result.close();
                conn.close();
                query.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
