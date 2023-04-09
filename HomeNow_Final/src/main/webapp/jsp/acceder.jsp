<%@ include file ="header.jsp" %>
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
    <link href="css/acceder.css" rel="stylesheet">
<title>Acceder</title>

</head>
<body>



 <!--Main-->
      <main>
        <div class = "container py-3">
            <div class="card my-5">
                <div class="card-body">
                    <div class="row m-3">
                        <div class="col -md-6 bg-login-image m-auto">
                            <img src="/HomeNow_Final/img/logo.jpg" class="img-fluid "  alt="Logo acceder">
                        </div>
                        <div class="col -md-6 text-center">
                            <h1 class="h4 text-gray-900 my-3">Bienvenido</h1>
                            <br>
                            <form id="form-login ">
                                <div class="form-group ">
                                    <input type="text" class="form-control" id="usuario" placeholder="Usuario" required>
                                </div>
                                <br>
                                <div class="form-goup">
                                    <input type="password" class="form-control" id="contraseña" placeholder="Contraseña" required >
                                </div>
                                <br>
                                <button type="submit" class="btn btn-primary btn-block" id="btnEntrar">Entrar</button>
                                <br>
                                <br>
                                <div class="text-center">
                                    <a href="/HomeNow_Final/jsp/userRegistro.jsp">¿Aún no tienes cuenta? Regístrate</a><br>
                                    <a href="/HomeNow_Final/jsp/perfil.jsp">Ir a perfil</a>
                                </div>
                                
                            </form>
                        </div>
                    </div>
                    <div id="login-error" class="alert alert-danger d-none" role="alert">Usuario o Contraseña incorrectos
                    </div>
                </div>
            </div>
        </div>
    </main>


      <!--Main-->


</body>
<%@ include file ="footer.jsp" %>
</html>