package Contenedores;

import com.google.gson.annotations.SerializedName;

public class Pago {
    
    @SerializedName("id")
    private int id;
    @SerializedName("correo")
    private String correo;
    @SerializedName("plan")
    private int plan;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("accesos")
    private String accesos;
    @SerializedName("fecini")
    private String fecini;
    @SerializedName("fecfin")
    private String fecfin;
    @SerializedName("costo")
    private double costo;
    @SerializedName("metodo")
    private String metodo;
    @SerializedName("referencia")
    private String referencia;
    @SerializedName("fecha")
    private String fecha;
    @SerializedName("CliNombre")
    private String cliNombre;
    @SerializedName("CliApellidos")
    private String cliApellidos;
    @SerializedName("adeudo")
    private double adeudo;
    @SerializedName("pagado")
    private double pagado;

    public double getAdeudo() {
        return adeudo;
    }

    public double getPagado() {
        return pagado;
    }
    
    public String getCliNombre() {
        return cliNombre;
    }

    public String getCliApellidos() {
        return cliApellidos;
    }
    
    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPlan() {
        return plan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAccesos() {
        return accesos;
    }

    public String getFecini() {
        return fecini;
    }

    public String getFecfin() {
        return fecfin;
    }

    public double getCosto() {
        return costo;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getReferencia() {
        return referencia;
    }
    
    public String getFecha(){
        return fecha;
    }
}
