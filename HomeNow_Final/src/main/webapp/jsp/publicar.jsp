<%@page import="ifp.homenow.controller.HomeNowView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="ifp.homenow.utility.ServletUtility"%>
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
<link href="css/publicar.css" rel="stylesheet">
<title>Publicar</title>

</head>
<body>
	<%@ include file="header.jsp"%>


	<!--Main-->
	<h2 class="text-center mt-3">PUBLICA TU ANUNCIO</h2>


	<div class="container m-5">

		<h3 style="color: green;"><%=ServletUtility.getSuccessMessage(request)%></h3>
		<h3 style="color: red;"><%=ServletUtility.getErrorMessage(request)%></h3>
		<form id="inmueble-register"
			action="<%=HomeNowView.publicarController%>" method="post" class="">
			<h3>Tipo de inmueble</h3>
			<div class="mt-3 mb-3 w-25">
				<select class="form-select" aria-label="Default select example"
					name="tipo">
					<option selected value="casa">Casa</option>
					<option value="piso">Piso</option>
					<option value="habitacion">Habitación</option>
				</select> <label for="superficie" class="form-label mt-3 mb-3 fw-bold ">Superficie</label>
				<input type="number" class="form-control" id="superficie"
					name="superficie" placeholder="Indique extensión">
				<label for="precio" class="form-label mt-3 mb-3 fw-bold ">Precio</label>
				<input type="number" class="form-control" id="precio" name="precio"
					placeholder="Indique precio" name="number">
			</div>

			<br>


			<h3>Dirección</h3>
			<div class="container mb-3">
				<div class="row aling-items-start fw-bold ">
					<div class="col">
						<div class="mb-3">
							<label for="provincia" class="form-label">Provincia</label> <input
								type="text" class="form-control" id="provincia" name="provincia">
						</div>
						<div class="mb-3">
							<label for="localidad" class="form-label">Localidad</label> <input
								type="text" class="form-control" id="localidad" name="localidad">
						</div>
						<div class="mb-3">
							<label for="calle" class="form-label">Calle</label> <input
								type="text" class="form-control" id="calle" name="calle">
						</div>
						<div class="mb-3">
							<label for="complemento" class="form-label ">Complemento</label>
							<input type="text" class="form-control" id="complemento"
								name="complemento">
						</div>
					</div>
					<div class="col">
						<div class="mb-3">
							<label for="municipio" class="form-label">Municipio</label> <input
								type="text" class="form-control" id="municipio" name="municipio">

						</div>
						<div class="mb-3">
							<label for="codigo-postal" class="form-label">Código
								Postal</label> <input type="number" min="1" class="form-control"
								id="codigo-postal" name="codigo_postal">

						</div>
						<div class="mb-3">
							<label for="numero" class="form-label">Número</label> <input
								type="number" min="0" class="form-control" id="numero"
								name="numero">

						</div>
					</div>
				</div>
			</div>

			<h3>Habitaciones</h3>
			<div class="mt-3 mb-3 w-25">
				<select class="form-select" aria-label="Default select example"
					name="habitacion">
					<option selected value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">3+</option>
				</select>
			</div>

			<h3>Baños</h3>
			<div class="mt-3 mb-3 w-25">
				<select class="form-select" aria-label="Default select example"
					name="bano">
					<option selected value="1">1</option>
					<option value="2">2</option>
				</select>
			</div>

			<h3>Imágenes</h3>
			<div class="mb-3">
				<label for="formFileMultiple" class="form-label fw-bold">Seleccione
					el conjunto de imágenes del inmueble</label> <input
					class="form-control w-25" type="file" id="formFileMultiple"
					multiple name="imagenes">
			</div>

			<h3>Descripción</h3>
			<div class="form-floating mt-3 mb-3 w-25">
				<textarea class="form-control" placeholder="Leave a comment here"
					id="floatingTextarea" name="descripcion"></textarea>
				<label for="floatingTextarea">Comenta aquí</label>
			</div>
			<button type="submit" class="btn btn-primary">Publicar</button>
		</form>
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