<html xmlns="http://www.w3.org/1999/xhtml">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  <link rel="stylesheet" href="layout.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<script src='http://code.jquery.com/jquery-1.9.1.js'></script>
<form method='post'>
  <table>
    <?php
    $row = mysqli_fetch_array($result);
    if($_GET['pid']==0){
      $resultcategory = mysqli_query($conn, "select * from category ");
      print "<tr><td>Title : <input type='text' name='title' value=''></tr></td>";
      print "<tr><td>Description : <br><textarea name='descript'></textarea></tr></td>";
      print "<tr><td>Price : <input type='text' name='price' value=''></tr></td>";
      print "<tr><td>Category : ".$row["Category"]." --><select name='category'>";
      while($rowcategory = mysqli_fetch_array($resultcategory)){
        print "<option value='".$rowcategory["ID"]."'>".$rowcategory["ID"]."- ".$rowcategory["Name"]."</option>";
      }
      print " </select></tr></td>";
      print "<input type='hidden' name='act' value='INSERT'>";
    }else{
        $pid=$_GET['pid'];
        $result = mysqli_query($conn, "select * from product where ID = '".$pid."'");
        $resultcategory = mysqli_query($conn, "select * from category ");
        $row = mysqli_fetch_array($result);
        print "<tr><td>ID : ".$pid."</td></tr>";
        print "<tr><td>Title : <input type='text' name='title' value='".$row["Title"]."'></tr></td>";
        print "<tr><td>Description : <br><textarea name='descript'>".$row["Description"]."</textarea></tr></td>";
        print "<tr><td>Price : <input type='text' name='price' value='".$row["Price"]."'></tr></td>";
        print "<tr><td>Category : ".$row["Category"]." --><select name='category'>";
        while($rowcategory = mysqli_fetch_array($resultcategory)){
          print "<option value='".$rowcategory["ID"]."'>".$rowcategory["ID"]."- ".$rowcategory["Name"]."</option>";
        }
        print " </select></tr></td>";
        print "<input type='hidden' name='pid' value='".$pid."'>";
        print "<input type='hidden' name='act' value='UPDATE'>";
      }
    ?>
  </table>
  <input type="submit" value="Send" >
</form>
<p id='msg'></p>

<?php
if(isset($_POST["act"]))
{
  if($_POST["act"]== "UPDATE"){
    $sql = "UPDATE product SET Title='".$_POST["title"]."' WHERE id='".$_POST['pid']."'";
    $conn->query($sql);
    if (!$sql)
      {
        printf("Error: %s\n", mysqli_error($conn));
        exit();
      }
    $sql = "UPDATE product SET Description='".$_REQUEST["descript"]."' WHERE id='".$_POST['pid']."'";
    $conn->query($sql);
    if (!$sql)
      {
        printf("Error: %s\n", mysqli_error($conn));
        exit();
      }
    $sql = "UPDATE product SET Price='".$_POST["price"]."' WHERE id='".$_POST['pid']."'";
    $conn->query($sql);
    if (!$sql)
      {
        printf("Error: %s\n", mysqli_error($conn));
        exit();
      }
    $sql = "UPDATE product SET Category='".$_POST["category"]."' WHERE id='".$_POST['pid']."'";
    $conn->query($sql);
    if (!$sql)
      {
        printf("Error: %s\n", mysqli_error($conn));
        exit();
      }
      echo "<script>alert('Edit Successfull'); 	location.href =  'index.php?p=products';</script>";
      unset($_POST['act']);
  }else if($_POST["act"] == "INSERT"){
    $sql = "INSERT INTO product (Title, Description, Price, Category)
    VALUES ('".$_POST["title"]."', '".$_POST["descript"]."', '".$_POST["price"]."' , '".$_POST["category"]."' )";
    $conn->query($sql);
    if (!$sql){
      printf("Error: %s\n", mysqli_error($conn));
      exit();
    }else{
      unset($_POST['act']);
      echo "<script>alert('Register Successfull'); 	location.href = 'index.php?p=products';</script>";
    }
  }
}
?>
<body>
</body>
</html>
