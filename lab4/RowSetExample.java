import java.sql.*;
import javax.sql.rowset.*;

public class RowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java_test";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowSet = factory.createCachedRowSet();

            rowSet.setUrl(url);
            rowSet.setUsername(username);
            rowSet.setPassword(password);

            rowSet.setCommand("SELECT * FROM student");

            rowSet.execute();

            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");
                int roll = rowSet.getInt("roll");
                int age = rowSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Roll: " + roll + ", Age: " + age);
            }

            // Close the rowSet
            rowSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}