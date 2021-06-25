<%-- 
    Document   : header
    Created on : 24 jun. 2021, 19:17:31
    Author     : developer
--%>

<%@tag description="header" pageEncoding="UTF-8"%>

<header>
    <nav>
        <section class="contenedor nav">
            <div class="logo">
                <img src="${pageContext.request.contextPath}/image/logonombre.png" alt="">
            </div>

            <!-- Menú -->
            <div class="enlaces-header">
                <a href="#" class="cta" onclick="document.querySelector('#logoutForm').submit()">Salir</a>
                <form id="logoutForm" action="/logout" method="post" hidden></form>
            </div>
            <div class="menu">
                <i class='bx bx-menu' ></i>
            </div>
        </section>
    </nav>
</header>