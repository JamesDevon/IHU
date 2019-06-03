<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript">
function Test(){
	var index = $('select[name=category]').val();
	$.post('internal/storesite.php' , {catid:index}, function(data){$('.ajax').html(data)});
}
</script>
<body>
	<div id="sel">
<select onchange="Test()" name="category" id="category" class="ml-3 mt-1">
<?php
$servername = "localhost";
$username = "root";
$password = "";
$conn = new mysqli($servername, $username, $password);
$dbname = 'bookstoredb';
mysqli_select_db($conn,$dbname);
$sql = "Select * from Category";
$categories = mysqli_query($conn, $sql);
while ($rowCategories = mysqli_fetch_array($categories)){
print "<option value='".$rowCategories["ID"]."'>".$rowCategories["Name"]."</option>";
}
?>
</select>
</div>
</br>

<div class="ajax" id="content">
<?php
$catid = $_REQUEST['catid'];
//Getting the results from the db
$result2title = mysqli_query($conn, "SELECT Title FROM product where Category = ".$catid);
if (!$result2title) {
    printf("Error: %s\n", mysqli_error($conn));
    exit();
}
$result2price = mysqli_query($conn, "SELECT Price FROM product where Category = ".$catid);
$result2pid = mysqli_query($conn, "SELECT ID FROM product where Category = ".$catid);
print "<table>";
print "<tr>";
print "<th >Title</th>";
print "<th >Price</th>";
print "<th> Image </th>";
print "</tr>";
while ( $row2title = mysqli_fetch_array($result2title))
{
	$row2pid = mysqli_fetch_array($result2pid);
	$row2price = mysqli_fetch_array($result2price);
	//Filling the table with the items dynamicly
	print "<tr>";
	print "<td ><a href='index.php?p=purchase&amp;pid=".$row2pid["ID"]."'>".$row2title["Title"]."</a></td>";
	print "<td ><a>".$row2price["Price"]."$</a></td>";
	print "<td><img alt='' width='50' src='internal/bookimg/".$_SESSION['img'][$row2pid["ID"]]."'></td>";
	print "</tr>";
}
print "</table>";
?>
</div>
</body>
</html>
