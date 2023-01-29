<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName"/>
	<br><br>
	Last name: <form:input path="lastName"/>
	<br><br>
	Country:
	<form:select path="country">
		
		<form:options items="${student.countryOptions}"/>
		
	</form:select>
	<br><br>
		Favorite Language:
		
	Java<form:radiobutton path="favLang" value="Java"/>
	C++<form:radiobutton path="favLang" value="C++"/>
	PHP<form:radiobutton path="favLang" value="Python"/>
	Ruby<form:radiobutton path="favLang" value="PHP"/>
	
	<br><br>
	Known Operating Systems:
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	MS Windows <form:checkbox path="operatingSystems" value="MC Windows"/>
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
	<br><br>
	<input type="submit" value="Submit"/>
	
	</form:form>

</body>
</html>