<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Datos del Usuario</h1>
	<form action="saveUser">
	<div>
	<label class="input_label">DNI: </label><input type="text" name="dni"><br>
	</div>
	<br>
	<div>
	<label class="input_label">Nombre: </label><input type="text" name="name"><br>
	</div>
	<div>
	<label class="input_label">Apellido: </label><input type="text" name="lastname"><br>
	</div>
	<div>
	<label class="input_label">Mail: </label><input type="text" name="mail"><br>
	</div>
	<div>
	<label class="input_label">Fecha de nacimiento: </label><input type="text" name="birthdate"><br>
	</div>
	<button class="loginBtn loginBtn--google">Guardar</button>
	</form>
</body>
</html>