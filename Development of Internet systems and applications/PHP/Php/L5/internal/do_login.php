Proccessing login.....


<?php
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];
	
	if($u == 'admin' && $p=='123') {
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
	}elseif($u=='antonis' && $p=='456') {
		print "Welcome antnis";
			$_SESSION['username'] = 'antonis';
	} else {
		print "Unknown user";
		$_SESSION['username'] = '?';
	}


?>