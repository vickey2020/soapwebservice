<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="dojo/dijit/themes/dijit.css">
<link rel="stylesheet" type="text/css"
	href="dojo/dijit/themes/claro/claro.css">
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	data-dojo-config="isDebug: false, async: true, parseOnLoad: true"
	src="dojo/dojo/dojo.js"></script>
<script type="text/javascript">
require(
// Set of module identifiers
[ "dojo", "dojo/parser", "dijit/layout/TabContainer", "dijit/layout/ContentPane","dojo/cookie" ],
// Callback function, invoked on dependencies evaluation results
function(dojo) {
	dojo.ready(function() {

	});
});
</script>
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
    bottom: -300px;
    height: auto;
    left: -20px;
    position: absolute;
    right: -40px;
    top: -20px;
    width: auto;
    z-index: 0;
}
.tabBody {
    background-size: cover;
    font-family: "Exo",sans-serif;
    font-size: 20px;
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
    left: calc(50% - 25px);
    position: absolute;
    top: calc(50% - 250px);
    z-index: 2;
}
.header div {
    color: #fff;
    float: left;
    font-family: "Exo",sans-serif;
    font-size: 40px;
    font-weight: 400;
}
.header div span {
    color: #5379fa !important;
}
.login {
    font-family: "Exo",sans-serif;
    height: 100px;
    left: calc(50% - 50px);
    padding: 10px;
    position: absolute;
    top: calc(50% - 75px);
    width: 100px;
    z-index: 1;
}

</style>
</head>
<body class="claro">
<form>
<div class="body"></div>
<div class="grad"></div>
		<div class="header">
			<div>Welcome</div>
		</div>
		
		
 
  <div class="row">
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>ABC</p>
		<p>
			<a class="btn btn-default" href="hello/kiran" role="button">View Policy details</a>
		</p>
	</div>
	
  </div>
		
			<div id="TabContainer" class=login style="height: 500px; width: 500px; font-style: italic; font-family: Courier New; color: black;"
				data-dojo-type="dijit.layout.TabContainer"
				data-dojo-props="tabPosition:'left-h'">
				<div id="Tab1" class=tabBody style="height:50px;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Dental'"><a class="btn btn-default" href="hello/kiran" role="button">View Policy details</a></div>
				<!-- <div id="Tab1" class=tabBody style="height:50px;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Dental'">Pending Amount:Rs.1000</div>
				<div id="Tab2" class=tabBody style="height: 50px;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'Vehicle Insurance'">Pending Amount:Rs 10000</div>
				<div id="Tab3" class=tabBody style="height: 50px;"
					data-dojo-type="dijit.layout.ContentPane"
					data-dojo-props="title:'LIC',selected:true">Pending Amount:Rs 1200</div> -->
			</div>
			 <script src='http://codepen.io/assets/libs/fullpage/jquery.js'></script>
</form>
 
 
</body>
</html>