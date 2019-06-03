<?php
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];

	if($u == 'admin' && $p=='123') {
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
	}elseif($u=='James' && $p=='456') {
		print "Welcome James";
			$_SESSION['username'] = 'james';
	} else {
		print "Unknown user";
		$_SESSION['username'] = '?';
	}
?>