<table>
<tr>
<th>Name</th>
<th>Price</th>
</tr>
<?php
$cat = $_REQUEST['catid'];
$sql = "select * from product where Category=?";
print "<pre>DEBUG:: cat = $cat</pre>";
print "<pre>DEBUG:: sql = $sql</pre>";

if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("i", $cat);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		print "<tr><td><a href='?p=prod_info&id=$row[ID]'>$row[Title]</a></td>".
			"<td>$row[Price]</td></tr>";
	}

}
?>

</table>

