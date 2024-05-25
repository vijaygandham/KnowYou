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
            <button class="dropbtn"><a style="text-decoration: none;"href="adminhome">Home</a></button>
            <div class="dropdown">
			    <button class="dropbtn">Student 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="studentreg">Add Student</a>
			      <a href="viewallstu">View Students</a>
			    </div>
			    </div>
			    <div class="dropdown">
			    
			     <button class="dropbtn">Faculty 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="facultyreg">Add Faculty</a>
			      <a href="viewallfac">View Faculty</a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Trainer 
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
			      <a href="admincpwd">Change Password</a>
			      <a href="adminlogout">Logout</a>
			   
			    </div>
         </div>
         </div>
         
      </nav>
       <div class="content">
         
         <img style="opacity: 0.1" src="images/1.png" alt="safe"\>
      </div>
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
      <h3 align=center><u>View All Students</u></h3>

<table align=center border=1 style="border:inherit;">

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Department</th>
<th>Year</th>
<th>CGPA</th>
<th>Backlogs</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${stulist}" var="stu">

<tr>

<td> <c:out value="${stu.id}"></c:out>   </td>
<td> <c:out value="${stu.name}"></c:out>   </td>
<td> <c:out value="${stu.gender}"></c:out>   </td>
<td> <c:out value="${stu.dob}"></c:out>   </td>
<td> <c:out value="${stu.department}"></c:out>   </td>
<td> <c:out value="${stu.year}"></c:out>   </td>
<td> <c:out value="${stu.backlogs}"></c:out>   </td>
<td> <c:out value="${stu.location}"></c:out>   </td>
<td> <c:out value="${stu.emailid}"></c:out>   </td>
<td> <c:out value="${stu.username}"></c:out>   </td>
<td> <c:out value="${stu.contactno}"></c:out>   </td>
<td> 

<a  style="color:red;" href='<c:url value='deletestu?id=${stu.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a style="color:red;"href='<c:url value='viewstubyid?id=${stu.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>
</form>
   </body>
</html>