<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Usuarios</h1>
	<form>
		<button type="submit" formaction="create">Crear</button>
		<button type="submit" formaction="modify">Modificar</button>
		<button type="submit" formaction="search">Buscar</button>
	</form>
	<label class="user">${dni}</label>
	<label class="user">${firstname}</label>
	<label class="user">${lastname}</label>
	<label class="user">${mail}</label>
</body>
</html>