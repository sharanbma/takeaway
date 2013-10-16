<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Takeaway Restaurant</title>

<!-- Bootstrap core CSS -->
<link href="/khanavali/resources/css/bootstrap.css" rel="stylesheet">

<!-- Custom CSS for the '4 Col Portfolio' Template -->
<link href="/khanavali/resources/css/4-col-portfolio.css"
	rel="stylesheet">
<style>
#myform {
	text-align: center;
	padding: 5px;
	border: 1px dotted #ccc;
	margin: 2%;
}

.qty {
	width: 40px;
	height: 25px;
	text-align: center;
}
</style>

</head>

<body>

	<nav class="navbar navbar-fixed-top navbar-inverse" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="http://startbootstrap.com">ONE
					STOP KHANAVALI</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<!-- <ul class="nav navbar-nav">
					<li><a href="#about">About</a></li>
					<li><a href="#services">Services</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul> -->
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<div class="container">

		<div class="row">

			<div class="col-lg-12">
				<h1 class="page-header">
					Khanavali <small>Ruchiyada Aduge</small>
				</h1>
			</div>

		</div>

		<div class="row">

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
		</div>

		<div class="row">

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

		</div>

		<div class="row">

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>
			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

			<div class="col-md-2 portfolio-item">
				<strong>IDLI</strong> <a style="padding: 10px 10px 10px 10px;">
					<img width="165px" height="100px" class="img-responsive"
					src="/khanavali/resources/images/idli.jpg">
				</a>
				<form id='myform' method='POST' action='#'>
					<input type='button' value='-' class='qtyminus' field='quantity' />
					<input type='text' name='quantity' value='0' class='qty' /> <input
						type='button' value='+' class='qtyplus' field='quantity' />
				</form>
			</div>

		</div>

		<hr>

		<div class="row text-center">

			<div class="col-lg-12">
				<ul class="pagination">
					<li><a href="#">&laquo;</a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
			</div>

		</div>

	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; Company 2013</p>
				</div>
			</div>
		</footer>

	</div>
	<!-- /.container -->

	<!-- javascript -->
	<script src="/khanavali/resources/js/jquery.js"></script>
	<script src="/khanavali/resources/js/bootstrap.js"></script>
	<script>
		jQuery(document)
				.ready(
						function() {
							// This button will increment the value
							$('.qtyplus')
									.click(
											function(e) {
												// Stop acting like a button
												e.preventDefault();
												// Get the field name
												fieldName = $(this).attr(
														'field');
												// Get its current value
												var currentVal = parseInt($(
														'input[name='
																+ fieldName
																+ ']').val());
												// If is not undefined
												if (!isNaN(currentVal)) {
													// Increment
													$(
															'input[name='
																	+ fieldName
																	+ ']').val(
															currentVal + 1);
												} else {
													// Otherwise put a 0 there
													$(
															'input[name='
																	+ fieldName
																	+ ']').val(
															0);
												}
											});
							// This button will decrement the value till 0
							$(".qtyminus")
									.click(
											function(e) {
												// Stop acting like a button
												e.preventDefault();
												// Get the field name
												fieldName = $(this).attr(
														'field');
												// Get its current value
												var currentVal = parseInt($(
														'input[name='
																+ fieldName
																+ ']').val());
												// If it isn't undefined or its greater than 0
												if (!isNaN(currentVal)
														&& currentVal > 0) {
													// Decrement one
													$(
															'input[name='
																	+ fieldName
																	+ ']').val(
															currentVal - 1);
												} else {
													// Otherwise put a 0 there
													$(
															'input[name='
																	+ fieldName
																	+ ']').val(
															0);
												}
											});
						});
	</script>
</body>

</html>