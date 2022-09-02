<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$response = array();
	$id = $_POST['id'];
	$nombre = $_POST['nombre'];
	$periodo = $_POST['periodo'];
	$precio = $_POST['precio'];
	$descripcion = $_POST['descripcion'];
	$estado = $_POST['estado'];
	$accesos = $_POST['accesos'];

	if($query = $conexion->prepare("UPDATE planes SET nombre=?, periodo=?, precio=?, descripcion=?, estado=?, accesos=? WHERE 	id=?")){
		$query->bind_Param('sssssss',$nombre,$periodo,$precio,$descripcion,$estado,$accesos,$id);
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
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>