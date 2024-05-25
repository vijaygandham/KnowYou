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
			      <a href="#">View Students</a>
			      <a href="#"></a>
			    </div>
			    </div>
			    <div class="dropdown">
			    
			     <button class="dropbtn">Faculty 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="facultyreg">Add Faculty</a>
			      <a href="#">View Faculty</a>
			      <a href="#"></a>
			    </div>
			    </div>
			    <div class="dropdown">
			     <button class="dropbtn">Trainer 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			      <a href="trainerreg">Add Trainer</a>
			      <a href="#">View Trainers</a>
			      <a href="#"></a>
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
      
      <div class="login-box">
      <form  method="post" action="updateadminpwd">
        <h1>Change Password</h1>
        <br>
        <span class="blink">
    <h3 align=center style="color: red"><c:out value="${msg}"/></h3>
    </span>
        <label >Old Password</label>
        <input type="password" name="aopwd" required/>
        <label >New Password</label>
        <input type="password" name="anpwd" required/>
        <input  type="submit" value="Change Password" />
      </form>
      </div>
   </body>
</html>