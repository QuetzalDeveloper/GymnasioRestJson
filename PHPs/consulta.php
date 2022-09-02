<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
		$sql="SELECT * FROM cliente";
	

	$result=mysqli_query($conexion,$sql);
	$response=array();

	while($row = mysqli_fetch_assoc($result)){
		array_push($response, array(
			'correo' =>$row['correo'],
			'nombre' =>$row['nombre'],
			'apellidos' =>$row['apellidos'],
			'telefono' =>$row['telefono'],
			'fecnac' => $row['fecnac'],
			'seguro' => $row['seguro'],
			'emergencia' => $row['emergencia'],
			'rfid' => $row['rfid'],
			'ingreso' => $row['ingreso']
		));
	}
	echo json_encode($response);
	mysqli_close($conexion);	

?>