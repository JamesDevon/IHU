<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<?php
$catid = $_REQUEST['catid'];
//Getting the results from the db
$result2title = mysqli_query($conn, "SELECT Title FROM product where Category = ".$catid);
$result2price = mysqli_query($conn, "SELECT Price FROM product where Category = ".$catid);
$result2pid = mysqli_query($conn, "SELECT ID FROM product where Category = ".$catid);
print "<table>";
print "<tr>";
print "<th id='th1'>Title</th>";
print "<th id='th2'>Price</th>";
print "</tr>";
while ( $row2title = mysqli_fetch_array($result2title))
{
	$row2pid = mysqli_fetch_array($result2pid);
	$row2price = mysqli_fetch_array($result2price);
	//Filling the table with the items dynamicly
	print "<tr>";
	print "<td id='th1'><a href='index.php?p=purchase&amp;pid=".$row2pid["ID"]."'>".$row2title["Title"]."</a></td>";
	print "<td id='th2'><a>".$row2price["Price"]."$</a></td>";
	print "</tr>";
}
print "</table>";
?>
</div>
</body>
</html>
