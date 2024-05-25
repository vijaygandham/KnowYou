<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
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
      
            
<form:form action="submitschedule" method="post" modelAttribute="sch">

   <table align=center>
   <tr>
         <td><label>Trainer Id</label></td>
         <td>
         <form:input readonly="true" path="trainer_id" value="${tid}" ></form:input>
         </td>
         </tr>
         <tr><td></td></tr>
      <tr>
   <tr>
         <td><label>Course Id</label></td>
         <td>
         <form:input readonly="true" path="course_id" value="${cid}" ></form:input>
         </td>
         </tr>
         <tr><td></td></tr>
      <tr>
         <td><label>StartDate</label></td>
         <td>
         <form:input type="date" path="startdate" required="required" ></form:input>
         </td>
         </tr>
         <tr><td></td></tr>
   <tr>
   <td><label>Time</label></td>
   <td>
   <form:input path="time" required="required" ></form:input>
   </td>
   </tr>
   <tr><td></td></tr>
   <tr>
   <td><label>Venue</label></td>
   <td>
   <form:input path="venue" required="required" ></form:input>
   </td>
   </tr>
   
   <tr><td></td></tr>
   <tr>
   <td><label>Days</label></td>
   <td>
   <form:input path="days" required="required" ></form:input>
   </td>
   </tr>
   
   <tr><td></td></tr>
   <tr>
   <td><label>EndDate</label></td>
   <td>
   <form:input type="date"  path="enddate" required="required"></form:input>
   </td>
   </tr>
   
   <tr><td></td></tr>
   <tr align=center>
   <td colspan=2><input type="submit" value="Add Schedule" class="button"></td>
   </tr>
   
   </table>
   
   </form:form>
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
      
   </body>
</html>