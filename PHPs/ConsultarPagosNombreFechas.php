<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
date_default_timezone_set('America/Mexico_City');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$tipo = $_POST['tipo'];
	$nombre = $_POST['nombre'];
	$inicio = $_POST['inicio'];
	$hasta = $_POST['hasta'];
	
	if($tipo == 1){	//Busqueda por fechas
		if(empty($nombre)){
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha BETWEEN "'.$inicio.'" AND "'.$hasta.'" AND pago.correo = cliente.correo AND pago.plan = planes.id ORDER BY pago.id DESC';
		}else{
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha BETWEEN "'.$inicio.'" AND "'.$hasta.'" AND pago.correo = cliente.correo AND pago.plan = planes.id AND (cliente.nombre LIKE "'.$nombre.'%" OR cliente.apellidos LIKE "'.$nombre.'%") ORDER BY pago.id DESC';
		}	
	}elseif($tipo == 2){	//Solo nombre
		$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.correo = cliente.correo AND pago.plan = planes.id AND (cliente.nombre LIKE "'.$nombre.'%" OR cliente.apellidos LIKE "'.$nombre.'%") ORDER BY pago.id DESC';
	}elseif($tipo == 3){	//Del primer hasta la fecha indicada
		if(empty($nombre)){
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha < "'.$hasta.'" AND pago.correo = cliente.correo AND pago.plan = planes.id ORDER BY pago.id DESC';
		}else{
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha < "'.$hasta.'" AND pago.correo = cliente.correo AND pago.plan = planes.id AND (cliente.nombre LIKE "'.$nombre.'%" OR cliente.apellidos LIKE "'.$nombre.'%") ORDER BY pago.id DESC';
		}
	}elseif($tipo == 4){ //DEsde la fecha indicada hasta el ultimo
		if(empty($nombre)){
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha > "'.$inicio.'" AND pago.correo = cliente.correo AND pago.plan = planes.id ORDER BY pago.id DESC';
		}else{
			$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.fecha > "'.$inicio.'" AND pago.correo = cliente.correo AND pago.plan = planes.id AND (cliente.nombre LIKE "'.$nombre.'%" OR cliente.apellidos LIKE "'.$nombre.'%") ORDER BY pago.id DESC';
		}
	}else{
		$sql = 'SELECT pago.*, cliente.nombre AS "CliNombre", cliente.apellidos, planes.nombre, planes.accesos FROM pago, cliente, planes WHERE pago.correo = cliente.correo AND pago.plan = planes.id AND (cliente.nombre LIKE "'.$nombre.'%" OR cliente.apellidos LIKE "'.$nombre.'%") ORDER BY pago.id DESC';
	}
	
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
}

?>