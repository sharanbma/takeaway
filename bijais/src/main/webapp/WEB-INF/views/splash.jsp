<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="Simplicity Itself" />

<title>Shree Nrusimha Prasada</title>
<link
	href="resources/css/bootstrap.min.css"
	rel="stylesheet" />


<!-- bxSlider CSS file -->
<link
	href="resources/css/jquery.bxslider.css"
	rel="stylesheet" />

<style>
@import url(http://fonts.googleapis.com/earlyaccess/notosanskannada.css)
	;

body {
	font-family: "Noto Sans Kannada", sans-serif;
	font-size: 19.0px;
	line-height: 1.11em;
}
</style>
<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
	color: #FFFFFF;
	background-color: #133900;
	/*background-image: url(resources/img/jasmine.jpg);*/
	font-family: "Helvetica Neue", helvetica, arial, verdana, sans-serif;
}

html,body {
	height: 100%;
}

.sidebar-nav {
	padding: 9px 0;
}

.nav .gn-signup {
	color: #FF0084;
}

#main-content {
	background-color: #133900;
}

h1 {
	font-size: 3em;
	font-weight: bold;
}

h1,h2,h3 {
	font-size: 3em;
	line-height: 1em;
}

h4 {
	color: #FFD173;
}

#fl-mayday {
	font-size: 1.2em;
}

#home .bd {
	height: 36em;
	left: 50%;
	margin-left: -32em;
	margin-top: -5em;
	position: absolute;
	text-align: center;
	top: 40%;
	width: 64em;
	text-align: center;
}

.find-us {
	left: 40%;
	margin-top: 15em;
	font-size: 12pt;
	position: absolute;
	text-align: center;
	top: 50%;
	color: #FFD173;
	position: absolute;
}

.find-us p {
	text-align: center;
	margin: 0;
}

#textArea {
	background-color: #133900;
	display: block;
}

#confirmation {
	display: none;
}

#alert {
	text-decoration: none;
}

.btn-default { .buttonBackground (#297BBC, #fff);
	
}

.navbar-form input {
	margin-top: 0px !important;
}

.btn-custom {
	background-color: #297BBC !important;
	background-repeat: repeat-x;
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#2d95b7",
		endColorstr="#23748e");
	background-image: -khtml-gradient(linear, left top, left bottom, from(#2d95b7),
		to(#23748e));
	background-image: -moz-linear-gradient(top, #2d95b7, #23748e);
	background-image: -ms-linear-gradient(top, #2d95b7, #23748e);
	background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #2d95b7),
		color-stop(100%, #23748e));
	background-image: -webkit-linear-gradient(top, #2d95b7, #23748e);
	background-image: -o-linear-gradient(top, #2d95b7, #23748e);
	background-image: linear-gradient(#2d95b7, #23748e);
	border-color: #23748e #23748e hsl(195, 60%, 32.5%);
	color: #FFD173 !important;
	font-size: 1em;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.16);
	-webkit-font-smoothing: antialiased;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.16);
}

#point1 {
	display: none;
	float: left;
	height: 40px;
	width: 300px;
	font-size: 2em;
	color: #277F9B;
}

#point2 {
	display: none;
	float: left;
	height: 40px;
	width: 150px;
	font-size: 2em;
	color: #277F9B;
}

#point3 {
	display: none;
	float: left;
	height: 40px;
	width: 150px;
	font-size: 2em;
	color: #277F9B;
}

#point4 {
	display: none;
	float: left;
	height: 40px;
	width: 400px;
	font-size: 2em;
	color: #277F9B;
}

#point5 {
	display: none;
	float: left;
	height: 40px;
	width: 150px;
	font-size: 2em;
	color: #277F9B;
}

#titlePoint {
	display: none;
	float: left;
	height: 40px;
	width: 200px;
	font-size: 1em;
	color: #277F9B;
}

#goodFood {
	margin-left: 60px;
}

