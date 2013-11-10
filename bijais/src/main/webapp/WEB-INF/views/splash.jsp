<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Shree Nrusimha Prasada</title>

<!-- Bootstrap core CSS -->
<link href="/bijais-web/resources/css/bootstrap.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

<!-- Custom styles for this template -->
<link href="/bijais-web/resources/css/carousel.css" rel="stylesheet">
<style>
.navbar-form {
	margin-left: 30%;
}

.navbar-form .form-group {
	display: inline-block;
	margin-bottom: 0;
	margin-left: 10%;
	vertical-align: middle;
}

h1 {
	font-size: 3.2em;
}

body {
	background-color: #fff;
}

.carousel-caption {
	color: #E5C474;
	text-align: center;
	text-shadow: 0 1px 2px rgba(0, 0, 0, 0.6);
}

.carousel-control.left {
	background-image: linear-gradient(to right, rgba(0, 0, 0, 0) 0px,
		rgba(0, 0, 0, 0) 100%);
	background-repeat: repeat-x;
	background-color: #2B8DAD;
}

.carousel-control.right {
	background-image: linear-gradient(to right, rgba(0, 0, 0, 0) 0px,
		rgba(0, 0, 0, 0) 100%);
	background-repeat: repeat-x;
	left: auto;
	background-color: #2B8DAD;
	right: 0;
}

.btn-custom {
	background-color: #080939 !important;
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

.info,.success,.warning,.error,.validation {
	border: 1px solid;
	margin: 10px 0px;
	padding: 15px 10px 15px 50px;
	background-repeat: no-repeat;
	background-position: 10px center;
}

.info {
	color: #00529B;
	background-color: #BDE5F8;
	background-image: url('info.png');
}

.success {
	color: #4F8A10;
	background-color: #DFF2BF;
	background-image: url('success.png');
}

.warning {
	color: #9F6000;
	background-color: #FEEFB3;
	background-image: url('warning.png');
}

.error {
	color: #D8000C;
	background-color: #FFBABA;
	background-image: url('error.png');
}
</style>
</head>
<!-- NAVBAR
================================================== -->
<body>



	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->

		<div class="carousel-inner">
			<div class="item active">

				<div class="container">
					<div class="carousel-caption">STARTING TEXT</div>
				</div>
			</div>
			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Hygiene is paramount.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>
			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Utmost care goes into the preparation of vegetables used
							in our cooking.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>
			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Care is taken to ensure that the offerings are nutritious
							and healthy.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>
			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Care is taken to ensure that the offerings are nutritious
							and healthy.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>

			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Premium quality Sona Masoori Rice is used in all rice
							preparations.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>

			<div class="item">

				<div class="container">
					<div class="carousel-caption">
						<h2>Pure "Nandini" brand ghee from KMF is used in preparation
							of sweets, seasoning.</h2>
						<p>Description goes here</p>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /.carousel -->



	<!-- Marketing messaging and featurettes
    ================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->

	<div class="container">

		<form:form action="/bijais-web/storeDetails"
			commandName="customerInfo" class="navbar-form navbar-left"
			method="POST">
			<h1>Shree Nrusimha Prasada</h1>
			<div class="form-group">
				<form:input path="emailAddress" class="form-control"
					placeholder="Please Enter Your email ID" />
			</div>
			<button type="submit" class="btn btn-custom">
				<b>Keep me updated</b>
			</button>
			<c:if test="${not empty errorMessage}">
				<p class="error">${errorMessage}</p>
			</c:if>
			<c:if test="${not empty successMessage}">
				<p class="success">${successMessage}</p>
			</c:if>
		</form:form>
	</div>
	<!-- /.row -->

	<div style="clear: both">&nbsp;</div>
	<div style="clear: both">&nbsp;</div>
	<div style="clear: both">&nbsp;</div>
	<div style="clear: both">&nbsp;</div>
	<div style="clear: both">&nbsp;</div>

	<div class="container">
		<b>We are here :</b>
		<p>Phone Number: +91 9886 783 607</p>
		<p>1424/5, 20th B Cross</p>
		<p>9th Main road MCECHS Layout</p>
		<p>B Block Sahakar Nagar</p>
		<p>Bangalore 560092</p>
	</div>



	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="/bijais-web/resources/js/bootstrap.min.js"></script>
	<script src="/bijais-web/resources/js/holder.js"></script>
</body>
</html>