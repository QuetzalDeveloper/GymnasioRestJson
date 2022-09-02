package Contenedores;

import com.google.gson.annotations.SerializedName;

public class ClienteBase {
    
    @SerializedName("correo")
    private String correo;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellidos")
    private String apellidos;
    @SerializedName("telefono")
    private String telefono;
    @SerializedName("fecnac")
    private String fecnac;
    @SerializedName("seguro")
    private String seguro;
    @SerializedName("emergencia")
    private String emergencia;
    @SerializedName("rfid")
    private String rfid;
    @SerializedName("ingreso")
    private String ingreso;
    @SerializedName("adeudo")
    private double adeudo;
    
    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecnac() {
        return fecnac;
    }

    public String getSeguro() {
        return seguro;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public String getRfid() {
        return rfid;
    }

    public String getIngreso() {
        return ingreso;
    }
    
    public double getAdeudo(){
        return adeudo;
    }
       
}
