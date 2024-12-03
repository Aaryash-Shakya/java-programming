import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>Welcome to servlet</b>");
        out.print("</body></html>");

        out.close();
    }
}
