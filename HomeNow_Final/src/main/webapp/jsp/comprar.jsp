<%@page import="ifp.homenow.controller.HomeNowView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<link href="css/comprar.css" rel="stylesheet" />

<title>Comprar</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="btn-group d-flex justify-content-center">
		<button type="button"
			class="btn btn-primary dropdown-toggle btn btn-light"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			Destacados</button>
		<div class="dropdown-menu dropdown-menu-right">
			<button class="dropdown-item" type="button">Destacados</button>
			<button class="dropdown-item" type="button">Reciente</button>

		</div>

		<button class="btn btn-primary btn btn-light" type="button">
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
				fill="currentColor" class="bi bi-currency-euro" viewBox="0 0 16 16">
          <path
					d="M4 9.42h1.063C5.4 12.323 7.317 14 10.34 14c.622 0 1.167-.068 1.659-.185v-1.3c-.484.119-1.045.17-1.659.17-2.1 0-3.455-1.198-3.775-3.264h4.017v-.928H6.497v-.936c0-.11 0-.219.008-.329h4.078v-.927H6.618c.388-1.898 1.719-2.985 3.723-2.985.614 0 1.175.05 1.659.177V2.194A6.617 6.617 0 0 0 10.341 2c-2.928 0-4.82 1.569-5.244 4.3H4v.928h1.01v1.265H4v.928z" /></svg>
			Presupuesto mensual
		</button>
		<button class="btn btn-primary btn btn-light" type="button">
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
				fill="currentColor" class="bi bi-calendar" viewBox="0 0 16 16">
          <path
					d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM1 4v10a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V4H1z" /></svg>
			Disponibilidad
		</button>
		<button type="button" class="btn btn-light" data-bs-toggle="popover"
			data-bs-placement="right" data-bs-custom-class="custom-popover"
			data-bs-title="Custom popover"
			data-bs-content="Para ver anuncions con compañeros de piso, cambio el espacio anunciado a 'habitacion privada' o'habitacion compartida'"">
			Comapañero de piso</button>
		<button class="btn btn-primary btn btn-light" type="button">
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
				fill="currentColor" class="bi bi-house" viewBox="0 0 16 16">
          <path
					d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.707 1.5ZM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5 5 5Z" /></svg>
			Piso
		</button>
	</div>
	</div>

	<div class="album py-5 bg-light">
		<div class="container">

			<div class="row">
				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa7.jpg">
						<div class="card-body">
							<p class="card-text">Piso en venta en Avinguda Francesc Macia</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">


									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>

									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>2749€</b>
									</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa2.jpg">
						<div class="card-body">
							<p class="card-text">Casa adosada en venta en Nucli Urbà</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>
									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>1407,90€</b>
									</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa3.jpg">
						<div class="card-body">
							<p class="card-text">Casa adosada en venta en Carrer Europa</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>
									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>749,90€</b>
									</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa4.JPG">
						<div class="card-body">
							<p class="card-text">Casa adosada en venta en La Plana</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>
									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>609,90€</b>
									</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa5.jpg">
						<div class="card-body">
							<p class="card-text">Piso en venta en Avinguda de Francesc</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>
									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>519,90€</b>
									</button>

								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-4">
					<div class="card mb-4 shadow-sm">
						<img src="../img/Casa6.jpg">
						<div class="card-body">
							<p class="card-text">Piso en venta en Carrer Mestre Tomás</p>
							<div class="d-flex justify-content-between align-items-center">
								<div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary"
										data-toggle="modal" data-target="#myModal">
										Características</button>

									<div class="modal" id="myModal">
										<div class="modal-dialog">
											<div class="modal-content">

												<!-- Modal Header -->
												<div class="modal-header">
													<h4 class="modal-title">
														<b>Piso en venta en Avinguda Francesc Macia</b>
													</h4>
													<button type="button" class="close" data-dismiss="modal">&times;</button>
												</div>

												<!-- Modal body -->
												<div class="modal-body">Eurofinques Assessors
													Immobiliaris, sl, con una experiencia de mas de 40 años en
													el sector de la construcción y promoción, ha adquirido el
													compromiso de realizar y certificar esta promoción de 13
													viviendas en el centro de Esparreguera, consta de planta
													baja, primera planta, segunda planta, tercera planta y
													duplexs, con el certificado de Eficiencia Energética de
													nivel A o B, el más alto de los niveles de eficiencia
													energética así determinados por la normativa vigente.
													Fomentamos así una construcción más sostenible que
													repercute en beneficios económicos y medioambientales.</div>

												<!-- Modal footer -->
												<div class="modal-footer">
													<button type="button" class="btn btn-danger"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>
										</div>
									</div>
									<button type="button" class="btn btn-sm btn-outline-secondary">
										Precio: <b>535,90€</b>
									</button>
								</div>
							</div>
						</div>
					</div>
				</div>
				<%@ include file="footer.jsp"%>
</body>
</html>
