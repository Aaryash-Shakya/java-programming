import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import jakarta.servlet.*;

public class DatabaseServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String url = "jdbc:postgresql://localhost:5432/java_test";
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            pw.println("<p>Connected to the database</p>");
        } catch (SQLException e) {
            pw.println("<p>Failed to Connect</p>");
        }
    }
}
