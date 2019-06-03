<html>
	<body>
		
			<?php
			//text variables
				$FullName = $_GET['name'];
				$Address = $_GET['address'];
				$Phone = $_GET['phone'];
				$Gender = $_GET['gender'];
				$Age = $_GET['age'];
				$Email = $_GET['email'];

			//echo commants
				echo "<label>Fullname :".$FullName."</label>";
				echo "</br>";
				echo "<label>Address :".$Address."</label>";
				echo "</br>";
				echo "<label>Phone : ".$Phone."</label>";
				echo "</br>";
				echo "<label>Email : ".$Email."</label>";
				echo "</br>";
				echo "<label>Gender : ".$Gender."</label>";
				echo "</br>";
				echo "<label>Age : ".$Age."</label>";
			?>
		
	</body>
</html>