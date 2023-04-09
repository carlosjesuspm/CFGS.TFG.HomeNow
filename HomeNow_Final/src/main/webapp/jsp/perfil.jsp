<%@ include file ="header.jsp" %>
<head>
	<link href="css/perfil.css" rel="stylesheet">
	<title>Perfil</title>
</head>
<body>

<!--Main-->

    <h1 class="mt-3 padre text-center">Perfil</h1>
        <div class="padre text-center fw-bold" style="display: flex; justify-content: center">
            <div class="tamaño hijo card my-5" id="form-container" style="height: 650px; width: 500px; align-self: center">
                <div class="card-body">
                    <form method="GET" id="form-modificar" class="pb-4">
                        <div class="form-group">
                            <label for="input-username">Username</label>
                            <input type="text" class="form-control disabled" id="input-username" placeholder="Username" readonly>
                        </div>
                        <div class="form-group">
                            <label for="input-contrasena">Contraseña</label>
                            <input type="password" class="form-control" id="input-contrasena" placeholder="Contraseña" readonly>
                        </div>
                        <div class="form-group">
                            <label for="input-nombre">Nombre</label>
                            <input type="text" class="form-control" id="input-nombre" placeholder="Nombre" readonly>
                        </div>
                        <div class="form-group">
                            <label for="input-apellidos">Apellidos</label>
                            <input type="text" class="form-control" id="input-apellidos" placeholder="Apellidos" readonly>
                        </div>
                        <div class="form-group">
                            <label for="input-email">Email</label>
                            <input type="text" class="form-control" id="input-email" placeholder="Email" readonly>
                        </div>

                    </form>
                    <a href="/HomeNow_Final/index.jsp">Volver</a>
                </div>
            </div>
        </div>
    <!--Main-->


</body>
<%@ include file ="footer.jsp" %>
</html>