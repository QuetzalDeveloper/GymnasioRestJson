<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$nombre = $_POST['nombre'];
	$periodo = $_POST['periodo'];
	$precio = $_POST['precio'];
	$descripcion = $_POST['descripcion'];
	$acceso = $_POST['accesos'];
	$response = array();

	if($query = $conexion->prepare("INSERT INTO planes(nombre,periodo,precio,descripcion,estado,accesos) VALUES(?,?,?,?,0,?)")){
		$query->bind_Param('sssss', $nombre,$periodo,$precio,$descripcion,$acceso);
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
	
	mysqli_close($con);
}else{
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>