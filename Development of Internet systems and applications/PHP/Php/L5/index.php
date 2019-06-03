<!DOCTYPE html>
<html lang="en">
<head>
<?php
session_start();
if( ! isset($_SESSION['username'])) {
	$_SESSION['username']='?';
}
require_once "internal/dbconnect.php";

?>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://getbootstrap.com/favicon.ico">

    <title>BookStore</title>

    <!-- Bootstrap core CSS -->
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./bootstrap/css/dashboard.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src=".//bootstrap/js//jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.php">BookStore</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="?p=start">Αρχική</a></li>
            <li><a href="?p=about">Σχετικά</a></li>
            <li><a href="?p=products">Προϊόντα</a></li>
            <li><a href="?p=show_cart">Το καλάθι μου</a></li>
            <li><a href="?p=login">Είσοδος</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
	  <?php if (	$_SESSION['username']!='?') : ?>
          <ul class="nav nav-sidebar">
            <li><a href="?p=orders">Παραγγελίες</a></li>
            <li><a href="?p=custdata">Στοιχεία Πελάτη</a></li>
            <li><a href="?p=logout">Έξοδος</a></li>
          </ul>
	  <?php endif; ?>
	       <ul>
	       <li><a href="?p=products">Προϊόντα</a></li>
</li>
	       
	       </ul>
          <ul class="nav nav-sidebar">
	    <?php
		require "internal/menuleft.php";
	    ?>
            </ul>
          </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	  <?php
	  if(!isset($_REQUEST['p'])) {
		$_REQUEST['p']='start';
	}
	  $p=$_REQUEST['p'];
          print "<h1 class=\"page-header\">$_REQUEST[p]</h1>";
	switch ($p){
	case 'logout':		$_SESSION=array(); 
	case "start" :		require "internal/start.php";
				break;
	case "about":	 	require "internal/shopinfo.php";
				break;
	case "login" :		require "internal/login.php";
				break;
	case 'do_login':	require "internal/do_login.php";
				break;
	case 'catinfo':		require "internal/catinfo.inc";
				break;
	case 'prod_info':	require "internal/prod_info.php";
				break;
	case 'add_cart':	require "internal/add_cart.php";
	case 'show_cart':	require "internal/show_cart.php";
				break;
	case 'products':	require "internal/products.php";
				break;

case 'do_pedit':	require "internal/do_pedit.php";			
case 'pedit':	require "internal/pedit.php";
				break;

	default: 
				print "Η σελίδα δεν υπάρχει";
}
?>          
        </div>
      </div>
    </div>
</body>
</html>
