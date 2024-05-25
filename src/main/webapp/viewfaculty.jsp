<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Home Page</title>
      <link rel="stylesheet" href="css/style1.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
   </head>
   <body>
      <nav>
         <div class="menu-icon">
            <span class="fas fa-bars"></span>
         </div>
         <div class="logo">
            TrackLearnPractice
         </div>
         <div class="nav-items">
            <button class="dropbtn"><a style="text-decoration: none;"href="facultyhome">Home</a></button>
            <div class="dropdown">
			    <button class="dropbtn">Students
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="studentreg">Add Student</a>
			      <a href="viewallotedstu">View Students</a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Profile
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="facultycpwd">Change Password</a>
			      <a href="facultylogout">Logout</a>
			   
			    </div>
         </div>
         </div>
         
      </nav>
      
      <script>
         const menuBtn = document.querySelector(".menu-icon span");
         const searchBtn = document.querySelector(".search-icon");
         const cancelBtn = document.querySelector(".cancel-icon");
         const items = document.querySelector(".nav-items");
         const form = document.querySelector("form");
         menuBtn.onclick = ()=>{
           items.classList.add("active");
           menuBtn.classList.add("hide");
           searchBtn.classList.add("hide");
           cancelBtn.classList.add("show");
         }
         cancelBtn.onclick = ()=>{
           items.classList.remove("active");
           menuBtn.classList.remove("hide");
           searchBtn.classList.remove("hide");
           cancelBtn.classList.remove("show");
           form.classList.remove("active");
           cancelBtn.style.color = "#ff3d00";
         }
      </script>
      
      <form>
<table>
<h2 align="center">Faculty details</h2>
<tr><th>ID:</th>&nbsp;<td>${fac.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${fac.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${fac.gender}</td></tr>
<tr><th>Date of Birth:</th>&nbsp;<td>${fac.dob}</td></tr>
<tr><th>Department:</th>&nbsp;<td>${fac.department}</td></tr>
<tr><th>Qualification:</th>&nbsp;<td>${fac.qualification}</td></tr>
<tr><th>Designation:</th>&nbsp;<td>${fac.designation}</td></tr>
<tr><th>Experience:</th>&nbsp;<td>${fac.experience}</td></tr>
<tr><th>Location:</th>&nbsp;<td>${fac.location}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${fac.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${fac.contactno}</td></tr>



</table>
</form>
<div class="content">
         
         <img style="opacity: 0.2" src="images/1.png" alt="safe"\>
      </div>
   </body>
</html>