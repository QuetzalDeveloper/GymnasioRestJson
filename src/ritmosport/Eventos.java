package ritmosport;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Eventos {

    public boolean TablaDobleClick(MouseEvent evt, JTable tabla){
        if(evt.getClickCount() == 2 && tabla.getSelectedRow() != -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String FormatoMoneda(double cantidad) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String texto = nf.format(cantidad);
        return texto;
    }

    public void SoloNumeros(KeyEvent evt, JTextField text, int tamano){
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();    
        }else if(text.getText().length()== tamano){
            evt.consume();
        }
    }
    
    public void NumerosDecimales(KeyEvent evt, JTextField text){
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.'){
        }else{
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    
    public void SoloLetras(KeyEvent evt, JTextField text){ //Key Typed
        char c = evt.getKeyChar();
        if(!Character.isLetter(c)&& (c != evt.VK_BACK_SPACE) && (c != evt.VK_ENTER) && (c != evt.VK_ESCAPE) && (c != evt.VK_SPACE)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();    
        }
    }

    public boolean FormatoCorreo(String correo) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        if (mather.find() == false) {
            JOptionPane.showMessageDialog(null, "El correo no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public int Teclado(KeyEvent evt){ //Key Pressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER -> {
                return 1;
            }
            case KeyEvent.VK_ESCAPE -> {
                return 2;
            }
            case KeyEvent.VK_F1 -> {
                return 3;
            }
            case KeyEvent.VK_F2 -> {
                return 4;
            }
            case KeyEvent.VK_F3 -> {
                return 5;
            }
            case KeyEvent.VK_F4 -> {
                return 6;
            }
            case KeyEvent.VK_F5 -> {
                return 7;
            }
            case KeyEvent.VK_F6 -> {
                return 8;
            }
            case KeyEvent.VK_F7 -> {
                return 9;
            }
            case KeyEvent.VK_F8 -> {
                return 10;
            }
            case KeyEvent.VK_F9 -> {
                return 11;
            }
            case KeyEvent.VK_F10 -> {
                return 12;
            }
            case KeyEvent.VK_F11 -> {
                return 13;
            }
            case KeyEvent.VK_F12 -> {
                return 14;
            }
            default -> {
            }
        }
        return 0;
    }

}
