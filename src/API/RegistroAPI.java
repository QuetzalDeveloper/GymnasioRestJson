package API;


import Contenedores.*;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegistroAPI {
    
    //Accesos
    
    @FormUrlEncoded
    @POST("ConsultarAccesosCliente.php")
    public Call<List<Acceso>> getAccesosCliente(
            @Field("correo") String correo
    );
    
    @FormUrlEncoded
    @POST("ConsultarAccesos.php")
    public Call<List<Acceso>> getAccesos(
            @Field("opcion") int opcion, 
            @Field("desde") String desde, 
            @Field("hasta") String hasta
    );
    
    @FormUrlEncoded
    @POST("InsertarAccesoSalida.php")
    public Call<ResponseBody> InsertarAccesoSalida( 
            @Field("idacceso") int idacceso
    );
    
    @FormUrlEncoded
    @POST("InsertarAccesoEntrada.php")
    public Call<ResponseBody> InsertarAccesoEntrada(
            @Field("correo") String correo, 
            @Field("area") String area
    );
    
    @POST("ConsultarClientesAcceso.php")
    public Call<List<AccesosCliente>> getClientesAcceso();
    
    @FormUrlEncoded
    @POST("ConsultarUltimoAccesoCorreo.php")
    public Call<List<Acceso>> getUltimoAccesoCorreo(
            @Field("correo") String correo
    );
    
    //Loggin
    
    @FormUrlEncoded
    @POST("LogginRSAdmin.php")
    public Call<List<LogginResponse>> IniSesion(
            @Field("correo") String correo,
            @Field("pass") String pass
    );
    
    //Pagos
    
    @POST("ConsultarPagosTodos.php")
    public Call<List<Pago>> getPagosTodos();
    
    @FormUrlEncoded
    @POST("ConsultarPagosNombreFechas.php")
    public Call<List<Pago>> getPagosNombreFecha(
            @Field("tipo") int tipo,
            @Field("nombre") String nombre, 
            @Field("inicio") String inicio, 
            @Field("hasta") String hasta
    );
    
    @FormUrlEncoded
    @POST("ConsultarPagosCliente.php")
    public Call<List<Pago>> getPagosCliente(
            @Field("correo") String correo
        );
    
    @FormUrlEncoded
    @POST("InsertarPago.php")
    public Call<ResponseBody> InsertarPago(
            @Field("correo") String correo,
            @Field("plan") int plan,
            @Field("fecini") String fecini,
            @Field("fecfin") String fecfin,
            @Field("costo") double costo,
            @Field("metodo") String metodo,
            @Field("referencia") String referencia,
            @Field("fecha") String fecha,
            @Field("adeudo") double adeudo,
            @Field("pagado") double pago
        );
    
    //Clientes
    
    @FormUrlEncoded
    @POST("ConsultarCliente.php")
    public Call<List<ClienteBase>> getCliente(
            @Field("correo") String correo
        );
    
    @FormUrlEncoded
    @POST("EditarCliente.php")
    public Call<ResponseBody> EditarCliente(
            @Field("correo") String correo,
            @Field("nombre") String nombre,
            @Field("apellidos") String apellidos,
            @Field("telefono") String telefono,
            @Field("fecnac") String fecnac,
            @Field("seguro") String seguro,
            @Field("emergencia") String emergencia,
            @Field("rfid") String rfid,
            @Field("password") String password
    );
    
    @FormUrlEncoded
    @POST("ConsultaClientes.php") // 0. todo, 1 + nombre. Por nombre
    public Call<List<ClienteBase>> getClientes(
            @Field("modo") int modo,
            @Field("nombre") String nombre
    );
    
    @POST("ConsultarClientesAdeudo.php")
    public Call<List<ClienteBase>> getClientesAdeudo();
    
    @FormUrlEncoded
    @POST("InsertarCliente.php")
    public Call<ResponseBody> NuevoCliente(
            @Field("correo") String correo,
            @Field("nombre") String nombre,
            @Field("apellidos") String apellidos,
            @Field("telefono") String telefono,
            @Field("fecnac") String fecnac,
            @Field("seguro") String seguro,
            @Field("emergencia") String emergencia,
            @Field("rfid") String rfid,
            @Field("password") String password
    );
    
    //Planes
    
    @FormUrlEncoded
    @POST("ClientesPlanes.php")
    public Call<List<CliPlan>> getPlanesClientes(
            @Field("plan") int i, 
            @Field("filtro") int filtro
    );
   
    @FormUrlEncoded
    @POST("PlanActual.php")
    public Call<List<Pago>> getPlanActual(
            @Field("correo") String correo
    );
    
    @FormUrlEncoded
    @POST("InsertarPlanes.php")
    public Call<ResponseBody> NuevoPlan(
            @Field("nombre") String nombre,
            @Field("periodo") int periodo,
            @Field("precio") double precio,
            @Field("descripcion") String descripcion,
            @Field("accesos") String accesos
    ); 
    
    @FormUrlEncoded
    @POST("ConsultaPlanes.php") //0 todo, 1 activos, 2 inactivos
    public Call<List<Plan>> getPlanes(
            @Field("modo") int modo
    );
    
    @FormUrlEncoded
    @POST("EditarPlan.php")
    public Call<ResponseBody> EditarPlan(
            @Field("id") int id,
            @Field("nombre") String nombre,
            @Field("periodo") int periodo,
            @Field("precio") double precio,
            @Field("descripcion") String descripcion,
            @Field("estado") int estado,
            @Field("accesos") String accesos
    );
    
    //Administradores
    
    @FormUrlEncoded
    @POST("InsertarAdministrador.php")
    public Call<ResponseBody> NuevoAdministrador(
            @Field("correo") String correo,
            @Field("nombre") String nombre,
            @Field("apellidos") String apellidos,
            @Field("telefono") String telefono,
            @Field("telemer") String teleme,
            @Field("rfid") String rfid,
            @Field("password") String password
    ); 

    @GET("ConsultaAdministradores.php")
    Call<List<Administrador>> getAdministradores();
    
    @FormUrlEncoded
    @POST("EditarAdministrador.php")
    public Call<ResponseBody> EditarAdministrador(
            @Field("correo") String correo,
            @Field("nombre") String nombre,
            @Field("apellidos") String apellidos,
            @Field("telefono") String telefono,
            @Field("telemer") String teleme,
            @Field("rfid") String rfid,
            @Field("password") String password
    );     

}
