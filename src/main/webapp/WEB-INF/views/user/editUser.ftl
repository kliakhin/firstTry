<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">

<form action="update" method="post" name="user" class="form-group">
    <input title="Id" type="number" name="id" value="${user.id}" hidden/>
    <@spring.message "user.name"/>
    <input title="Name" type="text" name="username" value="${user.userName}"/>
    Email
    <input title="Email" type="text" name="email" value="${user.email}"/>
    Age
    <input title="Age" type="number" name="age" value="${user.age}"/>
    <input type="submit" value="Update"/>
</form>
<a type="button" href="/all" class="button">Back</a>
</body>
</html>
