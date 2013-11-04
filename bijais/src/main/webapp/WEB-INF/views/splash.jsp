<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="Simplicity Itself" />

<title>Bijai's Rasoi Mane</title>
<link href="/bijais-web/resources/css/bootstrap.min.css"
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
			<div class="bd">
				<h1>Sri Nrusimha Prasada</h1>
				<!-- <a id="alert" href="#"><h4>Get Notified</h4></a>-->
				<div style="clear: both">&nbsp;</div>
				<div id="textArea">

					<p>${errorMessage}</p>
					<form:form action="/storeDetails" commandName="customerInfo"
						class="navbar-form navbar-left" method="POST">

						<div class="form-group">
							<form:input path="emailAddress" class="form-control"
								placeholder="Please Enter Your email ID" />
							<button type="submit" class="btn btn-custom">
								<b>Keep me updated</b>
							</button>
						</div>

					</form:form>
				</div>
				<div id="confirmation">Thanks, Come back later</div>
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

</body>
</html>