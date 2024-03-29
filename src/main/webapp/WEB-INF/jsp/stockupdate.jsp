<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Stock</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    integrity="sha384-OgVRvuATP1z7JjHLkuOUclJOKxBkLrVoBUUAP8hNBEppgxksz/qp0M6wBkMWvOJN" crossorigin="anonymous">
<style>
    body {
        background-color: #f8f9fa;
        color: #343a40;
        font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
    }
    .form-control {
        background-color: #f8f9fa;
        border: none;
        border-bottom: 2px solid #343a40;
        border-radius: 0;
        color: #343a40;
        font-size: 1.2rem;
    }
    .form-control:focus {
        box-shadow: none;
        border-color: #007bff;
    }
    .btn-primary {
        background-color: #007bff;
        border-color: #007bff;
        font-size: 1.2rem;
        font-weight: bold;
    }
    .btn-primary:hover {
        background-color: #0069d9;
        border-color: #0062cc;
    }
    h1 {
        color: #007bff;
        font-size: 3rem;
        font-weight: bold;
        text-align: center;
        text-shadow: 2px 2px #343a40;
    }
    table {
        width: 100%;
    }
    th {
        font-weight: bold;
        text-align: left;
        padding: 0.5rem;
    }
    td {
        padding: 0.5rem;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Stock Details</h1>
        <form action="/update" method="post">
            <table>
                <tr>
                    <th><label for="stockId">Stock ID:</label></th>
                    <td><input type="text" name="stockId" id="stockId" class="form-control"></td>
                </tr>
                <tr>
                    <th><label for="stockLocId">Stock Location ID:</label></th>
                    <td><input type="text" name="stockLocId" id="stockLocId" class="form-control"></td>
                </tr>
                <tr>
                    <th><label for="drugName">Drug Name:</label></th>
                    <td><input type="text" name="drugName" id="drugName" class="form-control"></td>
                </tr>
                <tr>
                    <th><label for="company">Company:</label></th>
                    <td><input type="text" name="company" id="company" class="form-control"></td>
                </tr>
                <tr>
                    <th><label for="dose">Dose:</label></th>
                    <td><input type="text" name="dose" id="dose" class="form-control"></td>
                </tr>
                <tr>
                    <th><label for="expDate">Expiration Date:</label></th>
                    <td><input type="text" name="expDate" id="expDate" class="form-control"></td>
                </tr>
            </table>
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Update Stock</button>
            </div>
        </form>
    </div>
</body>
</html>