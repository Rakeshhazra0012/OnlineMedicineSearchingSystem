<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Upload Prescription</title>
	
	<!-- Add Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Upload Prescription</h1>
		<form action="/prescription" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="prescription">Select Prescription:</label>
				<input type="file" class="form-control" name="prescription" id="prescription" required>
			</div>
			<button type="submit" class="btn btn-primary" formaction="/fileconfirmation">Submit</button>
		</form>
	</div>
	
	<!-- Add Bootstrap JS and jQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>
