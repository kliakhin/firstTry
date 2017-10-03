<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "*/header.ftl">

<#if errors??>
EROOR:
    <#list errors as error>
    <h1>error</h1><br>
    </#list>
</#if>


<form action="create" method="post" name="user" class="form-group">
    Name
    <input title="Name" type="text" name="userName" "/>
    Email
    <input title="Email" type="text" name="email" "/>
    Age
    <input title="Age" type="number" name="age"/>
    <input type="submit" value="Create"/>
</form>
<a type="button" href="/all" class="button">Back</a>
</body>
</html>
