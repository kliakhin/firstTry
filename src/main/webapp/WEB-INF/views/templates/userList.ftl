<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body>
<#include "header.ftl">
<h1>User list:</h1>

<table style="width:100%" class="table">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
<#list users as user>
    <tr>
        <td><a href="/user/${user.id}">${user.id}</a></td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
    </tr>
</#list>
</table>

<#include "newUser.ftl"/>
</body>
</html>