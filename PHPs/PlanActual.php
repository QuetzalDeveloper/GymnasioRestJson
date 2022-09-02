<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$correo = $_POST["correo"];	
	$sql="SELECT pago.id, pago.correo, pago.plan, planes.nombre, planes.accesos, pago.fecini, pago.fecfin, pago.costo, pago.metodo, pago.referencia, pago.fecha FROM pago,planes WHERE pago.correo = '".$correo."' AND pago.plan = planes.id ORDER BY id desc LIMIT 1";
	
	$result=mysqli_query($conexion,$sql);
	$response=array();

	while($row = mysqli_fetch_assoc($result)){
		array_push($response, array(
			'id' =>$row['id'],
			'correo' =>$row['correo'],
			'plan' =>$row['plan'],
			'nombre' =>$row['nombre'],
			'accesos' =>$row['accesos'],
			'fecini' =>$row['fecini'],
			'fecfin' => $row['fecfin'],
			'costo' => $row['costo'],
			'metodo' => $row['metodo'],
			'referencia' => $row['referencia'],
			'fecha' => $row['fecha']
		));
	}
	echo json_encode($response);
	mysqli_close($conexion);	
}

?>