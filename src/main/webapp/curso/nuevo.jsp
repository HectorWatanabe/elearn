<%-- 
    Document   : curso
    Created on : 25 jun. 2021, 01:03:01
    Author     : developer
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="bodyContent">
    <div>
        <a class="link-elearn" href="/inicio">Regresar</a>

        <div class="form-crear-curso">
            <div class="form-style-8">
                <form method="POST">

                    <div>
                        <h3>Curso</h3>
                        <input type="text" name="curso_codigo" placeholder="Código" required/>
                        <input type="text" name="curso_nombre" placeholder="Nombre" required/>
                        <input type="text" name="curso_duracion" placeholder="Duración (horas)" required/>
                        <input type="text" name="curso_inversion" placeholder="Inversión (S/.)" required/>
                        <textarea name="curso_descripcion" placeholder="Descripción" rows="3" required></textarea>
                    </div>

                    <div>
                        <h3>Profesor</h3>
                        <input type="text" name="profesor_codigo" placeholder="Código" required/>
                        <input type="text" name="profesor_nombres" placeholder="Nombres" required/>
                        <input type="text" name="profesor_apellidos" placeholder="Apellidos" required/>
                        <textarea name="profesor_descripcion" placeholder="Descripción" rows="3" required></textarea>
                    </div>

                    <input type="submit" value="Registrar" />
                    
                </form>
            </div>
        </div>

    </div>
</c:set>

<t:app>
    ${bodyContent}
</t:app>
