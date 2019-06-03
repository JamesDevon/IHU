<html>
<body>

	<?php 
		$a = rand(0,2);
		$pics = array( 'einstein.jpg' ,'allan.jpg' , 'Tesla.jpg');
		echo "<img src='".$pics[$a]."'style='width:496px;height:744px;'/>";
	?>
</body>
</hmtl>