package Contenedores;

import com.google.gson.annotations.SerializedName;

public class AccesosCliente {
    
    @SerializedName("correo")
    private String correo;
    @SerializedName("cnombre")
    private String nombre;
    @SerializedName("apellidos")
    private String apellidos;
    @SerializedName("nombre")
    private String plan;
    @SerializedName("accesos")
    private String accesos;
    @SerializedName("fecini")
    private String fecInicio;
    @SerializedName("fecfin")
    private String fecFinal;

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPlan() {
        return plan;
    }

    public String getAccesos() {
        return accesos;
    }

    public String getFecInicio() {
        return fecInicio;
    }

    public String getFecFinal() {
        return fecFinal;
    }
    
    
}
