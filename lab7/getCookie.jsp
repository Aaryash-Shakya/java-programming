<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<head>
    <title>Get Cookie</title>
</head>
<body>
    <h1>Retrieve Cookie</h1>
    <%
        Cookie[] cookies = request.getCookies();
        String username = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    username = cookie.getValue();
                    break;
                }
            }
        }

        if (username != null) {
            out.println("<p>Welcome back, " + username + "!</p>");
        } else {
            out.println("<p>No cookie found. Please <a href='setCookie.jsp'>set your name</a>.</p>");
        }
    %>
</body>
</html>
