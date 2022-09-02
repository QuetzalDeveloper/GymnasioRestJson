<?php 
header("Content-Type: application/json; charset=UTF-8");
include('conexion.php');

if($_SERVER['REQUEST_METHOD']=='POST'){
	$correo = $_POST['correo'];
	$nombre = $_POST['nombre'];
	$apellidos = $_POST['apellidos'];
	$telefono = $_POST['telefono'];
	$teleme = $_POST['teleemer'];
	$rfid = $_POST['rfid'];
	$password = password_hash($_POST['password'], PASSWORD_BCRYPT);
	$response = array();
	
	$sql = "SELECT * FROM administrador WHERE correo='".$correo."'";
	$check = mysqli_fetch_array(mysqli_query($con,$sql));
	if(isset($check)){
		$response['success']="1";
		$response['message']="Correo ya registrado";
        $query -> close();
	}else{
		if($query = $conexion->prepare("INSERT INTO administrador VALUES(?,?,?,?,?,?,?,?)")){
			$query->bind_Param('ssssssss', $correo,$nombre,$apellidos,$telefono,$teleme,$rfid,$password,date("Y-m-d"));
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
	mysqli_close($con);
}else{
	$response['success']="4";
	$response['message']="Error en el servidor";
}

echo json_encode($response);
?>