<html>
<head>
    <title>Authentication</title>
</head>
<body>
    <h1>Authentication</h1>
    <form action="/authorize" method="post">
        login: <input name="login"><br>
        password <input name="password"><br>
        <input type="submit">
    </form>
    <br>
    <br>
    <br>
    <form action="auth/logout" method="post">
        <input type="submit" value="Logout">
    </form>
    <h1>{message}</h1>
</body>
</html>