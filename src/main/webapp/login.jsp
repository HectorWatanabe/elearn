<%-- 
    Document   : login.jsp
    Created on : 28 jun. 2021, 15:31:22
    Author     : developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>e-Learn</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilologin.css">
    <link rel="shortcut icon" href="image/logosolo.png" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css2?family=KoHo:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
  </head>
  <body>
    <!-- Contenido -->
    <div class="caja-login">
      <!-- Imagen lateral -->
      <div class="caja-imagen">
        <div class="imagen active">
          <img src="${pageContext.request.contextPath}/image/MobileLogin.png" alt="">
          <div class="caja-logo">
            <div class="logo">
              <img src="${pageContext.request.contextPath}/image/logonombre.png" alt="">
            </div>
            <p class="imagen-texto">Potencia tus capacidades sin límites y únete a la comunidad e-Learn.</p>
          </div>
        </div>
      </div>
      <!-- Sección Formulario -->
      <div class="caja-texo">
        <div class="caja-form">
          <h1 class="titulo">¡Bienvenido a e-Learn!</h1>
          <p class="descripcion">Únete y disfruta de los beneficios que esta comunidad tiene para ti.</p>

          <!-- Tabs -->
          <ul class="tabs-links">
            <li class="tab-link active">Iniciar Sesión</li>
            <li class="tab-link">Registrate</li>
          </ul>

          <!-- Formulario Login -->
          <form action="${pageContext.request.contextPath}/login" 
                method="POST" 
                id="formLogin" 
                class="formulario active">
              
            <input type="text" 
                   placeholder="Correo Electrónico" 
                   class="input-text" 
                   name="Correousuario" 
                   autocomplete="off">
            
            <div class="grupo-input">
                
                <input type="password" 
                       placeholder="Contraseña" 
                       name="Claveusuario" 
                       class="input-text clave">
              
                <button type="button" class="icono bx bx-show-alt mostrarClave"></button> 
              
            </div>
            
            <button type="submit" class="btn" id="btnLogin">Iniciar Sesión</button>
            
          </form>

          <!-- Formulario de Registro -->
          <form action="" method="POST" id="formRegistro" class="formulario">
            <div class="error-text">
              <p>Aquí los errores del formulario</p>
            </div>

            <input type="text" placeholder="Nombre" class="input-text" name="nombre" autocomplete="off">
            <input type="text" placeholder="Apellidos" class="input-text" name="apellido" autocomplete="off">
            <input type="text" placeholder="Correo Electrónico" class="input-text" name="correo" autocomplete="off">
            <div class="grupo-input">
              <input type="password" placeholder="Contraseña" name="password" class="input-text clave">
              <button type="button" class="icono bx bx-show-alt mostrarClave"></button>
            </div>
            <!--Checkbox Personalizado-->
            <label class="caja-cbx">
              Me gustaría recibir notificaciones sobre cursos
              <input type="checkbox" name="cbx_notificaciones" checked>
              <span class="cbx-marca"></span>
            </label>
            <label class="caja-cbx">
              He leído y acepto los
              <a href="#" class="link">Términos y Condiciones</a>
              y
              <a href="#" class="link">Políticas de privacidad.</a>
              <input type="checkbox" name="cbx_notificaciones">
              <span class="cbx-marca"></span>
            </label>

            <button type="button" class="btn" id="btnRegistro">Crear Cuenta</button>
          </form>

        </div>
      </div>
    </div>
    <!-- Script -->
    <script src="${pageContext.request.contextPath}/js/login.js"></script>
  </body>
</html>
