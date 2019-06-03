<?php
if(isset($_REQUEST['username']))
{
	if($_SERVER["REQUEST_METHOD"] == "POST")
	{
		$myusername = $_REQUEST['username'];
		$mypassword = $_REQUEST['pass'];
		if(($myusername=='admin')and($mypassword='123'))
		{
			$_SESSION['username'] = 'admin';
			echo"<script> alert('Welcome Mr.".$myusername."');</script>";
			echo"<script> window.location.replace('index.php?p=start');</script>";
		}
		else
		{
			//vulnerable in sql injection
			$sql = "SELECT id FROM customer WHERE uname = '".$myusername."' and passwd= '".$mypassword."'";
			$result = mysqli_query($conn,$sql);
			if (!$result)
			{
				printf("Error: %s\n", mysqli_error($conn));
				exit();
			}
			$row = mysqli_fetch_array($result);
			$count = mysqli_num_rows($result);

			if($count == 1)
			{
				echo"<script> alert('Welcome Mr.".$myusername."');</script>";
				$_SESSION['username'] = $myusername;

				echo"<script> window.location.replace('index.php?p=start');</script>";
			}
			else
			{
				echo"<script> alert('Wrong Username or Password. Please try again.'); </script>";
			}
		}
	}
}
?>
