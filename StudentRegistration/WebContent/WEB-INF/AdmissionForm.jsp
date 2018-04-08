<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:errors path="s.*"/>
<form action="submitAdmissionForm" method="post">
<p>
Student Name: <input type="text" name="studentName" />
</p>
<p>
Student Hobby: <input type="text" name="studentHobby" /> 
</p>
<p>
Student Joining Date: <input type="text" name="joiningDate" />
</p>
  <p>
Student Courses: <select name="courseList" multiple><option value="Java">Java</option><option value="Spring">Spring</option></select> 
</p>
<p>
Student City: <input type="text" name="address.city"/>
</p>
<p>
Student State: <input type="text" name="address.state"/>
</p>
<p>
Student Zipcode: <input type="text" name="address.zipCode"/>
</p>

<input type="submit" value="Click here !!" />
</form>
</body>
</html>