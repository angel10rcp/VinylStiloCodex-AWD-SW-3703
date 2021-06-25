<%-- 
    Document   : index
    Created on : 25-jun-2021, 3:28:20
    Author     : Angel Cardenas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<title>VinylStilos</title>
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,800,700,300' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=BenchNine:300,400,700' rel='stylesheet' type='text/css'>
	<script src="js/modernizr.js"></script>
	<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	
	<!-- ====================================================
	header section -->
	<header class="top-header">
		<div class="container">
			<div class="row">
				<div class="col-xs-5 header-logo">
					<br>
					<a href="index.html"><img src="img/icon.jpg" alt="" class="img-responsive logo"></a>
				</div>

				<div class="col-md-7">
					<nav class="navbar navbar-default">
					  <div class="container-fluid nav-bar">
					    <!-- Brand and toggle get grouped for better mobile display -->
					    <div class="navbar-header">
					      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					        <span class="sr-only">Toggle navigation</span>
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
					        <span class="icon-bar"></span>
					      </button>
					    </div>

					    <!-- Collect the nav links, forms, and other content for toggling -->
					    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					      
					      <ul class="nav navbar-nav navbar-right">
					        <li><a class="menu active" href="#home" >Inicio</a></li>
					        <li><a class="menu" href="ourProducts.jsp">Inventario</a></li>
                                                <li><a class="menu" href="pages/specificProductHTML.html">Producto</a></li>
					        <li><a class="menu" href="SaleView.jsp">Venta</a></li>
					        <li><a class="menu" href="register.html">Usuario</a></li>
					   
					      </ul>
					    </div><!-- /navbar-collapse -->
					  </div><!-- / .container-fluid -->
					</nav>
				</div>
			</div>
		</div>
	</header> <!-- end of header area -->

	<section class="slider" id="home">
		<div class="container-fluid">
			<div class="row">
			    <div id="carouselHacked" class="carousel slide carousel-fade" data-ride="carousel">
					<div class="header-backup"></div>
			        <!-- Wrapper for slides -->
			        <div class="carousel-inner" role="listbox">
			            <div class="item active">
			            	<img src="img/slide1.jpg" alt="">
			                <div class="carousel-caption">
		               			     			
		               			
			                </div>
			            </div>
			            <div class="item">
			            	<img src="img/slide2.jpg" alt="">
			                <div class="carousel-caption">
		               			
		               			
			                </div>
			            </div>
			            <div class="item">
			            	<img src="img/slide3.png" alt="">
			                <div class="carousel-caption">	
			                </div>
			            </div>
			      
			        </div>
			        <!-- Controls -->
			        <a class="left carousel-control" href="#carouselHacked" role="button" data-slide="prev">
			            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			            <span class="sr-only">Previous</span>
			        </a>
			        <a class="right carousel-control" href="#carouselHacked" role="button" data-slide="next">
			            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			            <span class="sr-only">Next</span>
			        </a>
			    </div>
			</div>
		</div>
	</section><!-- end of slider section -->

	<!-- about section -->
	<section class="about text-center" id="about">
		<div class="container">
			<div class="row">
				<h2>Nuestros Productos</h2>
				<h4>Vinylstilos ofrece una gran cantidad de productos personalizables, PIDELOS YA!</h4>
				<div class="col-md-4 col-sm-6">
					<div class="single-about-detail clearfix">
						<div class="about-img">
							<img class="img-responsive" src="img/Taza.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>T</h1>
							</div>
							<h3>Tazas Peronalizables</h3>
							<p>Puedes pedir tu taza personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="single-about-detail">
						<div class="about-img">
							<img class="img-responsive" src="img/almohadas.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>A</h1>
							</div>

							<h3>Almohadas Peronalizables</h3>
							<p>Puedes pedir tu almohada personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="single-about-detail">
						<div class="about-img">
							<img class="img-responsive" src="img/llaveros.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>L</h1>
							</div>
							<h3>Llaveros Peronalizables</h3>
							<p>Puedes pedir tu llavero personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
								<div class="col-md-4 col-sm-6">
					<div class="single-about-detail">
						<div class="about-img">
							<img class="img-responsive" src="img/gorras.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>G</h1>
							</div>
							<h3>Gorras Peronalizables</h3>
							<p>Puedes pedir tu gorra personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
								<div class="col-md-4 col-sm-6">
					<div class="single-about-detail">
						<div class="about-img">
							<img class="img-responsive" src="img/rompecabezas.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>R</h1>
							</div>
							<h3>Rompecabezas Peronalizables</h3>
							<p>Puedes pedir tu Rompecabezas personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
								<div class="col-md-4 col-sm-6">
					<div class="single-about-detail">
						<div class="about-img">
							<img class="img-responsive" src="img/mochilas.jpg" alt="">
						</div>
						<div class="about-details">
							<div class="pentagon-text">
								<h1>M</h1>
							</div>
							<h3>Mochilas Peronalizables</h3>
							<p>Puedes pedir tu Mochila personalizable, solo tienes que indicarnos que es lo que necesitas y pronto lo realizaremos</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section><!-- end of about section -->
	<!-- service section starts here -->
	<!-- contact section starts here -->
<!-- end of contact section -->

	<!-- footer starts here -->
	<footer class="footer clearfix">
		<div class="container">
			<div class="row">
				<div class="col-xs-6 footer-para">
					<p>&copy;VinylStilos Todos los derechos reservados</p>
				</div>
				<div class="col-xs-6 text-right">
					<a href=""><i class="fa fa-facebook"></i></a>
					<a href=""><i class="fa fa-twitter"></i></a>
					<a href=""><i class="fa fa-skype"></i></a>
				</div>
			</div>
		</div>
	</footer>

	<!-- script tags
	============================================================= -->
	<script src="js/jquery-2.1.1.js"></script>
	<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
	<script src="js/gmaps.js"></script>
	<script src="js/smoothscroll.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>
