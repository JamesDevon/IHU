<?php
if(! isset($_SESSION['cart']) || ! is_array($_SESSION['cart'])) {
	$_SESSION['cart']=array();
}

$p = intval($_REQUEST['prod_id']);
$a = intval($_REQUEST['posotita']);

//$_SESSION['cart'][$p]+=$a;
$cart = &$_SESSION['cart'];
$cart[$p]+=$a;

print "Προστέθηκαν $a τεμάχια στο καλάθι σας";

?>
