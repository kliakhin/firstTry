<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>User info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${user.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${user.email}</td>
        </tr>
        <td>Age</td>
        <td>${user.age}</td>
        </tr>
    </table>
</div>

<div class="table-responsive">
    <caption>User goods</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>Name</a></td>
            <td>Price</a></td>
        </tr>
    <#list user.goodsList as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
        </tr>
    <#else>
        <h1>Empty goods</h1>
    </#list>

    </table>
</div>
<a type="button" href="/users" class="button">Back</a>
</body>
</html>