<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="author" content="Joel Alarcón">
  <meta name="description"
    content="Déjate llevar por la musa que te acompañe en el momento, crea tu cuenta y comparte tu arte">
  <meta name="keywords" content="Poesia, Poetas, Post">
  <title>Hola</title>
  
  <!--CDN Bootstrap-->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  
    <!--CSS Native-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">

  
  <!--Google Fonts-->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Oleo+Script:wght@400;700&display=swap" rel="stylesheet">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Bad+Script&family=Oleo+Script:wght@400;700&display=swap"
    rel="stylesheet">

  <!--FontAwesome-->
  <script src="https://kit.fontawesome.com/2970ea1a21.js" crossorigin="anonymous"></script>

</head>

<body>

  <div class="d-flex">
    <aside id="sidebar">
      <!--Sidebar Logo-->
      <div class="sidebar-logo">
        <a href="index.jsp">Logo de pagina</a>
      </div>

      <!--Sidebar Navegación-->
      <ul class="sidebar-nav p-0">
        <li class="sidebar-header">
          Herramientas y componentes
        </li>

        <!--Icono de escribir nuevo poema-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-pen-nib"></i>
            <span>Pincel</span>
          </a>
        </li>

        <!--Icono de Poemas-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-scroll"></i>
            <span>Nueva publicacion</span>
          </a>
        </li>
        <!--Icono de perfil-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-regular fa-user"></i>
            <span>Perfil</span>
          </a>
        </li>
        <!--Icono de búsqueda-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-magnifying-glass"></i>
            <span>Búsqueda</span>
          </a>
        </li>
        <!--Icono de más-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-grip"></i>
            <span>Más</span>
          </a>
        </li>

        <li class="sidebar-header">
          Pages
        </li>
        <!--Inicio de sesión con ícono: Autenticación-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse" data-bs-target="#auth"
            aria-expanded="true" aria-controls="auth">
            <i class="fa-solid fa-shield-halved"></i>
            <span>Auth</span>
          </a>
          <!--Dropdown-->
          <ul id="auth" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
            <li class="sidebar-item">
              <a href="" class="sidebar-link">Login</a>
            </li>
            <li class="sidebar-item">
              <a href="" class="sidebar-link">Register</a>
            </li>
          </ul>
        </li>

        <!--Icono de búsqueda-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-magnifying-glass"></i>
            <span>Notificaciones</span>
          </a>
        </li>

        <!--Icono de búsqueda-->
        <li class="sidebar-item">
          <a href="#" class="sidebar-link">
            <i class="fa-solid fa-magnifying-glass"></i>
            <span>Tareas</span>
          </a>
        </li>
      </ul>
      <!--Final de sidebar-->
      <div class="sidebar-footer">
        <a href="#" class="sidebar-link">
          <i class="fa-solid fa-right-from-bracket"></i>
          <span>Log out</span>
        </a>
      </div>
    </aside>

    <!--Main component-->

    <div class="main">
      <!--Barra de navegación-->
      <nav class="navbar navbar-expand border-bottom">
        <button class="toggler-btn" type="button">
          <i class="fa-solid fa-file-lines"></i>
        </button>
      </nav>

      <!--Contenido central de la página web-->
      <main class="p-3">
        <div class="container-fluid">
          <div class="mb-3 text-center">
            <h1>Bienvenido a la plataforma Web</h1>            		
            <form class="mx-auto my-5 py-5" action="Controller" method="get">
              <button type="submit" name="accion" value="login" class="btn btn-info mx-2 py-3 col-md-4 mx-auto">Log In</button>
              <button type="submit" name="accion" value="registro" class="btn btn-info mx-2 py-3 col-md-4 mx-auto">Registro</button>
            </form>
          </div>
        </div>


        <!--Footer-->
        <footer class="py-3 my-4">
          <ul class="nav justify-content-center border-bottom pb-3 mb-3">
            <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Inicio</a></li>
            <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Sobre el proyecto</a></li>
            <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">FAQs</a></li>
            <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Contacto</a></li>
          </ul>
          <p class="text-center text-body-secondary">© 2024 Joel Alarcón</p>
        </footer>
      </main>
    </div>

    

  </div>

  


  <!--CDN JQuery-->
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"
    integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
  <!--CDN Script Bootstrap-->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"></script>
  <!--JavaScript Native-->
  <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
</body>

</html>