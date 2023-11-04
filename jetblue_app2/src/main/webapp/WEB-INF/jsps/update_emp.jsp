<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
       <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>

<h1>JET BLUE AIRWAYS</h1>
    <marquee>It was the second consecutive year that JetBlue beat Delta to the top spot when it came to satisfaction with their top-tier travel class offerings. J.D. Power's findings were based on responses from 7,774 passengers, who were polled between March 2022 and March 2023.</marquee>
    

<form action="updateemp" method="post" >
<h1>Update Employee Details</h1>

<input type="hidden" name="id" value="${employee.id}"/>
<div class="form-group row">FirstName <input type="text" class="form-control mb-2 mr-sm-2" name="firstName" value="${employee.firstName}"/></div>
<div class="form-group row">LastName <input type="text"  class="form-control mb-2 mr-sm-2"name="lastName" value="${employee.lastName}"/></div>
<div class="form-group row">Email <input type="text" class="form-control mb-2 mr-sm-2" name="email" value="${employee.email}"/></div>
<div class="form-group row">Mobile <input type="text" class="form-control mb-2 mr-sm-2" name="mobile" value="${employee.mobile}"/></div>
<div class="form-group row">Department <input type="text"  class="form-control mb-2 mr-sm-2"name="dept" value="${employee.dept}"/></div>
<div class="form-group row">Salary <input type="text"  class="form-control mb-2 mr-sm-2"name="salary" value="${employee.salary}"/></div>
<div class="form-group row">Experience<input type="text" class="form-control mb-2 mr-sm-2" name="exp" value="${employee.exp}"/></div>
<input type="submit" class="btn btn-primary" value="Update Employees"/>

</form>
</body>
</html>