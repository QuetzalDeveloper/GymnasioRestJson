<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
$response = array();

if($_SERVER['REQUEST_METHOD']=='POST'){
	$correo = $_POST['correo'];
	$nombre = $_POST['nombre'];
	$apellidos = $_POST['apellidos'];
	$telefono = $_POST['telefono'];
	$fecnac = $_POST['fecnac'];
	$seguro = $_POST['seguro'];
	$emergencia = $_POST['emergencia'];
	$rfid = $_POST['rfid'];
	$pass = $_POST['password'];
	
	if(empty($pass)){
		if($query = $conexion->prepare("UPDATE cliente SET nombre=?, apellidos=?, telefono=?, fecnac=?, seguro=?, emergencia=?, rfid=? WHERE correo=?")){
			$query->bind_Param('ssssssss', $nombre,$apellidos,$telefono,$fecnac,$seguro,$emergencia,$rfid,$correo);
			$result = $query->execute();
		}else{
        	$response['success']="1";
			$response['message']="Error de actualización";
    	}
		if ($result) {
			$response['success']="0";
			$response['message']="Actualizado correctamente";
    	} else {
        	$response['success']="3";
			$response['message']="Error";
    	}
		mysqli_close($con);
	}else{
		$password = password_hash($pass, PASSWORD_BCRYPT);
		if($query = $conexion->prepare("UPDATE cliente SET nombre=?, apellidos=?, telefono=?, fecnac=?, seguro=?, emergencia=?, rfid=?, password=? WHERE correo=?")){
			$query->bind_Param('ssssssss', $nombre,$apellidos,$telefono,$fecnac,$seguro,$emergencia,$rfid,$password,$correo);
			$result = $query->execute();
		}else{
        	$response['success']="1";
			$response['message']="Error de actualización";
    	}
		if ($result) {
			$response['success']="0";
			$response['message']="Actualizado correctamente";
    	} else {
        	$response['success']="3";
			$response['message']="Error";
    	}
		mysqli_close($con);
	}    
}else{
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>