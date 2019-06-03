<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<table border=1 class="mt-1">
<tr>
	<th width=60%> Title </th>
	<th width=20% style="text-align:center"> Quanity </th>
	<th width=15% style="text-align:center"> Final Price </th>
	<th width=5% style="text-align:center"> X </th>
</tr>
	<?php
	//initialize variables
	$total = 0;
	$qty=0;
	if(isset($_SESSION['cart']))
	{//if the cart isn't empty
		if(!empty($_SESSION['cart']))
		{//Render the cart and count the prices
			foreach($_SESSION['cart'] as $keys => $values)
			{
				print "<tr>";
					print "<td>".$values['item_title']."</td>";
					print "<td style='text-align:center'>".$values['item_quantity']."</td>";
					$qty += $values['item_quantity'];
					$finalprice = ($values['item_quantity']*$values['item_price']);
					$total += $finalprice;
					print "<td style='text-align:center'>".$finalprice."</td>";
					print "<td > <img alt='' width='50' src='internal/bookimg/".$_SESSION["img"][$values["item_id"]]."'></td>";
					//Setting the action for deleting a single item
					print "<td style='text-align:center'><a href='index.php?p=shopingcart&action=delete&id=".$values['item_id']."'><span class='text-danger'>Remove</span></a></td>";
					print "<td><button class='btn btn-light'><img src='internal/decrement.png' style='height:20px; width:20px;'></button></td>";
					print "<td><button class='btn btn-light'><img src='internal/increment.png' style='height:20px; width:20px;'></button></td>";
				print "</tr>";
				$_SESSION['index'] += 1;
			}
		}
	}

	?>
	<tr>
	<th>Total</th>
	<th style='text-align:center'><?php print $qty; ?></th>
	<th style='text-align:center'><?php print $total; ?></th>
																																<!--Setting the action to empty the cart-->
	<th style='text-align:center'><a href="index.php?p=shopingcart&action=deleteall">delete</a></th>
</table>
<a href="index.php?p=placeorder">Purchase</a>
</div>
</body>
</html>
