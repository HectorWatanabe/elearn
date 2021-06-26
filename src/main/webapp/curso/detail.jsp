<%-- 
    Document   : detail
    Created on : 26 jun. 2021, 17:10:20
    Author     : developer
--%>

<%@page import="com.sin.proyecto2.udep.test.beans.Curso"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    Curso curso = (Curso) request.getAttribute("curso");
%>

<c:set var="bodyContent">
    <div>
        <a class="link-elearn" href="/inicio">Regresar</a>

        <div class="form-crear-curso">
            <div class="form-style-8">
                <form>

                    <div>
                        <h3>Curso</h3>
                        <input type="text" 
                               value="${curso.getCodigo()}"
                               disabled=""/>
                        <input type="text"
                               value="${curso.getNombre()}"
                               disabled=""/>
                        <input type="text" 
                               value="${curso.getDuracionHoras()}"
                               disabled=""/>
                        <input type="text"
                               value="${curso.getInversion()}"
                               disabled=""/>
                        <textarea rows="3" 
                                  disabled="">${curso.getDescripcion()}</textarea>
                    </div>

                    <div>
                        <h3>Profesor</h3>
                        <input type="text" 
                               value="${curso.getProfesor().getCode()}"
                               disabled=""/>
                        <input type="text" 
                               value="${curso.getProfesor().getNombre()}"
                               disabled=""/>
                        <input type="text"
                               value="${curso.getProfesor().getApellido()}"
                               disabled=""/>
                        <textarea rows="3" 
                                  disabled="">${curso.getProfesor().getDescripcion()}</textarea>
                    </div>
                    
                </form>
            </div>
        </div>

    </div>
</c:set>

<t:app>
    ${bodyContent}
</t:app>
