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

    <a href="/?mylocale=en">English </a> | <a href="/?mylocale=ua">Ukraine </a>
    <h3> <@spring.message "title"/></h3>
    <h3>${.locale}</h3>
</div>

</body>
</html>