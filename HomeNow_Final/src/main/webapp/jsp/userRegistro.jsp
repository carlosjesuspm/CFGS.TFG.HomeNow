<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!--CSS Boostrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
    <!--CSSp personal-->
    <link href="css/registro.css" rel="stylesheet">
<title>Registro</title>
</head>
<body>
<%@ include file ="header.jsp" %>

	<main class="p-4 d-flex justify-content-center">
		
		<div class="card sizeDiv">
			<div class="card-body">
				<form id="form-register" class="pb-4">
					<div class="form-group">
						<label for="input-username">Nombre de usuario</label>
						<input type="text" class="form-control" id="input-username"required>
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
						<label for="input-email">Email</label>
						<input type="text" class="form-control" id="input-email" required>
					</div>
					<input type="submit" class="btn btn-primary" id="register-btn" value="Registrar usuario"/>
				</form>
				<div id="register-error" class="alert alert-danger d-none" role="alert"></div>
				<a href="acceder.html">¿Ya tienes cuenta? Iniciar sesion</a>
			</div>
		</div>
	</main>   

<%@ include file ="footer.jsp" %>
</body>

</html>