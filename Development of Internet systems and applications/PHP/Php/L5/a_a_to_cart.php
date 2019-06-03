<?php
session_start();
$pid= $_REQUEST['pid'];
$a= $_REQUEST['amount'];

$_SESSION['cart'][$pid] += $a;

if($_SESSION['cart'][$pid]<0) {
	$_SESSION['cart'][$pid]=0;
}
require_once "internal/dbconnect.php";
$sql = "select * from product where id=?";
$stmt = $mysqli->prepare($sql);
$stmt->bind_param("i", $pid);
$stmt->execute();
$result = $stmt->get_result();
$row = $result->fetch_assoc();
$result->free_result();

$price = $_SESSION['cart'][$pid] * $row['Price'];
print $_SESSION['cart'][$pid] . ",$pid,$price";

?>
