<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Upload Prescription</title>
</head>
<body>
	<h1>Upload Prescription</h1>
	<form action="search_medicine.jsp" method="post" enctype="multipart/form-data">
		<label for="prescription">Select Prescription:</label>
		<input type="file" name="prescription" id="prescription" required><br><br>
		<input type="submit" value="Search">
	</form>
</body>
</html>
