<%@page import="ifp.homenow.controller.HomeNowView"%>
<%@page import="ifp.homenow.bean.UsuarioBean"%>
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
<link href="css/perfil.css" rel="stylesheet">
<title>Perfil</title>

</head>
<body>
	<%@ include file="header.jsp"%>
	<!--Main-->

	<h1 class="mt-3 padre text-center">Perfil</h1>
	<div class="padre text-center fw-bold"
		style="display: flex; justify-content: center">
		<div class="tamaño hijo card my-5" id="form-container"
			style="height: 650px; width: 500px; align-self: center">
			<div class="card-body">

					<div class="form-group">
						<label for="input-username">Usuario</label> <input type="text"
							class="form-control disabled" id="input-username">
					</div>
					<div class="form-group">
						<label for="input-contrasena">Contraseña</label> <input
							type="password" class="form-control" id="input-contrasena">
					</div>
					<div class="form-group">
						<label for="input-nombre">Nombre</label> <input type="text"
							class="form-control" id="input-nombre">
					</div>
					<div class="form-group">
						<label for="input-apellidos">Apellidos</label> <input type="text"
							class="form-control" id="input-apellidos">
					</div>
					<div class="form-group">
						<label for="input-edad">Edad</label> <input type="number"
							class="form-control" id="input- edad">
					</div>
					<div class="form-group">
						<label for="input-tel">Teléfono</label> <input type="number"
							class="form-control" id="input-tel">
					</div>
					<div class="form-group">
						<label for="input-email">Email</label> <input type="text"
							class="form-control" id="input-email">
					</div>
					<br>
					<button type="submit" class="btn btn-primary btn-block"
						id="btnActualizar">Actualizar</button>
					<br> <br> <a href="/HomeNow_Final/index.jsp">Volver</a>
			</div>

		</div>
	</div>


	<!--Main-->

	<%@ include file="footer.jsp"%>
	<!--JS y Popper-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>

</html>