<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            margin-top: 50px;
        }

        .error {
            color: red;
        }

        .success {
            color: green;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Registration</h1>
        <form method="post" action="/register">
 <div class="mt-3 text-center">
				<p class="text-danger">${error}</p>
			</div>
            <div class="form-group">
                <label>User ID:</label>
                <input type="number" name="staffId" class="form-control" value="${users.staffId}">
            </div>
            <div class="form-group">
                <label for="designation">Designation:</label>
                <select class="form-control" id="designation" name="designation">
                    <option value="Admin">Admin</option>
                    <option value="User">User</option>
                </select>
            </div>
            <div class="form-group">
                <label>First Name:</label>
                <input type="text" name="fname" class="form-control" value="${users.fname}">
            </div>
            <div class="form-group">
                <label>Last Name:</label>
                <input type="text" name="lname" class="form-control" value="${users.lname}">
            </div>
            <div class="form-group">
                <label>Address:</label>
                <input type="text" name="address" class="form-control" value="${users.address}">
            </div>
            <div class="form-group">
                <label>Phone:</label>
                <input type="text" name="phone" class="form-control" value="${users.phone}">
            </div>
            <div class="form-group">
                <label>Email:</label>
                <input type="email" name="email" class="form-control" value="${users.email}">
            </div>
            <div class="form-group">
                <label>UserName:</label>
                <input type="text" name="username" class="form-control" value="${users.username}">
            </div>
            <div class="form-group">
                <label>Password:</label>
                <input type="password" name="password" class="form-control" value="${users.password}">
            </div>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
        <div id="success-msg" class="mt-3" style="display: none;"></div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
   
</body>
</html>