<%@ include file ="header.jsp" %>
<title>Publicar</title>
<body>



<!--Main-->
    <h2 class="text-center mt-3">PUBLICA TU ANUNCIO</h2>

    <div class="container m-5">
        <form class="">
            <h3>Tipo de inmueble</h3>
            <div class="mt-3 mb-3 w-25">
                <select class="form-select" aria-label="Default select example">
                    <option selected value="casa">Casa</option>
                    <option value="piso">Piso</option>
                    <option value="habitacion">Habitación</option>
                </select>
                <label for="superficie" class="form-label mt-3 mb-3 fw-bold ">Superficie</label>
                <input type="text" class="form-control" id="superficie" placeholder="Indique extensión">
            </div>

            <br>


            <h3>Dirección</h3>
            <div class="container mb-3">
                <div class="row aling-items-start fw-bold ">
                    <div class="col">
                        <div class="mb-3">
                            <label for="provincia" class="form-label">Provincia</label>
                            <input type="text" class="form-control" id="provincia">
                        </div>
                        <div class="mb-3">
                            <label for="localidad" class="form-label">Localidad</label>
                            <input type="text" class="form-control" id="localidad">
                            </div>
                            <div class="mb-3">
                                <label for="numero" class="form-label">Número</label>
                                <input type="number" min="0" class="form-control" id="numero">
                            </div>
                            <div class="mb-3">
                                <label for="complemento" class="form-label ">Complemento</label>
                                <input type="text" class="form-control" id="complemento">
                            </div>
                    </div>
                    <div class="col">
                        <div class="mb-3">
                            <label for="municipio" class="form-label">Municipio</label>
                            <input type="text" class="form-control" id="municipio">
                            
                        </div>
                        <div class="mb-3">
                            <label for="calle" class="form-label">Calle</label>
                            <input type="text" class="form-control" id="localidad">
                            
                        </div>
                        <div class="mb-3">
                            <label for="codigo-postal" class="form-label">Código Postal</label>
                            <input type="number" min="1" class="form-control" id="codigo-postal">
                            
                        </div>
                    </div>
                </div>
            </div>
            
            <h3>Habitaciones</h3>
            <div class="mt-3 mb-3 w-25">
                <select class="form-select" aria-label="Default select example">
                    <option selected value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">3+</option>
                </select>
            </div>

            <h3>Baños</h3>
            <div class="mt-3 mb-3 w-25">
                <select class="form-select" aria-label="Default select example">
                    <option selected value="1">1</option>
                    <option value="2">2</option>
                </select>
            </div>

            <h3>Imágenes</h3>
            <div class="mb-3">
                <label for="formFileMultiple" class="form-label fw-bold">Seleccione el conjunto de imágenes del inmueble</label>
                <input class="form-control w-25" type="file" id="formFileMultiple" multiple>
            </div>

            <h3>Descripción</h3>
                <div class="form-floating mt-3 mb-3 w-25">
                    <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                    <label for="floatingTextarea">Comenta aquí</label>
                </div>
            <button type="submit" class="btn btn-primary">Publicar</button>
        </form>
    </div>

    <!--Main-->


</body>
<%@ include file ="footer.jsp" %>
</html>