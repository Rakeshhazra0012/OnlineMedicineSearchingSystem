<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Store - Payment</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <style>
       
        h1, h2, p {
            color: white;
            text-align: center;
        }
        form {
            text-align: center;
        }
        button {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Payment</h1>
        <h2>Total Amount: $${totalAmount}</h2>

        <%-- Display a form to collect payment information --%>
        <form action="/process-payment" method="POST">
            <div class="form-group">
                <label for="cardNumber">Card Number:</label>
                <input type="text" name="cardNumber" id="cardNumber" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="expirationDate">Expiration Date:</label>
                <input type="text" name="expirationDate" id="expirationDate" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="cvv">CVV:</label>
                <input type="text" name="cvv" id="cvv" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="nameOnCard">Name on Card:</label>
                <input type="text" name="nameOnCard" id="nameOnCard" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" name="address" id="address" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="city">City:</label>
                <input type="text" name="city" id="city" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="state">State:</label>
                <input type="text" name="state" id="state" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="pin">Pin Code:</label>
                <input type="text" name="pin" id="pin" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary" formaction="/confirmation">Submit Payment</button>
        </form>

        <%-- Display a link to return to the cart --%>
        
    </div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>