package Contenedores;

import com.google.gson.annotations.SerializedName;

public class Administrador {
    
    @SerializedName("correo")
    private String correo;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellidos")
    private String apellidos;
    @SerializedName("telefono")
    private String telefono;
    @SerializedName("tel_emergencia")
    private String emergencia;
    @SerializedName("RFID")
    private String rfid;
    @SerializedName("fechareg")
    private String fecha;

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

    public String getEmergencia() {
        return emergencia;
    }

    public String getRfid() {
        return rfid;
    }

    public String getFecha() {
        return fecha;
    }
    
}
