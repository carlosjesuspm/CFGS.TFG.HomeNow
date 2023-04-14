<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="ifp.homenow.utility.ServletUtility"%>
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
<link href="registro.css" rel="stylesheet">

<title>Registro</title>
</head>
<body>

y
	<%@ include file="header.jsp"%>
	<main class="p-4 d-flex justify-content-center">
		<div class="card sizeDiv" style="width: 40vw">
			<div class="card-body">
				<h3 style="color:green;"><%=ServletUtility.getSuccessMessage(request)%></h3>
				<h3 style="color:red;"><%=ServletUtility.getErrorMessage(request)%></h3>
				<form id="form-register" action="/HomeNow_Final/registroController"
					method="post" class="pb-4">
					<div class="form-group">
						<label for="input-username">Nombre de usuario</label> <input
							type="text" class="form-control" id="input-username"
							name="usuario" required>
					</div>
					<div class="form-row">
						<div class="form-group col -md-6">
							<label for="input-contrasena">Contraseña</label> <input
								type="password" class="form-control" id="input-contrasena"
								name="contrasena" required>
						</div>
					</div>
					<div class="form-group">
						<label for="input-nombre">Nombre</label> <input type="text"
							class="form-control" id="input-nombre" name="nombre" required>
					</div>
					<div class="form-group">
						<label for="input-apellido1">1er apellido</label> <input
							type="text" class="form-control" id="input-apellido1"
							name="apellido1" required>
					</div>
					<div class="form-group">
						<label for="input-apellido2">2do apellido</label> <input
							type="text" class="form-control" id="input-apellido2"
							name="apellido2" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Edad</label> <input type="number"
							class="form-control" id="input-edad" name="edad" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Fecha de nacimiento</label> <input
							type="text" class="form-control" id="input-fechaNacimiento"
							name="fecha_nacimiento" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Teléfono</label> <input type="tel"
							class="form-control" id="input-telefono" name="telefono" required>
					</div>
					<div class="form-group">
						<label for="input-email">Email</label> <input type="email"
							class="form-control" id="input-email" name="correo" required>
					</div>
					<input type="submit" class="btn btn-primary" id="register-btn"
						value="Registrar usuario" />
				</form>
				<div id="register-error" class="alert alert-danger d-none"
					role="alert"></div>
				<a href="/HomeNow_Final/jsp/acceder.jsp">¿Ya tienes cuenta?
					Iniciar sesion</a>
			</div>
		</div>
	</main>

	<!--JS y Popper-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<%@ include file="footer.jsp"%>
</body>
</html>