<html>
<meta charset="utf-8"/>
<form action="calconepage.php" method="get">
	<input type='text' name='num1'> <label>+</label> <input type='text' name='num2'> <input type="submit" value="ADD()">
</form>
<body>

calc1	<?php
			 
			 $a = isset($_GET['num1']);
			 $b = isset($_GET['num2']);
			 $c = $a + $b;
			 echo $c;
		?>
		<br>

</body> 
</html> 