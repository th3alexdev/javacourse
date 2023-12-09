package JDBC;

import java.sql.*;

public class JDBCII {
    public static void main(String[] args) throws SQLException {

        /*
          This is one way to make the connection,
          but it has some problems in the complexity of the code.
        */

        final String DB_HOST = "jdbc:mysql://localhost:3306/gamestore?serverTimezone=UTC";
        final String DB_USERNAME = "root";
        final String DB_PASSWORD = "";

        try (
             Connection conn = DriverManager.getConnection(DB_HOST, DB_USERNAME, DB_PASSWORD);
             Statement query = conn.createStatement();
             ResultSet result = query.executeQuery("SELECT * FROM clientes")
             ) {

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
        }
    }
}
