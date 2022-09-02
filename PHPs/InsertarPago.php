<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

$response = array();

if($_SERVER['REQUEST_METHOD']=='POST'){
	$correo = $_POST['correo'];
	$plan = $_POST['plan'];
	$fecini = $_POST['fecini'];
	$fecfin = $_POST['fecfin'];
	$costo = $_POST['costo'];
	$metodo = $_POST['metodo'];
	$referencia = $_POST['referencia'];
	$fecha = $_POST['fecha'];
			
	if($query = $conexion->prepare("INSERT INTO pago(correo,plan,fecini,fecfin,costo,metodo,referencia,fecha) VALUES(?,?,?,?,?,?,?,?)")){
		$query->bind_Param('sissdsss', $correo, $plan, $fecini, $fecfin, $costo, $metodo, $referencia, $fecha);
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
	mysqli_close($conexion);
}else{
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>