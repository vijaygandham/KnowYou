<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="css/style.css">
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
                       <a href="profile">
                            <span class="las la-user-alt"></span>
                            <small>Profile</small>
                        </a>
                    </li>
                    <li>
                       <a href="stunav">
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
                       <a href="tranav" class="active">
                            <span class="las la-user-alt"></span>
                            <small>Trainer</small>
                        </a>
                    </li>
                    <li>
                       <a href="counav">
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
                <h1>Dashboard</h1>
                <small>Home / Trainers</small>
            </div>
            
            <div class="records table-responsive">

                    <div class="record-header">
                        <div class="add">
                            <button><a href="trainerreg" style="color: white">Add record</a></button>
                        </div>


                    </div>

                    <div>
                        <table width="100%">
                            <thead>
                                <tr>
                                    
                                    <th><span class="las la-sort"></span> ID</th>
                                    <th><span class="las la-sort"></span> NAME</th>
                                    <th><span class="las la-sort"></span> GENDER</th>
                                    <th><span class="las la-sort"></span> QUALIFICATION</th>
                                    <th><span class="las la-sort"></span> EXPERIENCE</th>
                                    <th><span class="las la-sort"></span> ORGANISATION</th>
                                    <th><span class="las la-sort"></span> EMAIL ID</th>
                                    <th><span class="las la-sort"></span> USERNAME</th>
                                    <th><span class="las la-sort"></span> CONTACT NO</th>
                                    <th><span class="las la-sort"></span> ACTION</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${tralist}" var="tra">

<tr>

<td> <c:out value="${tra.trainer_id}"></c:out>   </td>
<td> <c:out value="${tra.name}"></c:out>   </td>
<td> <c:out value="${tra.gender}"></c:out>   </td>
<td> <c:out value="${tra.qualification}"></c:out>   </td>
<td> <c:out value="${tra.experience}"></c:out>   </td>
<td> <c:out value="${tra.organisation}"></c:out>   </td>
<td> <c:out value="${tra.emailid}"></c:out>   </td>
<td> <c:out value="${tra.username}"></c:out>   </td>
<td> <c:out value="${tra.contactno}"></c:out>   </td>
<td> 

<a style="color: red;" href='<c:url value='deletetra?id=${tra.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a style="color: red;" href='<c:url value='viewtrabyid?id=${tra.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

                            </tbody>
                        </table>
                    </div>

                </div>
            
            </div>
            
       

                    
</body>
</html>