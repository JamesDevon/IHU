<html>
<head><meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css"></head>
<body>
<div id="content">
<?php
	$pid = $_REQUEST['pid'];
	//getting the details from the db
	$result2price = mysqli_query($conn, "SELECT Price FROM product where ID = ".$pid);
	$quary  = mysqli_query($conn, "SELECT * FROM product where ID = ".$pid);
	$row = mysqli_fetch_array($quary);
	print "<b>".$row["Title"]."</b>";
	print "<br>";
	print "<p>".$row["Description"]."</p>";
	print "<br>";
	print "<form action='index.php' method='POST'>";
	print "<input type='hidden' name='title' value='".$row['Title']."'>";
	print "<input type='hidden' name='id' value='".$row['ID']."'>";
	print "<input type='hidden' name='price' value='".$row['Price']."'>";
	print "<input type='number' name='quantity' min='1'>";
	//Posting 'Add to cart' to initialize the function
	print "<input type='submit' name='addtocart' value='Add to cart'>";
?>
</form>
</div>
</body>
</html>
