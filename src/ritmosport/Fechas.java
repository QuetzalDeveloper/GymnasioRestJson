package ritmosport;

import datechooser.beans.DateChooserCombo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Fechas {
    
    
    
    public String getFecha(DateChooserCombo dcc) {
        String fecha = "";
        if(dcc.getSelectedDate() != null) {
            int num;
            Calendar date = dcc.getSelectedDate();
            num = date.get(Calendar.YEAR);
            fecha = num + "-";
            num = date.get(Calendar.MONTH) + 1;
            if (num < 10) {
                fecha = fecha + "0" + num + "-";
            } else {
                fecha = fecha + "" + num + "-";
            }
            num = date.get(Calendar.DATE);
            if (num < 10) {
                fecha = fecha + "0" + num;
            } else {
                fecha = fecha + "" + num;
            }
            return fecha;
        }else{
            return "";
        }
    }
    
    public Calendar TextoFecha(String fecha){
        Calendar ca = null;
        try {
            Date conver = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            ca = Calendar.getInstance();
            ca.setTime(conver);
        } catch (ParseException ex) {
            System.out.println("Error- 1 // "+ex.getMessage());
        }
        return ca;
    }
    
    public String FechaTexto(String date){
        String[] division = date.split("-");
        String texto = division[2] + " de "; //dia
        switch(division[1]){
            case "01" -> texto += "enero de ";
            case "02" -> texto += "febrero de ";
            case "03" -> texto += "marzo de ";
            case "04" -> texto += "abril de ";
            case "05" -> texto += "mayo de ";
            case "06" -> texto += "junio de ";
            case "07" -> texto += "julio de ";
            case "08" -> texto += "agosto de ";
            case "09" -> texto += "septiembre de ";
            case "10" -> texto += "octubre de ";
            case "11" -> texto += "noviembre de ";
            case "12" -> texto += "diciembre de ";
            default -> texto += " ? de ";
        }
        texto += division[0];
        return texto;
    }
    
    public String getFechaActual(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dtf.format(LocalDateTime.now());
        return date;
    }
    
    public String SumarFechaPeriodo(String fecha, int periodo){
        try {
            String date = "";
            int num;
            Date conver = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            Calendar ca = Calendar.getInstance();
            ca.setTime(conver);
            ca.add(Calendar.DAY_OF_YEAR, periodo);
            num = ca.get(Calendar.YEAR);
            fecha = num + "-";
            num = ca.get(Calendar.MONTH) + 1;
            if (num < 10) {
                fecha = fecha + "0" + num + "-";
            } else {
                fecha = fecha + "" + num + "-";
            }
            num = ca.get(Calendar.DATE);
            if (num < 10) {
                fecha = fecha + "0" + num;
            } else {
                fecha = fecha + "" + num;
            }
            return fecha;
        } catch (ParseException ex) {
            System.out.println("Error- 1 // "+ex.getMessage());
            return "";
        }
    }

    public Object FechaHoraTexto(String date) {
        date = date.replace(' ', '-');
        date = date.replace(':', '-');
        String[] fecha = date.split("-");
        //Fecha
        String texto = fecha[2] + " de "; //dia
        switch(fecha[1]){    //mes
            case "01" -> texto += "enero de ";
            case "02" -> texto += "febrero de ";
            case "03" -> texto += "marzo de ";
            case "04" -> texto += "abril de ";
            case "05" -> texto += "mayo de ";
            case "06" -> texto += "junio de ";
            case "07" -> texto += "julio de ";
            case "08" -> texto += "agosto de ";
            case "09" -> texto += "septiembre de ";
            case "10" -> texto += "octubre de ";
            case "11" -> texto += "noviembre de ";
            case "12" -> texto += "diciembre de ";
            default -> texto += " ? de ";
        }
        texto += fecha[0];   //ano
        //Hora
        texto += " "+fecha[3]+":"+fecha[4]+":"+fecha[5];
        return texto;
    }
    
}
