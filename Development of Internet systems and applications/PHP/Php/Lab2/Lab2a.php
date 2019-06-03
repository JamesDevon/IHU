<html>
<body>

	<table border="1" >

	<?php
		
		$j;
		$i;
		for($i=0; $i<=10; $i++)
		{
			echo "<tr>";
			for ($j=0; $j<=10; $j++)
			{
				$a = rand(1,10);
				if($a>=5)
				{
					echo "<td style='background-color:green'>";
					echo $a;
					echo "</td>";
				}else{
					echo "<td style='background-color:red'>";
					echo $a;
					echo "</td>";
				}
			}
			echo "</tr>";
		}

	?>

	</table>

</body>
</html>