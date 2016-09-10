<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8">

  <title>Metlife Login</title>

    <style>
@import "http://fonts.googleapis.com/css?family=Exo:100,200,400";
@import "http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300";
body {
    background: #fff none repeat scroll 0 0;
    color: #fff;
    font-family: Arial;
    font-size: 12px;
    margin: 0;
    padding: 0;
}
.body {
    background-image: url("http://newmeadowlandsmarket.com/wp-content/uploads/2015/02/blue-modern-city-background.jpg");
    background-size: cover;
    bottom: -40px;
    height: auto;
    left: -20px;
    position: absolute;
    right: -40px;
    top: -20px;
    width: auto;
    z-index: 0;
}
.grad {
    bottom: -40px;
    height: auto;
    left: -20px;
    opacity: 0.7;
    position: absolute;
    right: -40px;
    top: -20px;
    width: auto;
    z-index: 1;
}
.header {
    left: calc(50% + 300px);
    position: absolute;
    top: calc(50% - 250px);
    z-index: 2;
}
.header div {
    color: #fff;
    float: left;
    font-family: "Exo",sans-serif;
    font-size: 50px;
    font-weight: 400;
}
.header div span {
    color: #5379fa !important;
}
.login {
    height: 150px;
    left: calc(50% + 240px);
    padding: 10px;
    position: absolute;
    top: calc(50% - 175px);
    width: 350px;
    z-index: 2;
}
.login input[type="text"] {
    background: transparent none repeat scroll 0 0;
    border: 1px solid rgba(255, 255, 255, 5);
    border-radius: 10px;
    color: #fff;
    font-family: "Exo",sans-serif;
    font-size: 16px;
    font-weight: 400;
    height: 30px;
    padding: 4px;
    width: 250px;
}
.login input[type="password"] {
    background: transparent none repeat scroll 0 0;
    border: 1px solid rgba(255, 255, 255, 5);
    border-radius: 10px;
    color: #fff;
    font-family: "Exo",sans-serif;
    font-size: 16px;
    font-weight: 400;
    height: 30px;
    margin-top: 10px;
    padding: 4px;
    width: 250px;
}
.login input[type="submit"] {
    background: #fff none repeat scroll 0 0;
    border: 1px solid #fff;
    border-radius: 10px;
    color: #a18d6c;
    cursor: pointer;
    font-family: "Exo",sans-serif;
    font-size: 16px;
    font-weight: 400;
    height: 35px;
    margin-top: 10px;
    padding: 6px;
    width: 260px;
}
.login input[type="button"]:hover {
    opacity: 0.8;
}
.login input[type="button"]:active {
    opacity: 0.6;
}
.login input[type="text"]:focus {
    border: 1px solid rgba(255, 255, 255, 0.9);
    outline: medium none;
}
.login input[type="password"]:focus {
    border: 1px solid rgba(255, 255, 255, 0.9);
    outline: medium none;
}
.login input[type="button"]:focus {
    outline: medium none;
}
</style>

    <script src="js/prefixfree.min.js"></script>

</head>

<body>

 <form  method="POST" action="WelcomePolicy">
  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Met<span>Life</span></div>
		</div>
		<br>
		<div class="login">
				<input type="text" placeholder="username" name="user" required><br>
				<input type="password" placeholder="password" name="password" required><br>
				<input type="submit" value="Login">
	</div>

  <script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>
</form>
</body>
</html>