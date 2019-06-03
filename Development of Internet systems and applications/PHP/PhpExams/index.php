<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<?php
session_start();
$p = 'start';
$_SESSION['index'] = 0;
$dir = 'internal/bookimg';
$_SESSION['img'] = scandir($dir);
//Checking if the "add to cart" has been Posted
if(isset($_POST['addtocart']))
{
	// If the cart is in the session
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
		// Otherwise, create one
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
		//Redirecting
	$_REQUEST['p']="shopingcart";
}
//ADD to Cart//

//DELETE ITEM (FROM CART)//
if(isset($_GET['action']))
	{
		if($_GET['action']=='delete')
		{
			foreach($_SESSION["cart"] as $keys => $values)
			{
				//Matchig the item
				if($values['item_id'] == $_GET['id'])
				{
					$_SESSION['index'] -= 1;
					//Delleting the item
					unset($_SESSION["cart"][$keys]);
					echo "<script>alert('Item Removed')</script>";
					$_REQUEST['p']="shopingcart";
				}
			}
		}
		elseif($_GET['action']=='deleteall')
		{
			//Empty the whole shopping cart
			$_SESSION['index'] = 0;
			unset($_SESSION["cart"]);
			echo "<script>alert('Cart reset')</script>";
			$_REQUEST['p']="shopingcart";
		}
	}
	//DELETE ITEM (FROM CART)//
?>
<head>
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <link rel="stylesheet" href="layout.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<script type="text/javascript">
var x = 0;
//Changing the icon for better navigation
	function changeicon(){
		if (x == 0){
			$(".ic1").attr("src","internal/expand-arrow(up).png");
			x = 1;
		}else{
				$(".ic1").attr("src","internal/expand-arrow(down).png");
				x = 0;
		}
		}
</script>
<body>
	<nav class="navbar navbar-custom navbar-expand-md">
			<a class="navbar-brand" href="#"><img src="internal/bookstore.jpg" style='width:80px;height:50px; position:relative; top:10px;'></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbar-custom" aria-expanded="false" aria-label="Toggle navigation">
			  <img src="internal/nav.png" style="width:50px; height:50px; position:relative; top:10px;"><span class="navbar-toggler-icon"></span>
			</button>

<!-- NAVIGATION BAR (TOP) -->
			<div class="collapse navbar-collapse" id="navbarNav">
				<div class="navbar-nav mx-auto">
						<ul class="navbar-nav nav-pills">
						<li class="nav-item">
						  <a class="p-3 nav-item nav-link" href="index.php?p=start" id="a1">Home Page<span class="sr-only">(current)</span></a>
						 </li>
						 <li class="nav-item">
						 <a class="p-3 nav-link" href="?p=shopinfo" id="a1">Our Shop</a>
						 </li>
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
<!-- NAVIGATION BAR (TOP) -->

	</nav>
<div id="middle">
	<div id="left">
		<div class="container-fluid">
			<div class="row">
				<nav class="col sidebar">

						<?php
						// ACCOUNT FUNCTIONS //
							require "internal/bookstoredb.php";
						?>
						<hr>
							<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation" onclick="changeicon()">
    						<img src="internal/account.png" style="width:50px; height:50px; position:relative;" id="a1">
								<img src="internal/expand-arrow(down).png" style="width:15px; height:15px; position:relative;" id="a1" class="ic1">
							</button>
							<div class="collapse navbar-collapse" id="navbarNavDropdown">
								<div style="background-color:#2F9DDD; border: 2px solid blue; border-radius: 5px;">
							<?php
							//Handling the menu
							//Loading the right Page for the user
							if(isset($_SESSION['username']))
							{
								if($_SESSION['username']=='admin')
								{
									print "<ul class='nav flex-column nav-pills'><li class='nav-item'><h2><a class='nav-link active ' href='#' id='h1'>Admin Menu</a></h2></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='index.php?p=customers' id='a1'>Lista Pelaton</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='index.php?p=orders' id='a1'>Lista paragkelion</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='index.php?p=products' id='a1'>Proionta</a></li></ul>";
								}
								if($_SESSION['username']!='out')
								{
									print "<ul class='nav flex-column nav-pills'><li class='nav-item'><h2><a class='nav-link active ' href='#' id='h2'>".$_SESSION['username']."</a></h2></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Emfanisi paragkelion</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='#' id='a1'>Stoixia pelaton</a></li>";
									print "<li class='nav-item'><a class='dropdown-item' href='?p=logout' id='a1'>logout</a></li>";
									print "</ul>";
								}else{
										print "<a href='?p=login' id='a1'>Login</a>";
									}
							}
								else{
										print "<a href='?p=login' id='a1'>Login</a>";
									}
							// ACCOUNT FUNCTIONS //
							?>
						</div>
							</div>
				</nav>
			</div>
		</div>
	</div>
	<div id="content">
		<?php
		//REQUIRE PAGES//
		if(isset($_REQUEST['p'])){
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
								echo"<script>alert('Goodbye!');</script>";
								echo"<script> window.location.replace('index.php?p=start');</script>";
								break;
			case 'bookstoredb':  require "internal/productlist.php";
								break;
			case 'purchase':	require "internal/purchase.php";
								break;
			case 'customers':	require "internal/customers.php";
								break;
			case 'orders':		require "internal/orders.php";
			case 'orderlist':	require "internal/orderlist.php";
								break;
			case 'placeorder':  require "internal/placeorder.php";
								break;
			case 'productedit': require "internal/productedit.php";
								break;
			default:
				print "The page doesn't exist";
			}
		}else {
			require "internal/start.php";
		}
			//REQUIRE PAGES//
		?>
	</div>
</div>
</body>
</html>
