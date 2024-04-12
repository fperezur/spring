#Proyectos de Spring MVC simples.

# Helloweb
Es un proyecto web Spring Boot mínimo que tiene una página HTML estática, un controlador y una plantilla Thymeleaf, no tiene fichero de configuración web.xml y los recursos estáticos o plantillas estan en la carpeta src/main/resorces. Tiene un enlace que al clicar en el se dirige a otra página de saludo.

# Hellowebget
Aplicación web que pasa parámetros GET de una dorección URL a otra para mostrala como contenido dinámico. Cada vez que se solicita una URL, ésta pasa parámetros mediante GET al servidor y los pasa a la aplicación web.
La forma de pasar parámetros de una manera sencilla pueden ser:
  - /profile?id=4
  - /profile?id=4&color=red
  - /profile/4/color/red 

# Hellowebpost
Mediante el método POST pasamos más volumen de datos como puede ser un formulario.  -en este proyecto se presenta un formulario para recoger datos y  
Spring MVC permite mandar los datos recogidos desde un formulario asociándolos a un objeto.

# Formulario Complejo
Aplicación web donde mediante un formulario con campos de texto, lista desplegable y checkbox donde se recogen datos y se envían al servidor.  El controlador:
  - @GetMapping("/")
    Página index que presenta un enlace al formulario
  - GetMappint("signup") que carga el formulario con una instancia del objeto User asociado-
  - PostMapping("/signup")
    Recibe el formulario en forma de instancia de User con los datos cargados.
