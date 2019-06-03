<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="layout.css">
</head>
<body>
<div id="content">
<?php
	$sql = mysqli_query($conn, "SELECT * FROM customer");
	print "<table>";
	print "<tr>";
	print "<th>ID</th>";
	print "<th>Fname</th>";
	print "<th>Lname</th>";
	print "<th>Address</th>";
	print "<th>Phone</th>";
	print "</tr>";
	while ($row = mysqli_fetch_array($sql))
	{
		if (!$sql)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
		print "<tr>";
		print "<td> <a>".$row["ID"]."</a></td>";
		print "<td> <a>".$row["Fname"]."</a></td>";
		print "<td> <a>".$row["Lname"]."</a></td>";
		print "<td> <a>".$row["Address"]."</a></td>";
		print "<td> <a>".$row["Phone"]."</a></td>";
		print "</tr>";
	}
	print "</table>";
?>
</div>