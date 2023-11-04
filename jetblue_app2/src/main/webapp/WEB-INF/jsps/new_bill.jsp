<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employees</title>
</head>
<body>

<h1>Book  Fight JETBULE_AIRWAYS </h1>
  <!-- Bootstrap CSS
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
    <marquee>It was the second consecutive year that JetBlue beat Delta to the top spot when it came to satisfaction with their top-tier travel class offerings. J.D. Power's findings were based on responses from 7,774 passengers, who were polled between March 2022 and March 2023.</marquee>
      <!--Nav bars start
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
</nav> -->
<form action="savebill" method="post" >
<pre>
<h1>BOOKING SEATS</h1>
 FirstName: <input type="text" placeholder="Enter FirstName" name="firstName"/> LastName: <input type="text"  placeholder="Enter LastName" name="lastName"/> Email: <input type="email"   id="inputEmail4" placeholder="Enter Email" name="email"/> Mobile: <input type="text"  title="Error Message" pattern="[1-9]{1}[0-9]{9}" placeholder="Enter Mobile" name="mobile"/> Quantity: <input type="text"  placeholder="Enter Department"name="qty"/> Destination: <input type="text"  placeholder="Enter Experience"name="des"/>
<input type="submit" class="btn btn-primary" value="Book Now"/>
</pre>
</form>
</body>
</html>

<!--   <include file="menu.jsp" %> -->