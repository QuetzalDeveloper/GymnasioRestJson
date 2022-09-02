<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos
FROM pago, cliente, planes
WHERE pago.correo = cliente.correo
AND pago.plan = planes.id
ORDER BY pago.id DESC';
$result=mysqli_query($conexion,$sql);
$response=array();
while($row = mysqli_fetch_assoc($result)){
	array_push($response, array(
		'id' =>$row['id'],
		'correo' =>$row['correo'],
		'plan' =>$row['plan'],
		'nombre' =>$row['nombre'],
		'accesos' => $row['accesos'],
		'fecini' => $row['fecini'],
		'fecfin' => $row['fecfin'],
		'costo' => $row['costo'],
		'metodo' => $row['metodo'],
		'referencia' => $row['referencia'],
		'fecha' => $row['fecha'],
		'CliNombre' => $row['CliNombre'],
		'CliApellidos' => $row['apellidos'],
	));
}
echo json_encode($response);
mysqli_close($conexion);	
?>