<%-- 
    Document   : index.jsp
    Created on : 28 jun. 2021, 15:51:24
    Author     : developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>e-Learn</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/image/logosolo.png" type="image/x-icon">
        <link href="https://fonts.googleapis.com/css2?family=KoHo:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body>
        <header>
            <nav>
                <section class="contenedor nav">
                    <div class="logo">
                        <img src="${pageContext.request.contextPath}/image/logonombre.png" alt="">
                    </div>
                    <!-- Barra de Búsqueda -->
                    <div class="flexsearch">
                        <div class="flexsearch--wrapper">
                            <form class="flexsearch--form" action="#" method="post">
                                <div class="flexsearch--input-wrapper">
                                    <input class="flexsearch--input" type="search" placeholder="Buscar">
                                </div>
                                <input class="flexsearch--submit" type="submit" value="&#10140;"/>
                            </form>
                        </div>
                    </div>
                    <!-- Menú -->
                    <div class="enlaces-header">
                        <a href="#">Inicio</a>
                        <a href="#">Nosotros</a>
                        <a href="${pageContext.request.contextPath}/login" class="cta">Iniciar Sesión</a>
                    </div>
                    <div class="menu">
                        <i class='bx bx-menu' ></i>
                    </div>
                </section>
            </nav>

            <div class="contenedor">
                <section class="contenido-header">
                    <section class="textos-header">
                        <h1> Aprende y enseña digitalmente</h1>
                        <p>Expande tus conocimientos y red de contactos</p>
                        <a href="#" class="cta">Únete</a>
                    </section>
                    <img src="${pageContext.request.contextPath}/image/OnlineLearning.svg" alt="">
                </section>
            </div>
        </header>

        <section class="cursos">
            <div class="contenedor2 cursos">
                <h2 class="titulo">Cursos</h2>
                <div class="contenedor-articulo">
                    <div class="articulo">
                        <i class='bx bx-user'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                    <div class="articulo">
                        <i class='bx bx-pencil'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                    <div class="articulo">
                        <i class='bx bx-chat'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                    <div class="articulo">
                        <i class='bx bx-user'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                    <div class="articulo">
                        <i class='bx bx-pencil'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                    <div class="articulo">
                        <i class='bx bx-chat'></i>
                        <h3>Curso 1</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quas, delectus. Atque esse illum ipsa rerum.</p>
                        <a href="#">Más info</a>
                    </div>
                </div>
            </div>
        </section>

        <section class="nosotros">
            <div class="contenedor1">
                <img src="${pageContext.request.contextPath}/image/Experts.svg" alt="">
                <div class="box-skills">
                    <h2>Podrás...</h2>
                    <h4> <i class='bx bx-check-circle'></i> Ser participante</h4>
                    <h4> <i class='bx bx-check-circle'></i> Ser ponente</h4>
                    <h4> <i class='bx bx-check-circle'></i> Conectar con otros usuarios</h4>
                </div>
            </div>
        </section>

        <footer>
            <div class="partFooter">
                <img src="${pageContext.request.contextPath}/image/logonombre.png" alt="">
            </div>
            <div class="partFooter">
                <h4>Acerca de</h4>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, esse.</p>
            </div>
            <div class="partFooter">
                <h4>Redes Sociales</h4>
                <div class="social-media">
                    <i class='bx bxl-facebook' ></i>
                    <i class='bx bxl-twitter' ></i>
                    <i class='bx bxl-instagram' ></i>
                    <i class='bx bxl-linkedin-square' ></i>
                </div>
            </div>
        </footer>

    </body>
</html>

