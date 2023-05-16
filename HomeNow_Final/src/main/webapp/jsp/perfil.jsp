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

				<%
				String usuarioUsuario = (String) session.getAttribute("userUsuario");
				String usuarioContrasena = (String) session.getAttribute("userContrasena");
				String usuarioNombre = (String) session.getAttribute("userNombre");
				String usuarioApellido1 = (String) session.getAttribute("userApellido1");
				String usuarioApellido2 = (String) session.getAttribute("userApellido2");
				int usuarioEdad = (Integer) session.getAttribute("userEdad");
				int usuarioTelefono = (Integer) session.getAttribute("userTelefono");
				String usuarioCorreo = (String) session.getAttribute("userCorreo");
				%>

				<div class="form-group">
					<label for="input-username">Usuario</label> <input type="text"
						class="form-control disabled" id="input-username"
						placeholder="<%out.print(usuarioUsuario);%>">
				</div>
				<div class="form-group">
					<label for="input-contrasena">Contraseña</label> <input
						type="password" class="form-control" id="input-contrasena"
						placeholder="<%out.print(usuarioContrasena);%>">
				</div>
				<div class="form-group">
					<label for="input-nombre">Nombre</label> <input type="text"
						class="form-control" id="input-nombre"
						placeholder="<%out.print(usuarioNombre);%>">
				</div>
				<div class="form-group">
					<label for="input-apellidos">Apellidos</label> <input type="text"
						class="form-control" id="input-apellidos"
						placeholder="<%out.print(usuarioApellido1 + " " + usuarioApellido2);%>">
				</div>
				<div class="form-group">
					<label for="input-edad">Edad</label> <input type="number"
						class="form-control" id="input- edad"
						placeholder="<%out.print(usuarioEdad);%>">
				</div>
				<div class="form-group">
					<label for="input-tel">Teléfono</label> <input type="number"
						class="form-control" id="input-tel"
						placeholder="<%out.print(usuarioTelefono);%>">
				</div>
				<div class="form-group">
					<label for="input-email">Email</label> <input type="text"
						class="form-control" id="input-email"
						placeholder="<%out.print(usuarioCorreo);%>">
				</div>
				<br>
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