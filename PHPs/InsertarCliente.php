<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
date_default_timezone_set('America/Mexico_City');

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
	$password = password_hash($_POST['password'], PASSWORD_BCRYPT);
		
	$sql = "SELECT * FROM cliente WHERE correo='".$correo."'";
	$check = mysqli_fetch_array(mysqli_query($conexion,$sql));
	if(isset($check)){
		$response['success']="1";
		$response['message']="Correo ya registrado";
        $query -> close();
	}else{
		if($query = $conexion->prepare("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?)")){
			$query->bind_Param('ssssssssss', $correo, $nombre, $apellidos, $telefono, $fecnac, $seguro, $emergencia, $rfid, $password, date("Y-m-d"));
			$result = $query->execute();
		}else{
             $response['success']="2";
			 $response['message']="Error en el registro";
        }
        
        if ($result) {
            $response['success']="0";
			$response['message']="Registrado correctamente";
        } else {
            $response['success']="3";
			$response['message']="Error";
        }
	}
	mysqli_close($conexion);
}else{
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>