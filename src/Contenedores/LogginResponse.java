package Contenedores;

import com.google.gson.annotations.SerializedName;

public class LogginResponse {
    
    @SerializedName("mensaje")
    private String respuesta;

    public String getRespuesta() {
        return respuesta;
    }
       
}
