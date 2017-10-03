<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">
<div class="table-responsive" style="background-color: aqua">
    <caption>Users list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Phone</th>
            <th>Buttons</th>
        </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td>${user.phoneNumber}</td>
            <td><a href="delete/${user.id}">Delete</a>
                <a href="${user.id}?edit=true">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
</div>
<a href="create">Create new</a>
</body>
</html>