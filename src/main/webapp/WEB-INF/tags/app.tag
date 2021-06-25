<%-- 
    Document   : wrapper
    Created on : 24 jun. 2021, 19:12:54
    Author     : developer
--%>

<%@tag description="app template" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<html lang="es" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>e-Learn</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/estilo.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/image/logosolo.png" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css2?family=KoHo:wght@200;300;400;500;600;700&display=swap" rel="stylesheet">
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
  </head>
  <body>

      <t:header></t:header>
      
      <section class="contenedor1">
          <main>
              <div class="contenido1">
                <jsp:doBody/>
              </div>
          </main>
      </section>
      
      <t:footer></t:footer>
      
  </body>
</html>