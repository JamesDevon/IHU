<?php
	//database connection 
		
	$servername = "localhost";
	$username = "root";
	$password = "";

	// Create connection

	$conn = new mysqli($servername, $username, $password);
	// Check connection
	if ($conn->connect_error){
		die("Connection failed: " . $conn->connect_error);
	}else{
		$dbname = 'bookstoredb';
		mysqli_select_db($conn,$dbname);
		$result = mysqli_query($conn, "SELECT NAME FROM category");
		if (!$result) 
		{
			echo("<P> Wrong query : " .  mysqli_error() . "</P>");
			exit();
		}
		$result1 = mysqli_query($conn, "SELECT ID FROM category");
		print "<ul class='nav flex-column nav-pills'>";
		print "<h2><a class='nav-link active' href='#' style='color:navy; font-size:28px; top:3px;'>Products Menu</a></h2>";
		while ($row = mysqli_fetch_array($result))
		{
			$coll = mysqli_fetch_array($result1);
			print "<li><a class='nav-link' href='index.php?p=bookstoredb&amp;catid=".$coll["ID"]."' id='a2'>".$row["NAME"]."</a></li>";
		}
		print "</ul>";
	}
?>