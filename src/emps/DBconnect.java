package emps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    public static Connection connect() {
        Connection conn = null;



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/epmsdb",
                "root",
                "megha@3405"
            );
            System.out.println("Database Connected Successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace(); // ADD THIS
        } catch (SQLException e) {
            System.out.println("SQL Connection Error: " + e.getMessage());
            e.printStackTrace(); // ADD THIS
        }

        return conn;
    }
}
