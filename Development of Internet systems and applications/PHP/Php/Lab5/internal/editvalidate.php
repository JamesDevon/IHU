<?php
  $servername = "localhost";
  $username = "root";
  $password = "";
  $conn = new mysqli($servername, $username, $password);
  $sql = "UPDATE product SET Title='".$_POST["title"]."' WHERE id='".$_POST['pid']."'";
  $conn->query($sql);
  if (!$sql)
    {
      printf("Error: %s\n", mysqli_error($conn));
      exit();
    }
  $sql = "UPDATE product SET Description='".$_POST["description"]."' WHERE id='".$_POST['pid']."'";
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
 ?>
