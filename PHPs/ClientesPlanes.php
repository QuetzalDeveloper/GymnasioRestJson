<?php
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');
date_default_timezone_set('America/Mexico_City');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$plan = $_POST["plan"];
	$filtro = $_POST["filtro"];
	//Todos los planes
	if($plan == 0){
		//Vigentes y no vigentes (0,0)
		if($filtro == 0){
			$sql = "SELECT pago.id AS folio, cliente.correo, cliente.nombre, cliente.apellidos, planes.id, planes.nombre AS nomPlan, pago.fecini, pago.fecfin 
			FROM cliente, pago, planes 
			WHERE cliente.correo = pago.correo AND planes.id = pago.plan
			ORDER BY pago.id DESC";
		}
		//Vigentes (0,1)
		else{
			$sql="SELECT pago.id AS folio, cliente.correo, cliente.nombre, cliente.apellidos, planes.id, planes.nombre AS nomPlan, pago.fecini, pago.fecfin
			FROM cliente, pago, planes
			WHERE '".date("Y-m-d")."' BETWEEN pago.fecini AND pago.fecfin
			AND cliente.correo = pago.correo
			AND planes.id = pago.plan ORDER BY pago.id DESC";
		}
	}
	//Plan registrado
	else{
		//Vigentes y no vigentes (x,0)
		if($filtro == 0){
			$sql = "SELECT pago.id AS folio, cliente.correo, cliente.nombre, cliente.apellidos, planes.id, planes.nombre AS nomPlan, pago.fecini, pago.fecfin
			FROM cliente, pago, planes
			WHERE pago.plan = ".$plan."
			AND planes.id = pago.plan
			AND cliente.correo = pago.correo
			ORDER BY pago.id DESC";
		}
		//Vigentes (x,1)
		else{
			$sql = "SELECT pago.id AS folio, cliente.correo, cliente.nombre, cliente.apellidos, planes.id, planes.nombre AS nomPlan, pago.fecini, pago.fecfin
			FROM cliente, pago, planes
			WHERE '".date("Y-m-d")."' BETWEEN pago.fecini AND pago.fecfin
			AND pago.plan = ".$plan."
			AND planes.id = pago.plan
			AND cliente.correo = pago.correo
			ORDER BY pago.id DESC
			";
		}
		
	}
	
	$result=mysqli_query($conexion,$sql);
	$response=array();

	while($row = mysqli_fetch_assoc($result)){
		array_push($response, array(
			'id' =>$row['folio'],
			'correo' =>$row['correo'],
			'nombre' =>$row['nombre'],
			'apellidos' =>$row['apellidos'],
			'idPlan' => $row['id'],
			'plan' => $row['nomPlan'],
			'fecini' => $row['fecini'],
			'fecfin' => $row['fecfin'],

		));
	}
	echo json_encode($response);
	mysqli_close($conexion);	
}

?>