<!doctype html> <!-- Declaración del tipo de documento. La palabra "html" indica que se utiliza la versión 5. -->
 +
 +<html lang="es"> <!--lang=es indica que la página contiene información en español-->
 +
 +	<!-- Referencias, titulo en el navegador, configuraciones, etc. -->
 +	<head>
 +		<link rel="stylesheet" href="style.css" /> <!-- referencia de estilos -->
 +		<title>Ejemplo de HTML</title>
 +	</head>
 +
 +	<!-- Contenido de la página. i.e: lo visible para las personas -->
 +	<body>
 +		<header>
 +			<!-- Agrupacion de encabezados -->
 +			<hgroup>
 +				<h1>Ejemplo de título</h1>
 +				<h2>Ejemplo de subtítlo</h2>
 +			</hgroup>
 +		</header>
 +
 +
 +		<!-- Menu de usuario -->
 +		<nav>
 +			<ul>
 +				<li>
 +					<a href="#">Home</a>
 +				</li>
 +				<li>
 +					<a href="#" >Menu 2</a>
 +				</li>
 +				<li>
 +					<a href="#" >Menu 3</a>
 +				</li>
 +			</ul>
 +		</nav>
 +
 +		<!-- Contenido principal -->
 +		<article>
 +
 +			<!-- seccion arbitraria -->
 +			<section>
 +				<h1>Título de sección</h1>
 +				<p class="left-to-aside">
 +					Párrafo de ejemplo con un margin-left de 50px
 +				</p>
 +				<aside>
 +					<p>
 +						Bloque con flujo independiente. Position: relative, float: right y un top: -100 para llevarlo hacia arriba.
 +					</p>
 +				</aside>
 +			</section>
 +
 +		</article>
 +
 +		<!-- pie de página -->
 +		<footer>
 +			<p>
 +				Pie de página con un margin-top de 24px
 +			</p>
 +		</footer>
 +	</body>
 +</html>
