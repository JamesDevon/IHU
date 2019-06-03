<form action='' method='get'>
<input type='hidden' name='p' value='add_cart'/>
<table>
<tr>
<th>Titlos</th>
<th width='35%'>Περιγραφή</th>
<th>Τιμή</th>
<th>Ποσότητα</th>
<th>Προσθήκη</th>
</tr>
<?php
$id = $_REQUEST['id'];
$sql = "select * from product where id=?";
print "<pre>DEBUG:: cat = $cat</pre>";
print "<pre>DEBUG:: sql = $sql</pre>";

if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("i", $id);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {

		print "<tr><td>$row[Title]</td>";
		print "<td>$row[Description]</td>";
		print "<td>$row[Price]</td>";
		print "<td><input type='number' name='posotita' value='1'/></td>";
		print "<input type='hidden' name='prod_id' value='{$row['ID']}'/>";
		print "<td><input type='submit' name='submit' value='Προσθήκη'></td>";
		print "</tr>";
	}

}
?>
</table>
</form>
