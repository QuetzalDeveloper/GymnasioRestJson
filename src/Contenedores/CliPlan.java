package Contenedores;

import com.google.gson.annotations.SerializedName;

public class CliPlan {
    
    @SerializedName("id")
    private int id;
    @SerializedName("correo")
    private String correo;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellidos")
    private String apellidos;
    @SerializedName("idPlan")
    private int idplan;
    @SerializedName("plan")
    private String plan;
    @SerializedName("fecini")
    private String fecini;
    @SerializedName("fecfin")
    private String fecfin;

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getIdplan() {
        return idplan;
    }

    public String getPlan() {
        return plan;
    }

    public String getFecini() {
        return fecini;
    }

    public String getFecfin() {
        return fecfin;
    }
    
    
    
}
