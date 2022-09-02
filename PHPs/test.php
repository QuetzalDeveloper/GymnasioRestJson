<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
$response=array();

	$correo = "quetzal.developer@gmail.com";
	$pass = "123";
$filas = 0;
	$sql = "SELECT correo, password FROM administrador WHERE correo='".$correo."'";
	$result=mysqli_query($conexion,$sql);

	if($result){
		$filas = $result->num_rows;
		if($filas >0){
		$res = mysqli_fetch_array($result);
		if(password_verify($pass, $res['password'])){
			array_push($response, array('mensaje' => "ok"));
			//$response['mensaje'] = "ok"; //Correcto
		}
		else{
			array_push($response, array('mensaje' => "con"));
			//$response['mensaje'] = "con"; //Contraseña incorrecta
		}
	}else{
		array_push($response, array('mensaje' => "cor"));
		//$response['mensaje'] = "cor";	//Correo incorrecto
	}}
	
	
	mysqli_close($conexion);		

//$response['mensaje'] = "pos";	//Error post
echo json_encode($response);

?>