package Contenedores;

import com.google.gson.annotations.SerializedName;

public class Acceso {
    
    @SerializedName("id_a")
    private int ida;
    @SerializedName("correo")
    private String correo;
    @SerializedName("entrada")
    private String entrada;
    @SerializedName("salida")
    private String salida;
    @SerializedName("area")
    private String area;
    @SerializedName("nombre")
    private String cliNombre;
    @SerializedName("apellidos")
    private String cliApellidos;

    public int getIda() {
        return ida;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public String getArea() {
        return area;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public String getCliApellidos() {
        return cliApellidos;
    }
      
}
