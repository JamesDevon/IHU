<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<?php
if(isset($_REQUEST['oid']))
{
	$oid = $_REQUEST['oid'];
	$sql = mysqli_query($conn, "SELECT * FROM orderdetails WHERE Orders =".$oid);
	print "<table>";
	print "<tr>";
	print "<th>ID</th>";
	print "<th>Orders</th>";
	print "<th>Quantity</th>";
	print "<th>Product ID</th>";
	print "</tr>";
	while ( $row = mysqli_fetch_array($sql))
	{
		print "<tr>";
		print "<td><a>".$row['ID']."</a></td>";
		print "<td><a>".$row['Orders']."</a></td>";
		print "<td><a>".$row['Quantity']."</a></td>";
		print "<td><a>".$row['Product']."</a></td>";
		print "</tr>";
	}
	print "</table>";
}
?>
</div>