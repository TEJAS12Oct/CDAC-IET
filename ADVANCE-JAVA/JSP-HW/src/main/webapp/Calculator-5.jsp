<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<center>
		<fieldset>
			<form action='Output.jsp' method="post">
				<p>
					Enter Number1 : <input type="text" name='num1' />
				</p>
				<p>
					Enter Number2 : <input type="text" name='num2' />
				</p>

				<p>Choose Operator</p>
				<select name='op'>
					<option>+</option>
					<option>-</option>
					<option>*</option>
					<option>/</option>
				</select>
				<p>
					<input type='submit' value='ok' />
				</p>
		</fieldset>
	</center>
	</form>

</body>


</html>

<!--
First war file generated using export 
then Browser Put http://localhost:8080/App1/Calculator.jsp 
thne page go on  Output.jsp
 -->