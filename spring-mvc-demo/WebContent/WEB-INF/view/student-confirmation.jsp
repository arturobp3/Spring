<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>


<html>
<head>
		<title>Student confirmation</title>
</head>

<body>

	The student is confirmed: ${student.firstName} ${student.lastName}
	
	<br><br>
	
	The country is confirmed too: ${student.country}
	
	<br><br>
	
	Favorite Language: ${student.favoriteLanguage}
	
	<br><br>
	
	Operating Systems: 
	<!-- Recorremos todas las posibles opciones con un bucle -->
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li> ${temp} </li>
		</c:forEach>
	
	</ul>

</body>

</html>