<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />
</head>
<body class="container">
<#include "WEB-INF/views/header.ftl">
<div class="container">

<@security.authorize access="isAuthenticated()">
    <h1>Hello, <@security.authentication property="principal.username"/></h1>
</@security.authorize>

    <h2>The best app ever!</h2>
</div>

</body>
</html>