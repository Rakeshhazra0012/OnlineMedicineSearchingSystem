<!DOCTYPE html>
<html>
<head>
	<title>Search Medicine</title>
	
	
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Add Bootstrap CSS file -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<!-- Add custom CSS file -->
	<link rel="stylesheet" href="css/style.css">
	
</head>
<style>
.h1 {
 }
</style>

<body>
	<header>
		<h1 style="color: green;">MedZone</h1>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <ul class="navbar-nav">
   
    
    <li class="nav-item"><a class="nav-link" href="/about">About</a></li>
    <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
   
    <form class="form-inline my-2 my-lg-0">
        <a class="nav-link" href="/logout">Log Out</a>
  </ul>
  
	</header>
	
	<main>
		<section class="hero">
			<div class="container">
				<h2 class="text-center">Find the medicine you need!!!</h2>
				
				<form class="form-inline justify-content-center" action="search.jsp" method="get">
				
        
					 
				</form>
					<div style="text-align: center;">

        <form action="/medicine">
  <button type="submit" class="btn btn-primary mb-2" style="background-color: green;">Medicine List</button>
</form>
</div>
			</div>
			<div class="container">
				<h2 class="text-center">Have a Doctor's Prescription?</h2>
				
				<form class="form-inline justify-content-center" action="search.jsp" method="get">
				
        
					 
				</form>
					<div style="text-align: center;">

         <form action = "/prescription">
			
                <button type="submit" class="btn btn-primary mb-2" >Upload Prescription</button>
        </form>
  
</div>
			</div>
		</section>
		
		<br>
		<br>
		<br>
			<section class="product">
  <div class="container">
    <div class="row">
      <div class="col-md-4">
        <div class="card">
          <div class="card-body">
            <img src=data:image/jpeg;base64,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 
            alt="Product Image" style="width:200;height:100;">
          </div>
        </div>
      </div>
      <div class="col-md-6">
        <h2>Mamy Poko Pants Standard Pant Medium (M) Size Diapers</h2>
        <h3>Price: Rs.44.00</h3>
        <h4>Offer: 10% off</h4>
       
        
      </div>
    </div>
  </div>
</section>
			<br><br><br>
					
					<section class="product">
				  <div class="container">
				    <div class="row">
				      <div class="col-md-4">
				        <div class="card">
				          <div class="card-body">
				            <img src=https://gelusil.com/includes/images/gelusil_social.png
				            alt="Product Image" style="width:200;height:100;">
				          </div>
				        </div>
				      </div>
				      
				      <div class="col-md-6">
				        <h2>Gelusil Tablet</h2>
				        <h3>Price: Rs.104.86</h3>
				        <h4>Offer: 2.5% off</h4>
				       
				        
				      </div>
				    </div>
				  </div>
				</section>
				<br><br><br>
					<section class="product">
				  <div class="container">
				    <div class="row">
				      <div class="col-md-4">
				        <div class="card">
				          <div class="card-body">
				            <img src=https://cdn.aerohealthcare.com/wp-content/uploads/2023/01/HV20G-300x300.png
				            alt="Product Image" style="width:200;height:100;">
				          </div>
				        </div>
				      </div>
				      <div class="col-md-6">
				        <h2>Paracetamol 500mg</h2>
				        <h3>Price: Rs.85.93</h3>
				        <h4>Offer: 25% off</h4>
				       
				        
				      </div>
				    </div>
				  </div>
				</section>
				<br><br><br>
				<section class="product">
				  <div class="container">
				    <div class="row">
				      <div class="col-md-4">
				        <div class="card">
				          <div class="card-body">
				            <img src=https://onemg.gumlet.io/l_watermark_346,w_480,h_480/a_ignore,w_480,h_480,c_fit,q_auto,f_auto/cropped/w1odxblcgjmn9eskqfda.jpg
				            alt="Product Image" style="width:200;height:100;">
				          </div>
				        </div>
				      </div>
				      <div class="col-md-6">
				        <h2>WoodWards</h2>
				        <h3>Price: Rs.93</h3>
				        <h4>Offer: 10% off</h4>
				       
				        
				      </div>
				    </div>
				  </div>
				</section>
				<br><br><br>
				<section class="product">
				  <div class="container">
				    <div class="row">
				      <div class="col-md-4">
				        <div class="card">
				          <div class="card-body">
				            <img src=data:image/jpeg;base64,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
				            alt="Product Image" style="width:200;height:100;">
				          </div>
				        </div>
				      </div>
				      <div class="col-md-6">
				        <h2>RoseDay 10mg</h2>
				        <h3>Price: Rs.55</h3>
				        <h4>Offer: 5% off</h4>
				       
				        
				      </div>
				    </div>
				  </div>
				</section>
						
				</div>
			</div>
		</section>
	</main>
	<br><br><br>
	<footer>
		

	
	
		<p>&copy; 2024 Search Medicine. All rights reserved.</p>
	</footer>
</body>
</html>
