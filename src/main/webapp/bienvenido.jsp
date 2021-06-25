<%-- 
    Document   : bienvenido
    Created on : 24 jun. 2021, 19:22:43
    Author     : developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:app>

    <div class="contenido1">
        <h1 class="h1-table-table">Gestión de Cursos</h1>
        <div class="barra-opciones">   
            <div class="form-buscar">
                <div class="flexsearch">
                    <div class="flexsearch--wrapper">
                        <form class="flexsearch--form" action="#" method="post">
                            <div class="flexsearch--input-wrapper">
                                <input class="flexsearch--input" type="search" placeholder="Buscar">
                            </div>
                            <input class="flexsearch--submit" type="submit" value="➜">
                        </form>
                    </div>
                </div>
            </div>
            <div class="seccion-opciones">
                <a class="boton-principal" href="/curso/nuevo">Registrar Curso</a>
            </div>
        </div>
        <div class="tbl-header-elearn">
            <table class="table-elearn" cellpadding="0" cellspacing="0" border="0">
                <thead>
                    <tr>
                        <th class="th-elearn">#</th>
                        <th class="th-elearn">Nombre</th>
                        <th class="th-elearn">Descripción</th>
                        <th class="th-elearn">Duración (horas)</th>
                        <th class="th-elearn">Inversión</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="tbl-content-elearn">
            <table class="table-elearn" cellpadding="0" cellspacing="0" border="0">
                <tbody>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                    <tr>
                        <td class="td-elearn">AAC</td>
                        <td class="td-elearn">AUSTRALIAN COMPANY </td>
                        <td class="td-elearn">$1.38</td>
                        <td class="td-elearn">+2.01</td>
                        <td class="td-elearn">-0.36%</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>


</t:app>