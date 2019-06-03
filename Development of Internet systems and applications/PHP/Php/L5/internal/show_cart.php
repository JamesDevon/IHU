<script>
var xmlhttp;
function add_to_cart(amount, pid) {
	if (window.XMLHttpRequest) {
               xmlhttp = new XMLHttpRequest();
	} else {
	// for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = showresponse;
	xmlhttp.open("GET","./a_a_to_cart.php?pid="+pid+"&amount="+amount,true);
	xmlhttp.send();
}
function showresponse() {
	if (xmlhttp.readyState==4 && xmlhttp.status==200) {
                  var reply = xmlhttp.responseText;
		  var a = reply.split(',');
		  var pid=a[1];
		  var amount=a[0];
		  var price = a[2];
		document.getElementById("prod_"+pid).innerHTML = amount;
		document.getElementById("price_"+pid).innerHTML = price;
	}

}
</script>
<table class='table table-striped'>
<tr>
<th>Τίτλος</th>
<th>Τιμή</th>
<th>Τεμάχια</th>
<th>Συνολική Τιμή</th>
</tr>
<?php
/// Εδώ είναι σημαντική η χρήση prepared statements
$sql = "select * from product where id=?";
if(! isset($_SESSION['cart']) || ! is_array($_SESSION['cart'])) {
	print "Το καλάθι είναι άδειο";
} elseif( $stmt = $mysqli->prepare($sql) ) {
	$sum=0;
	foreach($_SESSION['cart'] as $k=>$v) {
		$stmt->bind_param("i", $k);
		$stmt->execute();
		$result = $stmt->get_result();
		$row = $result->fetch_assoc();
		$result->free_result();
		print "<tr><td>$row[Title]</td>";
		print "<td>$row[Price]</td>";
		print "<td id='prod_$k'>$v</td>";
		$price=$row['Price']* $v;
		$sum += $price;
		print "<td id='price_$k'>$price</td>";
		print "<td><button onclick='add_to_cart(-1,$k)'>-</button><button  onclick='add_to_cart(1,$k)'>+</button></td>";
		print "</tr>";
	}
	print "<tr><th colspan='3'>Συνολο</th><th>$sum</th></tr>";

}
?>
</table>


<pre>
<?php
print_r($_SESSION);
?>
</pre>
