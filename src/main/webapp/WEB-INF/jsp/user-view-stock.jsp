<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>Stock List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" crossorigin="anonymous">
<style>
    body {
        padding: 50px;
    }
    table {
        margin: 0 auto;
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 10px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    
    .form-group {
        margin-bottom: 10px;
    }
      .form-container {
        display: flex;
        justify-content: space-between;
        margin-bottom: 20px;
    }

    .form-container form {
        flex: 1;
        margin-right: 10px;
    }

    .form-container form:last-child {
        margin-right: 0;
    }
   
    /* Define a style for the submit button */
    input[type=submit] {
        background-color:grey; /* Green background */
        color: white; /* White text */
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    /* Define a style for the submit button when it is clicked */
    input[type=submit]:active {
        background-color:green; /* Darker green background */
    }


<form action="/list-user">
    <input type="submit" value="Show All">
</form>
    
</style>
</head>
<body>
    <h1 class="text-center mb-5">Stock List</h1>
    <div class="container">
           <div class="form-container">
   <form action="/filter-user" method="POST">
    <label>Search:</label>
    <input type="text" name="keyword" value="${keyword}" required>
    <input type="submit" value="Search" onclick="convertToLowercase()">
</form>

<script>
    function convertToLowercase() {
        var keywordInput = document.getElementsByName("keyword")[0];
        keywordInput.value = keywordInput.value.toLowerCase();
    }
</script>
   
    <form action="/list-user">
        <input type="submit" value="Show All">
    </form>
</div>
       
      
            

        <table>
            <thead>
                <tr>
                    <th>Stock ID</th>
                    <th>Stock Location ID</th>
                    <th>Drug Name</th>
                    <th>Company</th>
                    <th>Dose</th>
                    <th>Expiration Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${stock}" var="stock">
                    <tr>
                        <td>${stock.stockId}</td>
                        <td>${stock.stockLocId}</td>
                        <td>${stock.drugName}</td>
                        <td>${stock.company}</td>
                        <td>${stock.dose}</td>
                        <td>${stock.expDate}</td>
                        <td>
                        <form method="POST" action="/payment">
                                <button type="submit" class="btn btn-danger">ADD CART</button>
                            </form></td>
                    </tr>
                    
                    
                    
                </c:forEach>
                <c:forEach items="${stockfilter}" var="stock">
                    <tr>
                        <td>${stock.stockId}</td>
                        <td>${stock.stockLocId}</td>
                        <td>${stock.drugName}</td>
                        <td>${stock.company}</td>
                        <td>${stock.dose}</td>
                        <td>${stock.expDate}</td>
                        <td><form method="POST" action="/payment">
                                <button type="submit" class="btn btn-danger">ADD CART</button>
                            </form></td>
                          
                    </tr>
                    
                    
                </c:forEach>
            </tbody>
        </table>
 
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" crossorigin="anonymous"></script>
  
  
  
</body>
</html>