
<?php

$sql = "update product set Title=?, Price=?, Description=?,Category=? where ID=?";

if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("sdsii", $_REQUEST['title'],$_REQUEST['price'],
			$_REQUEST['description'],  $_REQUEST['category'], $_REQUEST['pid']);
	$r = $stmt->execute();
	if(! $r) {
		print "Λάθος στην ενημέρωση";
	} else {
		print "OK, Ενημερώθηκε";
	}
}

?>
