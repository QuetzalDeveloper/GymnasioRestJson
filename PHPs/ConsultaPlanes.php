<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$modo = $_POST["modo"];	
	if($modo == 0){
		$sql="SELECT * FROM planes";
	}else if($modo == 1){
		$sql="SELECT * FROM planes WHERE estado = 0";
	}else if($modo == 2){
		$sql="SELECT * FROM planes WHERE estado = 1";
	}else{
		$sql="SELECT * FROM planes";
	}

	$result=mysqli_query($conexion,$sql);
	$response=array();

	while($row = mysqli_fetch_assoc($result)){
		array_push($response, array(
			'id' =>$row['id'],
			'nombre' =>$row['nombre'],
			'periodo' =>$row['periodo'],
			'precio' =>$row['precio'],
			'descripcion' => $row['descripcion'],
			'estado' => $row['estado'],
			'accesos' => $row['accesos']
		));
	}
	echo json_encode($response);
	mysqli_close($conexion);	
}

?>