<html>
<script type="text/javascript">
function insertProduct(){
	var x = window.location.href
	location.href =  'index.php?p=productedit&pid=0';
	}
</script>
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
<input type="button" onclick="insertProduct()" value="Insert Product">
</body>
</html>
