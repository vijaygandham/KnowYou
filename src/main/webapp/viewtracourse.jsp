<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <button class="dropbtn"><a style="text-decoration: none;"href="trainerhome">Home</a></button>
            <div class="dropdown">
			    <button class="dropbtn">Courses
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="viewtracourse">Access Courses</a>
			      <a href="viewschedule">View Schedule</a>
			    </div>
			    </div>
			    <div class="dropdown">
			    
			     <button class="dropbtn">Students
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="facultyreg">Add Faculty</a>
			      <a href="viewallfac">View Faculty</a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Materials
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="trainerreg">Add Trainer</a>
			      <a href="viewalltra">View Trainers</a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Tests
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="trainerreg">Add Trainer</a>
			      <a href="viewalltra">View Trainers</a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Profile
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="trainercpwd">Change Password</a>
			      <a href="trainerlogout">Logout</a>
			   
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
      <h3 align=center><u>View All Trainers</u></h3>

<table align=center border=1 style="border:inherit;">

<tr>
<th>Trainer ID</th>
<th>Course ID</th>
<th>Course CODE</th>
<th>Course Name</th>
<th>Course Description</th>
<th>Course Link</th>
<th>Action</th>


</tr>



<tr>
<td> <c:out value="${tid.id}"></c:out>   </td>
<td> <c:out value="${c.id}"></c:out>   </td>
<td> <c:out value="${c.courseid}"></c:out>   </td>
<td> <c:out value="${c.coursename}"></c:out>   </td>
<td> <c:out value="${c.coursedescription}"></c:out>   </td>
<td> <a style="color: blue;text-decoration: none" href="${c.courselink}">Link</a></td>
<td> 

<a style="color: red;text-decoration: none" href='<c:url value='addschedule?id=${c.id}&tid=${tid.id}'></c:url>'>Add Schedule</a>&nbsp;&nbsp;

</td>


</tr>



</table>
</form>
   </body>
</html>