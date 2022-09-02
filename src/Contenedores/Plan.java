package Contenedores;

import com.google.gson.annotations.SerializedName;

public class Plan {
    
    @SerializedName("id")
    private int id;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("periodo")
    private int periodo;
    @SerializedName("precio")
    private double precio;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("estado")
    private int estado;
    @SerializedName("accesos")
    private String accesos;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEstado() {
        return estado;
    }
    
    public String getAccesos(){
        return accesos;
    }
    
}