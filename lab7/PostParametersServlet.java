import java.io.*;
import java.util.*;
import jakarta.servlet.*;

public class PostParametersServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        Enumeration e = request.getParameterNames();
        while (e.hasMoreElement s()) {
            String parameterName = (String) e.nextElement();
            pw.println(parameterName + " = ");
            String parameterValue = request.getParameter(parameterName);
            pw.println(parameterValue + "<br>");
        }
        pw.close();
    }
}
