<?php
	//database connection
	$servername = "localhost";
	$username = "root";
	$password = "";
	$conn = new mysqli($servername, $username, $password);
	//database connection

	// Check connectionX
	if ($conn->connect_error){
		die("Connection failed: " . $conn->connect_error);
	}else{
		$dbname = 'bookstoredb';
		mysqli_select_db($conn,$dbname);
		// QUERY
		$result = mysqli_query($conn, "SELECT * FROM category");
		if (!$result)
		{
			echo "<P> Wrong query : " .  mysqli_error($conn) . "</P>";
			exit();
		}
		print "<ul class='nav flex-column nav-pills'>";
		print "<h2><a class='nav-link active' href='#' style='color:navy; font-size:28px; top:3px;'>Products Menu</a></h2>";
		// PRINT DATA
		while ($row = mysqli_fetch_array($result))
		{
			print "<li><a class='nav-link' href='index.php?p=bookstoredb&amp;catid=".$row["ID"]."' id='a2'>".$row["Name"]."</a></li>";
		}
		print "</ul>";
	}
?>
