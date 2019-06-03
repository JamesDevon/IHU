<form action="index.php" method="post">
<input type="hidden" name="p" value="do_pedit"/>
<table>
<?php
$pid = $_REQUEST['pid'];
$sql = "select * from product where ID=?";

if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("i", $pid);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		print "<tr><td>ID:</td><td>$row[ID]</td></tr>";
		print "<tr><td>Title:</td><td><input name='title' value='$row[Title]'/></td></tr>";
		print "<tr><td>Price:</td><td><input name='price' value='$row[Price]'/></td></tr>";
		print "<tr><td>Description:</td><td><textarea name='description'>$row[Description]</textarea></td></tr>";
		$list = get_cats($row['Category']);
		print "<tr><td>Category:</td><td>$row[Category]<select name='category'>$list</select></td></tr>";
	   print "<input type='hidden' name='pid' value='$row[ID]'/>";
	
	}

}


function get_cats($selected_cat) {
global $mysqli;
	$txt='';
	$sql = "select * from category";
	$stmt = $mysqli->prepare($sql);
	$stmt->execute();
	$result = $stmt->get_result();
   while ($row = $result->fetch_assoc()) {
      $s='';
      if($row['ID'] == $selected_cat) {
      	$s = ' selected';
      } 
		$txt .= "<option value='$row[ID]' $s>$row[Name]</option>";
	}
	return $txt;
}
?>

</table>
<input type="submit" value="ΑΠΟΣΤΟΛΗ"/>
</form>

