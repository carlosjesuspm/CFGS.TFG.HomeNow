<%@ include file ="header.jsp" %>
<head>
	<link href="css/contacto.css" rel="stylesheet">
	<title>Contacto</title>
</head>


<body>


<!-- Main Content-->
	<main class="mb-4">
		<h1 class="mt-3 padre text-center">Contacto</h1>
		<div class="container px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<p>¿Desea más información?¡Rellene el formulario y nos pondremos en contacto con usted lo antes
						posible!</p>

					<form method="GET" id="form-contacto" class="pb-4">
						<div class="row m-3 form-group">
							<label class="col-md-4">Nombre</label>
							<input type="text" id="nombre" required>
						</div>
						<div class="row m-3 form-group">
							<label class="col-md-4">Apellidos</label>
							<input type="text" id="apellidos" required>
						</div>
						<div class="row m-3 form-group">
							<label class="col-md-4">E-Mail</label>
							<input type="email" id="email" required>
						</div>
						<div class="row m-3 form-group">
							<label class="col-md-4">Móvil / Teléfono</label>
							<input type="number" id="telefono" maxlength="9" required>
						</div>
						<div class="row m-3 form-group">
							<label class="col-md-4">Mensaje</label>
							<textarea id="mensaje" rows="4" maxlength="300" required></textarea>
						</div>
					
					<br />

					<input type="checkbox" id="check1" required> Soy mayor de edad.
					<br>
					<input type="checkbox" id="check2" required> Acepto Términos y Condiciones
					<br>
					<br>

					<input id="botonEnviar" type="submit" class="btn btn-primary" value="Enviar"
						onclick="mostrarMensaje()">

					<br />
					</form>
					<span id="resultado">
					</span>
				</div>
			</div>
		</div>
	</main>



</body>
<%@ include file ="footer.jsp" %>
</html>
 

