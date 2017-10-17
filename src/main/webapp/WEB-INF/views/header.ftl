<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<#import "/spring.ftl" as spring/>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">MyApp</a>
        </div>
        <ul class="nav navbar-nav navbar-left">
            <li class="active"><a href="/user/all"><@spring.message "header.users"/></a></li>
            <li class=""><a href="/goods/all"><@spring.message "header.goods"/></a></li>
            <li class=""><a href="/payment/all">Payments</a></li>
            <li class=""><a href="/basket/all">Baskets</a></li>
        </ul>
    </div>
</nav>