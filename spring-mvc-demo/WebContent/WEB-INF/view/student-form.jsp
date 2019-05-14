<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>


<html>
<head>
	<title>Student registration form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
		
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country: <form:select path='country'>
	
			<!--<form:option value="Brazil" label="Brasil" />
			<form:option value="Spain" label="España" />
			<form:option value="Germany" label="Alemania" />
			<form:option value="India" label="India"/>-->
			
			<!-- Se puede hacer de esa manera o de la manera de abajo teniendo 
			en el modelo una lista -->
			
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		
		<br><br>
		
		Favorite Language: 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		JavaScript<form:radiobutton path="favoriteLanguage" value="JavaScript" />
		Python<form:radiobutton path="favoriteLanguage" value="Python" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
		
		<br><br>
		
		Operating Systems:
		
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Mac<form:checkbox path="operatingSystems" value="Mac" />
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />
		
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>