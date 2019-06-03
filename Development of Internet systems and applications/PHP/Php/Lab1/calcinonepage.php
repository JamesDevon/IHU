<?php

	function ph(){		
		$Num1 = $_POST["num1"];
		$Num2 = $_POST["num2"];
		$Num3 = $Num1 + $Num2;
		echo $Num3;
		
		}
?>

<html>
<body>
<form method="POST">
<input type="text" name="num1" id="num1" > <p>+</p> <input type="text" name="num2" id="num2"> <input type="submit" value="ADD()" onclick="myfunction()">
</form>
<script>
		function myfunction(){
				var x = document.getElementById("num1");
				x.type="hidden";
				var y = document.getElementById("num2");
				y.type="hidden";
				var z = <?php echo ph(); ?>;
				alert(z);
				}
	</script>ˋ
</body>
</html>
