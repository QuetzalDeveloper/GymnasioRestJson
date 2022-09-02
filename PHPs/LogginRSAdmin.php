<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
$response=array();

if($_SERVER['REQUEST_METHOD']=='POST'){
	$correo = $_POST['correo'];
	$pass = $_POST['pass'];
	$filas = 0;
	$sql = "SELECT correo, password FROM administrador WHERE correo='".$correo."'";
	$result=mysqli_query($conexion,$sql);
	if($result){
		$filas = $result -> num_rows;
		if($filas > 0){
			$res = mysqli_fetch_array($result);
			if(password_verify($pass, $res['password'])){
				array_push($response, array('mensaje' => "ok"));	//Correcto
			}else{
				array_push($response, array('mensaje' => "con"));	//Error contrasena
			}
		}else{
			array_push($response, array('mensaje' => "cor"));	//Error correo
		}
	}
	}else{
		array_push($response, array('mensaje' => "xio"));	//Error de conexion
	}

mysqli_close($conexion);	
echo json_encode($response);

?>