#perfect {
	display: none;
	margin-left: 60px;
	font-size: 1em;
	color: #277F9B;
}

.comma {
	color: #FFD173;
	font-size: 1.5em;
}

.qualityPoint1 {
	color: #277F9B;
	font-size: 2em;
	display: block;
	height: 90px;
}

.qualityPoint2 {
	color: #277F9B;
	font-size: 2em;
	display: block;
	height: 90px;
}

.bottom {
	color: #FFD173;
	font-size: 12pt;
	text-align: center;
}

.error-msg {
	color: #BC5916;
}

.success-msg {
	color: #FFC301;
}
</style>
<!-- See http://twitter.github.com/bootstrap/scaffolding.html#responsive -->

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>

	<div style="clear: both"></div>
	<div id="main-content">
		<div id="home">
			<div id="goodFood">
				<div id="titlePoint">Good Food means..</div>
				<div id="point1">Fresh and Pure.</div>
				<div id="point2">Tastes.</div>
				<div id="point3">Looks.</div>
				<div id="point4">and smells delicious.</div>
				<div id="point5">Nutritious value.</div>
			</div>
			<div class="bd">
				<h1>Shree Nrusimha Prasada</h1>
				<!-- <a id="alert" href="#"><h4>Get Notified</h4></a>-->
				<div style="clear: both">&nbsp;</div>
				<div id="textArea">

					<p class="error-msg">${errorMessage}</p>
					<p class="success-msg">${successMessage}</p>
					<form:form action="/bijais-web/storeDetails"
						commandName="customerInfo" class="navbar-form navbar-left"
						method="POST">

						<div class="form-group">
							<form:input path="emailAddress" class="form-control"
								placeholder="Please Enter Your email ID" />
							<button type="submit" class="btn btn-custom">
								<b>Keep me updated</b>
							</button>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
	<div class="bottom">
		<div class="qualityPoint1">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Hygiene is paramount.<span class="comma">&#8221;</span>
			</div>
		</div>
		<div class="qualityPoint1">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Utmost care goes into the
				preparation of vegetables used in our cooking.<span class="comma">&#8221;</span>
			</div>
		</div>
		<div class="qualityPoint2">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Care is taken to ensure that the offerings are nutritious and healthy.<span class="comma">&#8221;</span>
			</div>
		</div>
		<div class="qualityPoint2">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Premium quality Sona Masoori Rice is used in all rice preparations.<span class="comma">&#8221;</span>
			</div>
		</div>
		<div class="qualityPoint2">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Pure "Nandini" brand ghee from KMF is used in preparation of sweets, seasoning.<span class="comma">&#8221;</span>
			</div>
		</div>
		<div class="qualityPoint2">
			<div style="padding-top: 20px">
				<span class="comma">&#8220;</span>Care is taken to ensure that the offerings are nutritious and healthy.<span class="comma">&#8221;</span>
			</div>
		</div>
	</div>
	<div class="find-us">
		<p>Phone Number: 9980890573</p>
		<p>1424/5, 20th B Cross</p>
		<p>9th Main road MCECHS Layout</p>
		<p>B Block Sahakar Nagar</p>
		<p>Bangalore 560092</p>
	</div>
	<script src="http://code.jquery.com/jquery-latest.min.js"
		type="text/javascript"></script>
	<script
		src="resources/js/jquery.bxslider.min.js"></script>
	<SCRIPT>
		$(document).ready(function() {
			$("#titlePoint").delay(1000).fadeIn();
			$("#point1").delay(2000).fadeIn();
			$("#point2").delay(3000).fadeIn();
			$("#point3").delay(4000).fadeIn();
			$("#point4").delay(5000).fadeIn();
			$("#perfect").delay(7000).fadeIn();
			$('.bottom').delay(9500).bxSlider({
				auto : true,
				autoControls : false
			});
		});
	</SCRIPT>
</body>
</html>