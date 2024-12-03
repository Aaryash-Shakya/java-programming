<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<head>
    <title>Set Cookie</title>
</head>
<body>
    <h1>Set a Cookie</h1>
    <form action="setCookie.jsp" method="post">
        Enter your name: <input type="text" name="username" />
        <input type="submit" value="Submit" />
    </form>

    <% 
        String username = request.getParameter("username");
        if (username != null && !username.isEmpty()) {
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(userCookie);
            out.println("<p>Cookie set for username: " + username + "</p>");
        }
    %>
</body>
</html>
