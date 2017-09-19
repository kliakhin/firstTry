<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body>
<#include "header.ftl">
<h1>User</h1>
<br>
<h2>UserId = ${user.id}</h2>
<h2>UserName = ${user.name}</h2>
<h2>UserEmail = ${user.email}</h2>
<h2>UserAge = ${user.age}</h2>

<a href="/users"> Back </a>
</body>
</html>