<?php
	date_default_timezone_set("Europe/Athens");
	if(isset($_SESSION['username']))
	{
		$rannum = rand(1,99);
		$sql2 = mysqli_query($conn, "SELECT * FROM customer where uname='".$_SESSION['username']."'");
		$row2 = mysqli_fetch_array($sql2);
		if (!$sql2)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
		$sql = "INSERT INTO orders (ID, Customer, oDate)
			VALUES (".$rannum.",".$row2["ID"].",'".date("Y-m-d")."')";
		$conn->query($sql);
		if (!$sql)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
		$rannum2 = rand(1,99);
		foreach($_SESSION['cart'] as $keys => $values)
		{
			$sql3 = mysqli_query($conn, "SELECT * FROM product where Title='".$values['item_title']."'");
			$row3 = mysqli_fetch_array($sql3);
			if (!$sql3)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
			$sql = "INSERT INTO orderdetails (ID, Orders, Quantity, Product)
				VALUES (".$rannum2.",".$rannum.",".$values['item_quantity'].",".$row3['ID'].")";
			$rannum2 +=1;
			$conn->query($sql);
		}
	}
?>
