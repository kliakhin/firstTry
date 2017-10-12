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
            <th><a href="all?order=id">Id</a></th>
            <th><a href="all?order=userName">Name</a></th>
            <th><a href="all?order=email">Email</a></th>
            <th><a href="all?order=age">Age</a></th>
            <th><a href="all?order=phoneNumber">Phone</a></th>
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
<#if pages??>
    <#list pages as page>
        <span><a href="/user/all?page=${page}">${page} ;</a></span>
    </#list>
</#if>
</div>
<a href="create">Create new</a>
</body>
</html>