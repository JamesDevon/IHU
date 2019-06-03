<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<table border=1>
<tr>
	<th width=60%> Title </th>
	<th width=20% style="text-align:center"> Quanity </th>
	<th width=15% style="text-align:center"> Final Price </th>
	<th width=5% style="text-align:center"> X </th>
</tr>
	<?php
	$total = 0;
	$qty=0;
	if(isset($_SESSION['cart']))
	{
		
		if(!empty($_SESSION['cart']))
		{
			
			
			foreach($_SESSION['cart'] as $keys => $values)
			{
				print "<tr>";
					print "<td>".$values['item_title']."</td>";
					print "<td style='text-align:center'>".$values['item_quantity']."</td>";
					$qty += $values['item_quantity'];
					$finalprice = ($values['item_quantity']*$values['item_price']);
					$total += $finalprice;
					print "<td style='text-align:center'>".$finalprice."</td>";
					print "<td style='text-align:center'><a href='index.php?p=shopingcart&action=delete&id=".$values['item_id']."'><span class='text-danger'>Remove</span></a></td>";
				print "</tr>";
			}
		}
	}
	?>
	<tr>
	<th>Total</th>
	<th style='text-align:center'><?php print $qty; ?></th>
	<th style='text-align:center'><?php print $total; ?></th>
	<th style='text-align:center'><a href="index.php?p=shopingcart&action=deleteall">delete</a></th>
</table>
</div>
</body>
</html>