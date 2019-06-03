<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<?php
session_start();
if( ! isset($_SESSION['username'])) {
	$_SESSION['username']='?';
}

if(isset($_POST['addtocart']))
{
		if(isset($_SESSION['cart']))
		{
			$item_array_id = array_column($_SESSION['cart'], 'item_id');
			if(!in_array($_POST['id'], $item_array_id))
			{
				$count = count($_SESSION['cart']);
				$item_array = array(
				'item_title' => $_POST["title"],
				'item_price' => $_POST["price"],
				'item_quantity' => $_POST["quantity"],
				'item_id' => $_POST["id"]);
				$_SESSION['cart'][$count] = $item_array;
			}
			else
			{
				echo '<script>alert("Item Already Added")</script>';
				echo "<script>window.locaton='index.php'</script>";
			}
		}
		else
		{
				$_SESSION['cart'] = array();
				$item_array = array(
				'item_title' => $_POST["title"], 
				'item_price' => $_POST["price"],
				'item_quantity' => $_POST["quantity"],
				'item_id' => $_POST["id"]);
				$_SESSION['cart'][0] = $item_array;
		}
	$_REQUEST['p']="shopingcart";
}

if(isset($_GET['action']))
	{
		if($_GET['action']=='delete')
		{
			foreach($_SESSION["cart"] as $keys => $values)
			{
				if($values['item_id'] == $_GET['id'])
				{
				unset($_SESSION["cart"][$keys]);
				echo "<script>alert('Item Removed')</script>";
				$_REQUEST['p']="shopingcart";
				}
			}
		}
		elseif($_GET['action']=='deleteall')
		{
			unset($_SESSION["cart"]);
			echo "<script>alert('Cart reset')</script>";
			$_REQUEST['p']="shopingcart";
		}	
	}
?>
<head>
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <link rel="stylesheet" href="layout.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-custom navbar-expand-md">
			<a class="navbar-brand" href="#"><img src="internal/bookstore.jpg" style='width:80px;height:50px; position:relative; top:10px;'></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbar-custom" aria-expanded="false" aria-label="Toggle navigation">
			  <img src="internal/nav.png" style="width:50px; height:50px; position:relative; top:10px;"><span class="navbar-toggler-icon"></span>
			</button>
			
			<div class="collapse navbar-collapse" id="navbarNav">
				<div class="navbar-nav mx-auto">
					<ul class="navbar-nav nav-pills">
						<li class="nav-item">
						  <a class="p-3 nav-item nav-link" href="index.php?p=start" id="a1">Home Page<span class="sr-only">(current)</span></a>
						 </li>
						 <li class="nav-item">
						 <a class="p-3 nav-link" href="?p=shopinfo" id="a1">Our Shop</a>
						 </li>
						 <li class="nav-item">
						 <a class="p-3 nav-link" href="?p=products" id="a1">Products</a>
						 </li>
						 <li class="nav-item">
						 <a class="p-3 nav-link " href="?p=login" id="a1">LOGIN</a>
						 </li>
						 <li class="nav-item">
						 <a class="p-3 nav-link " href="?p=contact" id="a1">Contact</a>
						</li>
						 <li class="nav-item">
						 <a class="nav-link active" href="index.php?p=shopingcart" style="position:relative; top:7px; right:0px;" id="a1">
						 <?php
						 if(isset($_SESSION['cart']))
						 {
							 $s=0;
							 foreach($_SESSION['cart'] as $num)
							 { 
							 $s = $s + 1; 
							 } 
							 print "(".$s.")"; 
						 }else
							 print '(0)';
						 ?>
						 <img src="internal/cart.png" style='width:40px;height:30px;'></a>
						</li>
					</ul>
				</div>
		  </div>
					

	</nav>


<div id="middle">
	<div id="left">
		<div class="container-fluid">
			<div class="row">
				<nav class="col sidebar">
					
						<?php
							require "internal/bookstoredb.php";
						?>
						<hr>
							<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    						<img src="internal/account.png" style="width:50px; height:50px; position:relative;" id="a1"></button>
							<div class="collapse navbar-collapse" id="navbarNavDropdown">
							<?php
								if($_SESSION['username']=='admin') {
									print "<ul class='nav flex-column nav-pills'><li class='nav-item'><h2><a class='nav-link active ' href='#' id='h1'>Admin Menu</a></h2></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Lista Pelaton</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Lista paragkelion</a></li></ul>";
									print "<ul class='nav flex-column nav-pills'><li class='nav-item'><h2><a class='nav-link active ' href='#' id='h2'>User Menu</a></h2></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Emfanisi paragkelion</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Stoixia pelaton</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='?p=logout' id='a1'>logout</a></li>";
									print "</ul>";
									}else{
										print "<h1>No account</h1>";
									}
									
							?>
							</div>
				</nav>
			</div>
		</div>
	</div>

	<div id="content">
		<?php
			$p = $_REQUEST['p'];
			switch ($p){
			case "start" :		require "internal/start.php";
								break;
			case "shopinfo": 	require "internal/shopinfo.php";
								break;
			case "login" :		require "internal/login.php";
								break;
			case 'do_login':	require "internal/do_login.php";
								break;
			case 'shopingcart':	require "internal/shopingcart.php";
								break;
			case 'products':	require "internal/products.php";
								break;
			case 'contact'	:	require "internal/contact.php";
								break;
			case 'logout':		$_SESSION['username']='out';
								print "Goodbye!";
								break;
			case 'bookstoredb':  require "internal/storesite.php";
								break;
			case 'purchase':	require "internal/purchase.php";
								break;
			default:
				print "The page doesn't exist";
			}
		require "internal/addtocart.php";
		?>
	</div>
</div>
</body>
</html>