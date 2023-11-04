<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Passengers  for Airlines</title>
</head>
<body >
<h1>JET BLUE AIRWAYS</h1>
    <marquee>It was the second consecutive year that JetBlue beat Delta to the top spot when it came to satisfaction with their top-tier travel class offerings. J.D. Power's findings were based on responses from 7,774 passengers, who were polled between March 2022 and March 2023.</marquee>
      <!--Nav bars start-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#">Airways List</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      
      <li class="nav-item active">
        <a class="nav-link" href="newemp">ADD EMPLOYEE</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="newpass">ADD  PASSENEGER</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="listallemp">VIEW EMPLOYEE LIST</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="listall">VIEW PASSENGERS LIST</a>
      </li>
      
    </ul>
   
  </div>
</nav>
<h2>List of Passengers</h2>
<hr>
<table class="table table-striped">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile No</th>
<th>Update</th>
<th>Delete</th>
</tr>
<c:forEach var="passengers" items="${passengers}">
<tr>
<td>${passengers.firstName}</td>
<td>${passengers.lastName}</td>
<td>${passengers.email}</td>
<td>${passengers.mobile}</td>
<td><a href="update?id=${passengers.id}" class="btn btn-primary">Update</a></td>
<td><a href="deletepass?id=${passengers.id}" class="btn btn-danger">Delete</a></td>

</tr>


</c:forEach>

</table>

</body>
</html>