<%@page import="ifp.homenow.controller.HomeNowView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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


<title>Header</title>
</head>
<body>

	<!--Navbar-->

	<nav class="navbar navbar-expand-md navbar-dark bg-dark ">
		<div class="container-fluid">
			<a class="navbar-brand" href="<%=HomeNowView.publicar%>"><img
				src="/HomeNow_Final/img/logo.jpg" class="img-fluid"
				alt="Logo HomeNow" width="125" height="50"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<%
				if (session.getAttribute("userUsuario") == null) {
				%>
				<ul class="navbar-nav mx-auto">
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/comprar.jsp">Comprar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/compartir.jsp">Compartir</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/alquilar.jsp">Alquilar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/favoritos.jsp">Favoritos</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/contacto.jsp">Contacto</a></li>
				</ul>
				<ul class="navbar-nav ">
					<li class="nav-item"><a class="nav-link"
						href="<%=HomeNowView.accederController%>">Acceder</a></li>
				</ul>
				<%
				} else {
				%>
				<ul class="navbar-nav mx-auto">
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/comprar.jsp">Comprar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/compartir.jsp">Compartir</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/alquilar.jsp">Alquilar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/favoritos.jsp">Favoritos</a></li>
					<li class="nav-item"><a class="nav-link"
						href=<%=HomeNowView.publicarController%>>Publicar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/contacto.jsp">Contacto</a></li>
				</ul>
				<ul class="navbar-nav ">
					<li class="nav-item"><a class="nav-link"
						href="/HomeNow_Final/jsp/perfil.jsp">Perfil</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=HomeNowView.accederController + "?operation=logout"%>">Cerrar
							Sesión</a></li>
				</ul>
				<%
				}
				%>

			</div>
		</div>
	</nav>


	<!--JS y Popper-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>