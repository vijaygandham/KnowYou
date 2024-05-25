<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="css/safe.css">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
</head>
<body>
   <input type="checkbox" id="menu-toggle">
    <div class="sidebar">
        <div class="side-header">
            <h3>Know<span>You</span></h3>
        </div>
        
        <div class="side-content">
            <div class="profile">
                <div class="profile-img bg-img" style="background-image: url(images/pro.png)"></div>
                <h4><c:out value="${auname}"></c:out></h4>
                <small>Admin</small>
            </div>

            <div class="side-menu">
                <ul>
                    <li>
                       <a href="adminhome" >
                            <span class="las la-home"></span>
                            <small>Dashboard</small>
                        </a>
                    </li>
                    <li>
                       <a href="">
                            <span class="las la-user-alt"></span>
                            <small>Profile</small>
                        </a>
                    </li>
                    <li>
                       <a href="stunav" class="active">
                            <span class="las la-user-friends"></span>
                            <small>Students</small>
                            
                        </a>
                    </li>
                    <li>
                       <a href="facnav">
                            <span class="las la-user-alt"></span>
                            <small>Mentor</small>
                        </a>
                    </li>
                    <li>
                       <a href="tranav">
                            <span class="las la-user-alt"></span>
                            <small>Trainer</small>
                        </a>
                    </li>
                    <li>
                       <a href="">
                            <span class="las la-user-alt"></span>
                            <small>Courses</small>
                        </a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
    
    <div class="main-content">
        
        <header>
            <div class="header-content">
                <label for="menu-toggle">
                    <span class="las la-bars"></span>
                </label>
                
                <div class="header-menu">
                    <div class="user">
                        <div class="bg-img" style="background-image: url(images/pro.png)"></div>
                        <span class="las la-power-off"></span>
                        <a href="adminlogout">Logout</a>
                    </div>
                </div>
            </div>
        </header>
        
        
        <main>
            
            <div class="page-header">
                <h1>Student Registration</h1>
                <small>Home / Students</small>
            </div>
            <div class="forms">
<form:form action="addstudent" method="post" modelAttribute="stu">

   <table>
      <tr>
         <td><label>Id</label></td>
         <td>
         <form:input path="student_id" required="required"></form:input>
         </td>
         </tr>
   <tr>
   <td><label>Name</label></td>
   <td>
   <form:input path="name" required="required"></form:input>
   </td>
   </tr>
   
   
   
   <tr>
   <td><label>Gender</label></td>
   <td>
   <form:radiobutton path="gender" value="Male" required="required"/>Male
   <form:radiobutton path="gender" value="Female" required="required"/>Female
   </td>
   </tr>
   
   
   
   <tr>
   <td><label>Date of Birth</label></td>
   <td><form:input path="dob" required="required" placeholder="DD/MM/YYYY"/></td>
   </tr>
   
   
   
   <tr>
   <td><label>Department</label></td>
   <td><form:input path="department" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Year</label></td>
   <td><form:input path="year" required="required"/></td>
   </tr>
   
   <tr>
   <td><label>CGPA</label></td>
   <td><form:input path="cgpa" required="required"/></td>
   </tr>
   
   <tr>
   <td><label>Backlogs</label></td>
   <td><form:input path="backlogs" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Location</label></td>
   <td><form:input path="location" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Email ID</label></td>
   <td><form:input path="emailid" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Username</label></td>
   <td><form:input path="username" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Password</label></td>
   <td><form:password path="password" required="required"/></td>
   </tr>
   
   
   <tr>
   <td><label>Contact No</label></td>
   <td><form:input path="contactno" required="required"/></td>
   </tr>
   
   
   
   <tr align=center>
   <td colspan=2><input type="submit" value="Register" class="button"></td>
   </tr>
   
   </table>
   
   </form:form>
</div>
              </main>
              </div>      
</body>
</html>