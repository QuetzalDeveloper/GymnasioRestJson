<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$response = array();
	$correo = $_POST['correo'];
	$nombre = $_POST['nombre'];
	$apellidos = $_POST['apellidos'];
	$telefono = $_POST['telefono'];
	$teleme = $_POST['telemer'];
	$rfid = $_POST['rfid'];
	$pass = $_POST['password'];
	if(empty($pass)){
		if($query = $conexion->prepare("UPDATE administrador SET correo=?, nombre=?, apellidos=?, telefono=?, tel_emergencia=?, RFID=? WHERE 	correo=?")){
			$query->bind_Param('sssssss', $correo,$nombre,$apellidos,$telefono,$teleme,$rfid,$correo);
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
		if($query = $conexion->prepare("UPDATE administrador SET correo=?, nombre=?, apellidos=?, telefono=?, tel_emergencia=?, RFID=?, password=? WHERE 	correo=?")){
			$query->bind_Param('ssssssss', $correo,$nombre,$apellidos,$telefono,$teleme,$rfid,$password,$correo);
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