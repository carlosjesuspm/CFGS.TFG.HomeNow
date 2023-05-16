<%@page import="ifp.homenow.controller.HomeNowView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--CSS Boostrap-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<!--CSSp personal-->
<link href="css/index.css" rel="stylesheet">
<title>Index</title>

</head>
<%@ include file="jsp/header.jsp"%>
<body>


	<div>
		<div class="row">
			<div class="col-sm-10">
				<nav class="navbar distancia">
				</nav>
				<hr />
				<h2 class="navbar navbar-expand-sm bg-light justify-content-center">ÚLTIMAS BÚSQUEDAS</h2>
				<hr />
				<br />
				<div class="row">
  					<div class="col-6 text-sm-center" ><img src="img/Casa1.jpg" style="width:50%" class="mx-auto d-block"><p>Casa en Barcelona: 600m2 6 habitaciones</p></div>
  					<div class="col-6 text-sm-center"><img src="img/Casa2.jpg" style="width:75%" class="mx-auto d-block"><p>Casa en Burgos: 800m2 8 habitaciones</p></div>
				</div>
				<div class="row center">
  					<div class="col-6 text-sm-center"><img src="img/Casa3.jpg" style="width:50%" class="mx-auto d-block"><p>Piso en Sabadell: 200m2 4 habitaciones/p></div>
  					<div class="col-6 text-sm-center"><img src="img/Casa5.jpg" style="width:60%" class="mx-auto d-block"><p>Piso en Ripollet: 100m2 3 habitaciones</p></div>
				</div>
			</div>
			<div class="col-sm-2 text-sm-center">
				<div class="container">
					<p>Este espacio está dedicado a los banners publicitarios</p>
					<img class="img-fluid" src="img/anuncio.jpg" alt="Chania" width="460" height="1800"> 
				</div>
			</div>
		</div>

	</div>
	<br />
	<br />
	<div>
		<img class="mx-auto d-block rounded" src="img/collageCiudades.png" alt="Chania">
	</div>
	 
</body>

	<!--JS y Popper-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
<%@ include file="jsp/footer.jsp"%>
</html>