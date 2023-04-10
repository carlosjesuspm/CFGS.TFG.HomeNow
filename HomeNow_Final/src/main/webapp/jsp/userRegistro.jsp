<%@ include file ="header.jsp" %>
<head>
	<link href="css/registro.css" rel="stylesheet">
	<title>Registro</title>
</head>
<body>


	<main class="p-4 d-flex justify-content-center">
		
		<div class="card sizeDiv" style="width:40vw">
			<div class="card-body">
				<form id="form-register" method="post" class="pb-4">
					<div class="form-group">
						<label for="input-username">Nombre de usuario</label>
						<input type="text" class="form-control" id="input-username" required>
					</div>
					<div class="form-row">
						<div class="form-group col -md-6">
							<label for="input-contrasena">Contraseña</label>
							<input type="password" class="form-control" id="input-contrasena" required>			
						</div>
						<div class="form-group col -md-6">
							<label for="input-contrasena-repeat">Repetir contraseña</label>
							<input type="password" class="form-control" id="input-contrasena-repeat" required>			
						</div>
					</div>
					<div class="form-group">
						<label for="input-nombre">Nombre</label>
						<input type="text" class="form-control" id="input-nombre" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Apellidos</label>
						<input type="text" class="form-control" id="input-apellidos" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Edad</label>
						<input type="number" class="form-control" id="input-edad" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Fecha de nacimiento</label>
						<input type="date" class="form-control" id="input-fechaNacimiento" required>
					</div>
					<div class="form-group">
						<label for="input-apellidos">Télefono</label>
						<input type="tel" class="form-control" id="input-telefono" required>
					</div>
					<div class="form-group">
						<label for="input-email">Email</label>
						<input type="email" class="form-control" id="input-email" required>
					</div>
					<input type="submit" class="btn btn-primary" id="register-btn" value="Registrar usuario"/>
				</form>
				<div id="register-error" class="alert alert-danger d-none" role="alert"></div>
				<a href="/HomeNow_Final/jsp/acceder.jsp">¿Ya tienes cuenta? Iniciar sesion</a>
			</div>
		</div>
	</main>   


</body>
<%@ include file ="footer.jsp" %>
</html>