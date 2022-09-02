package ritmosport;

import GUI.InicioSesion;

public class RitmoSport {

    public static void main(String[] args) {        
        InicioSesion is = new InicioSesion();
        is.setLocationRelativeTo(null);
        is.CargarVentana();
        is.setVisible(true);
    }
    
    
}
