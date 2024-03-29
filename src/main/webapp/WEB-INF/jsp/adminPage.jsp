<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <!-- Link to Bootstrap CSS file -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        /* Add custom CSS styles here */
        body {
            background-image: url("https://example.com/background.jpg");
            font-family: "Arial", sans-serif;
            font-size: 18px;
            line-height: 1.5;
            margin: 0;
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center center;
        }
        h1 {
            color: #0072c6;
            font-size: 40px;
            font-weight: 700;
            margin-top: 40px;
            margin-bottom: 20px;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.5);
        }
        p {
            color: #333;
            margin-bottom: 20px;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.5);
        }
        form {
            margin-top: 20px;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 15px;
        }
        .btn-primary {
            background-color: #0072c6;
            border-color: #0072c6;
            color: #fff;
            text-shadow: none;
        }
        .btn-secondary {
            background-color: #fff;
            border-color: #0072c6;
            color: #0072c6;
            text-shadow: none;
        }
        .btn-success {
            background-color: #28a745;
            border-color: #28a745;
            color: #fff;
            text-shadow: none;
        }
        .btn-warning {
            background-color: #ffc107;
            border-color: #ffc107;
            color: #333;
            text-shadow: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Welcome, ${designation}!</h1>
        <p class="text-center">You have successfully logged in.</p>
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <form method="GET" action="/logout">
                    <button type="submit" class="btn btn-primary btn-block">Logout</button>
                </form>
                 <form method="GET" action="/register">
                    <button type="submit" class="btn btn-secondary btn-block">Register Others</button>
                </form>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 offset-md-2">
                <form action="/update">
                    <button type="submit" class="btn btn-success btn-block">Add Stock</button>
                </form>
            </div>
            <div class="col-md-4">
                <form method="GET" action="/list">
                    <button type="submit" class="btn btn-warning btn-block">View Stocks</button>
                </form>
            </div>
        </div>
    </div>
    <!-- Link to jQuery and Bootstrap JS files -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>