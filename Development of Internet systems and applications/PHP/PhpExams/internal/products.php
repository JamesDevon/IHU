<html>
<body>
<h2>Products</h2>
<?php
print "<ol>";
$result = mysqli_query($conn, "select * from product");
while ( $row = mysqli_fetch_array($result))
{
	//listing all the items
	print "<li><a href ='?p=productedit&amp;pid=".$row["ID"]."'>".$row["Title"]."(".$row["ID"].")</a></li>";
}
print "</ol>";
?>
</body>
</html>
