<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Spring Security Example </title>
</head>
<body>
<#--<div th:if="${param.error}">-->
    <#--Invalid username and password.-->
<#--</div>-->
<#--<div th:if="${param.logout}">-->
    <#--You have been logged out.-->
<#--</div>-->
<p>
    HELLO
</p>
<form method="post" action="/aa/loginuser">
    <div><label> User Name 2: <input type="text" name="username"/> </label></div>
    <div><label> Password 2: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
</body>
</html>