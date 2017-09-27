<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "../header.ftl">
<div class="table-responsive">
    <caption>Goods list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Merchant</th>
        </tr>
    <#list goodsList as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>