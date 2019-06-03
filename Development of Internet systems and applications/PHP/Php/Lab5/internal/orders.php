<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<?php
	$sql = mysqli_query($conn, "SELECT * FROM orders");
	print "<table>";
	print "<tr>";
	print "<th>Order ID</th>";
	print "<th>Customer</th>";
	print "<th>Date</th>";
	print "</tr>";
	while ( $row = mysqli_fetch_array($sql))
	{
		$sql2 = mysqli_query($conn, "SELECT * FROM customer WHERE ID=".$row['Customer']);
		$row2 = mysqli_fetch_array($sql2);
		if (!$sql2)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
		print "<tr>";
		print "<td><a href='index.php?p=orderlist&amp;oid=".$row["ID"]."'>".$row["ID"]."</a></td>";
		print "<td><a>".$row2["Lname"]."</a></td>";
		print "<td <a>".$row["oDate"]."</a></td>";
		print "</tr>";
	}
	print "</table>";
?>
</div>