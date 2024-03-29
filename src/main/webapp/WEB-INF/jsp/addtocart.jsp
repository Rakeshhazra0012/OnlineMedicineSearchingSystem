<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Store - Add to Cart</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <style>
        body {
            background-image: url('https://example.com/images/carts.jpg');
            background-size: cover;
        }
        h1, h2, h3, p {
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
<body style="background-image: url('/images/addcart.jpg');">
    <div class="container">
        <h3>Add to Cart</h3>
        <h1>${product.name}</h1>

        <%-- Display a message if the item was successfully added to the cart --%>
        <c:if test="${not empty message}">
            <div class="alert alert-success">${message}</div>
        </c:if>

        <%-- Display the product information and a form to add it to the cart --%>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="thumbnail">
                   
                    <div class="caption">
                        <p>${product.description}</p>
                        <p>Price: $${product.price}</p>
                        <form action="/payment" method="POST">
                            <input type="hidden" name="productId" value="${product.id}" />
                            <label for="quantity">Quantity:</label>
                            <input type="number" name="quantity" id="quantity" value="1" />
                            <button type="submit" class="btn btn-primary">Make Payment</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <%-- Display a link to return to the product list --%>
        <p><a href="listuser" class="btn btn-danger">Return to Product List</a></p>
    </div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>