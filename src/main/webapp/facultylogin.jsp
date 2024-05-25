<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Faculty Login</title>
      <link rel="stylesheet" href="css/login.css">
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
            <li><a href="/">Home</a></li>
             <li><a href="adminlogin">Admin</a></li>
            <li><a href="studentlogin">Student</a></li>
            <li><a href="facultylogin">Mentor</a></li>
            <li><a href="trainerlogin">Trainer</a></li>
           
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
      
      
      <div class="login">
      <form  method="post" action="checkfacultylogin">
        <h1>Faculty Login</h1>
        <br>
        <span class="blink">
    <h3 align=center style="color: red"><c:out value="${msg}"/></h3>
    </span>
        <label >UserName</label>
        <input type="text" name="funame" required/>
        <label >Password</label>
        <input type="password" name="fpwd" required/>
        <input  type="submit" value="Login" />
      </form>
      </div>
      
   </body>
</html>