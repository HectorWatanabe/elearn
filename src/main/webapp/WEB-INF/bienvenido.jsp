<%-- 
    Document   : bienvenido
    Created on : 24 jun. 2021, 19:22:43
    Author     : developer
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.sin.proyecto2.udep.test.beans.Curso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%
    List<Curso> cursos = (List) request.getAttribute("cursos");
    String search = (String) request.getAttribute("search");
%>

<c:set var="bodyContent">

    <div class="contenido1">

        <!-- Titulo -->
        <h1 class="h1-table-table">Gestión de Cursos</h1>

        <!-- Opciones gestión curso -->
        <div class="barra-opciones">   

            <!-- Barra buscar -->
            <div class="form-buscar">
                <div class="flexsearch">
                    <div class="flexsearch--wrapper">
                        <form class="flexsearch--form" method="get">
                            <div class="flexsearch--input-wrapper">
                                <input class="flexsearch--input" 
                                       name="search" 
                                       type="text" 
                                       placeholder="Buscar"
                                       value="${search}">
                            </div>
                            <input class="flexsearch--submit" type="submit" value="➜">
                        </form>
                    </div>
                </div>
            </div>

            <!-- Nuevo Curso -->
            <div class="seccion-opciones">
                <a class="boton-principal" href="/curso/nuevo">Registrar Curso</a>
            </div>

        </div>

        <!-- Tabla curso -->
        <div>
            
            <!-- Cabecera de tabla -->
            <div class="tbl-header-elearn">
                <table class="table-elearn">
                    <thead>
                        <tr>
                            <th class="th-elearn column-1-curso-elearn">#</th>
                            <th class="th-elearn column-2-curso-elearn">Nombre</th>
                            <th class="th-elearn column-3-curso-elearn">Descripción</th>
                            <th class="th-elearn column-4-curso-elearn">Duración (horas)</th>
                            <th class="th-elearn column-5-curso-elearn">Inversión</th>
                            <th class="th-elearn">Opciones</th>
                        </tr>
                    </thead>
                </table>
            </div>
            
            <!-- Contenido de tabla -->
            <div class="tbl-content-elearn">
                <table class="table-elearn">
                    <tbody>
                        <c:forEach items="${cursos}" var="curso">
                            <tr>
                                <td class="td-elearn column-1-curso-elearn">${curso.getCodigo()}</td>
                                <td class="td-elearn column-2-curso-elearn">${curso.getNombre()}</td>
                                <td class="td-elearn column-3-curso-elearn">${curso.getDescripcion()}</td>
                                <td class="td-elearn column-4-curso-elearn">${curso.getDuracionHoras()}</td>
                                <td class="td-elearn column-5-curso-elearn">${curso.getInversion()}</td>
                                <td class="td-elearn">
                                    <a class="cta" href="/curso/detalle?codigo=${curso.getCodigo()}">Detalle</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>       
    </div>

</c:set>

<t:app>
    ${bodyContent}
</t:app>