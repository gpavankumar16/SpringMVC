<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<p>Hello ${s.studentName} your hobbies are ${s.studentHobby} on ${s.courseList} on ${s.joiningDate} with following address ${s.address.city}, ${s.address.state}, ${s.address.zipCode}</p>
<p> ${StudentName} This is new Variable.</p>
</body>
</html>