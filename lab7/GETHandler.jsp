<html>

<head>
    <title>Using GET MEthod to read form data</title>
</head>

<body>
    <h1>Using GET MEthod to read form data</h1>
    <ul>
        <li>
            <p><b>First Name: </b>
                <%= request.getParameter("first_name") %>
            </p>
        </li>
        <li>
            <p><b>Last Name: </b>
                <%= request.getParameter("last_name") %>
            </p>
        </li>
    </ul>
</body>

</html>