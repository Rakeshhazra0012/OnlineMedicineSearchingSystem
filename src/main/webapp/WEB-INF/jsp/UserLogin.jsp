<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login | Search Medicine</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <link rel="stylesheet" href="styles.css">
  <style>
    .card {
      background-color: rgba(255, 255, 255, 0.5); /* Change the opacity value here */
      border-radius: 10px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
    }
    .card-body {
      background-color: rgba(255, 255, 255, 0.5);
      font-weight: bold;
    }
    body {
      background-color: #f2f2f2;
      background-image: url('/images/image.webp');
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
      height: 100vh;
    }
    label {
      color: #333;
      font-weight: bold;
    }
    input[type="text"], input[type="password"] {
      background-color: #fff;
      border-radius: 5px;
      border: none;
      padding: 10px;
      box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
    }
    input[type="submit"] {
      background-color: #007bff;
      border: none;
      border-radius: 5px;
      color: #fff;
      padding: 10px 20px;
      font-weight: bold;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #0062cc;
    }
    a {
      color: #333;
    }
    a:hover {
      color: #007bff;
    }
  </style>
</head>
<body>

  <!-- Login Form -->
  <div class="container my-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card">
          <div class="card-header">
            
         <div class="card-body d-flex justify-content-center">
  <form action="/login">
    <div class="mb-3">
      <label for="username" class="form-label">UserName</label>
      <input type="text" class="form-control" name="username" id="email" required>
    </div>
    <div class="mb-3">
      <label for="password" class="form-label">Password</label>
      <input type="password" name="password" class="form-control" id="password" required>
    </div>
    <div class="text-center">
      <input type="submit" value="Login" class="btn btn-primary">
    </div>
  </form>
  
</div>
  </form>
  <div class="mt-3 text-center">
    <p>New user? <a href="/register">Register here</a></p>
  </div>
   </div>
${error}
</div>
   
</div>
</div>
       
      </div>
    </div>
  </div>
<script>
		// Function to hide the success message after a specific time interval
		function hideSuccessMessage() {
			var successMessage = document.getElementById("successMessage");
			successMessage.style.display = "none";
		}

		// Function to hide the error message after a specific time interval
		function hideErrorMessage() {
			var errorMessage = document.getElementById("errorMessage");
			errorMessage.style.display = "none";
		}

		// Set the time interval (in milliseconds) for the messages to be displayed
		var displayTime = 5000; // Change this value to the desired time interval

		// Call the hideSuccessMessage function after the specified time interval
		setTimeout(hideSuccessMessage, displayTime);

		// Call the hideErrorMessage function after the specified time interval
		setTimeout(hideErrorMessage, displayTime);
	</script>
  <!-- Bootstrap JavaScript and jQuery -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <!-- Popper -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNSbH" crossorigin="anonymous"></script>
  <!-- Bootstrap -->
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>