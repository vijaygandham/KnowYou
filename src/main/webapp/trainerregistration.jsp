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
      <link rel="stylesheet" href="css/reg.css">
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
      
<form:form action="addtrainer" method="post" modelAttribute="tra">
<h3>Trainer Registration</h3>
   <table align=center>
      <tr>
         <td><label>Trainer Id</label></td>
         <td>
         <form:input path="trainer_id" required="required"></form:input>
         </td>
         </tr>
   <tr>
   <td><label>Name</label></td>
   <td>
   <form:input path="name" required="required"></form:input>
   </td>
   </tr>
   
   <tr><td></td></tr>
   
   <tr>
   <td><label>Gender</label></td>
   <td>
   <form:radiobutton path="gender" value="Male" required="required"/>Male
   <form:radiobutton path="gender" value="Female" required="required"/>Female
   </td>
   </tr>
   
   <tr><td></td></tr>
   
   
   <tr>
   <td><label>Qualification</label></td>
   <td>
   <form:select path="qualification" required="required">
   <form:option value="-1">Select</form:option>
   <form:option value="B.Tech">B.Tech</form:option>
   <form:option value="M.Tech">M.Tech</form:option>
   <form:option value="PHD">PHD</form:option>
   </form:select>
   </td>
   </tr>
   
   
   <tr><td></td></tr>

   

    <tr>
        <td><label>Experience</label></td>
        <td>
        <form:input path="experience" required="required"></form:input>
        </td>
        </tr>
    <tr><td></td></tr>
    <tr>
        <td><label>organisation</label></td>
        <td>
        <form:input path="organisation" required="required"></form:input>
        </td>
        </tr>
        <tr><td></td></tr>
        <tr>
   <td><label>Email ID</label></td>
   <td><form:input path="emailid" required="required"/></td>
   </tr>
   
   <tr><td></td></tr>
   
   <tr>
   <td><label>Username</label></td>
   <td><form:input path="username" required="required"/></td>
   </tr>
   
   <tr><td></td></tr>
   
   <tr>
   <td><label>Password</label></td>
   <td><form:password path="password" required="required"/></td>
   </tr>
   
   <tr><td></td></tr>
   
   <tr>
   <td><label>Contact No</label></td>
   <td><form:input path="contactno" required="required"/></td>
   </tr>
   
   <tr><td></td></tr>
   <tr>
    <td><label>Location</label></td>
    <td><form:input path="location" required="required"/></td>
    </tr>
    
    <tr><td></td></tr>
       <td><label>Courses</label></td>
    
     <td>
   <form:select path="course" required="required">
   <form:option value="-1">Select</form:option>
   <form:option value="220C01-Clanguage">220C01 -CLANGUAGE</form:option>
   <form:option value="220J02-Java">220J02 -JAVA</form:option>
   <form:option value="220P03-Python">220P03 -PYTHON</form:option>
   <form:option value="220Aw04-AWS">220Aw04-AWS</form:option>
   <form:option value="220Ap03-Aptitude">220Ap03-APTITUDE</form:option>
   </form:select>
   </td>
   </tr>
   
   
   <tr><td></td></tr>
     <tr>
        <td><label>Course Description</label></td>
        <td>
        <form:input path="coursedescription" required="required"></form:input>
        </td>
        </tr>
    <tr><td></td></tr>
     <tr>
        <td><label>Course Link</label></td>
        <td>
        <form:input path="courselink" required="required"></form:input>
        </td>
        </tr>
    <tr><td></td></tr>
   
   <tr align=center>
   <td colspan=2><input type="submit" value="Register" class="button"></td>
   </tr>
   </table>
   
   </form:form>
   
   </body>
</html>