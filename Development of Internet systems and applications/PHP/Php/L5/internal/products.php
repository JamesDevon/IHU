<h1>Προιόντα</h1>
<ol>
<?php

$sql = 'select * from product order by Title';

if (! ($res = $mysqli->query($sql))) {
 	echo "(" .  $mysqli->errno . ") " . $mysqli->error; 
} else {
	while ($row = $res->fetch_assoc()) {
		print "<li><a href='index.php?p=pedit&pid=$row[ID]'>".
				"$row[Title] ($row[ID])</a></li>";
	}
}

?>
</ol>