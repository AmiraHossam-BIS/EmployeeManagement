import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/school_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "224466";

    public static Connection getConnection() {
try {
    Connection conn = DriverManager .getConnection(URL,USER,PASSWORD);
  return conn;
} catch (Exception e) {
    throw new RuntimeException(e);
}

    }
}