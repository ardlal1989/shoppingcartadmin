<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Food App</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/custom.css"
        rel="stylesheet">
<!--script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/pageLoader.js"></script>
<script src="js/callUpdate.js"></script>

</head>
<body bgcolor=#ddd>
    <div id="parent">
        <div>
            <div id="header" class="header">
            
            <img src="images/icon.png" alt="Smiley face"  align="left" height="60" width="60">
            <h1 align="center">The Pizza Lounge</h1>
            <p align="center"><i>Your destination for mouth watering Italian food</i></p>
            
            
            
  
</div>
<div id="navbar" class="navbar">
  <a href="#main" class="active">OrderManagement</a>
  <!--a href="#side" class="contact">ContactUs</a-->
  
</div>
<div class="row">
            <div id="main" class="main">
                <h3><center><b>Order Administration Page</b></center></h3>
            <br/>
                <div id="tab" class="tab">
                    <table id="orders" border="2" align="center">
                        <tr>
                            <th>OrderId</th>
                            <th>Username</th>
                            <th>User Address</th>
                            <th>User Email</th>
                            <th>OrderDate</th>
                            <th>Order Confirmed</th>
                            <th>Preparing Your Order</th>
                            <th>Out For Delivery</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach var="order" items="${orderUsers}">
                            <tr>
                                <td><b>${order.orderid}</b></td>
                                <td><b>${order.username}</b></td>
                                <td><b>${order.useraddress}</b></td>
                                 <td><b>${order.useremail}</b></td>
                                <td><b>${order.orderdatetime}</b></td>
                                <td>
                                <c:if test = "${order.order_received==false}">
                                 <i class="fa fa-clock-o" style="font-size:36px;color:black" aria-hidden="true"></i>
                                </c:if>
                                <c:if test = "${order.order_received==true}">
                                 <i class="fa fa-check-circle" align="center" style="font-size:36px;color:green"></i>
                                </c:if>
                                </td>
                                <td>
                                <c:if test = "${order.order_accepted==false}">
                                 <i class="fa fa-clock-o" style="font-size:36px;color:black" aria-hidden="true"></i>
                                </c:if>
                                <c:if test = "${order.order_accepted==true}">
                                 <i class="fa fa-check-circle" align="center" style="font-size:36px;color:green"></i>
                                </c:if>
                                </td>
                                <td>
                                <c:if test = "${order.order_outfordelivery==false}">
                                 <i class="fa fa-clock-o" style="font-size:36px;color:black" aria-hidden="true"></i>
                                </c:if>
                                <c:if test = "${order.order_outfordelivery==true}">
                                 <i class="fa fa-check-circle" align="center" style="font-size:36px;color:green"></i>
                                </c:if>
                                </td>
                                <td>
                                    
                                    <!--form id ="update" action="/order/${order.orderid}" method="get"-->
                                    <button onclick="updateStatus('ShoppingCartAdminPage-0.0.1-SNAPSHOT/order/${order.orderid}')">ProcessOrder</button>
                                     
                                    <!--/form-->
                                </td>
                            </tr>
                        </c:forEach>
                        
                    </table>
                </div>
            </div>
        </div>
        
 </div>
<div class="footer">
    
  <h4 align="center">Powered by CAS - AI Labs</h4>
</div>
    </div>
</body>
</html>
