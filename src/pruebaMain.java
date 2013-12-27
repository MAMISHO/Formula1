
import registros.registroEscuderias;
import java.util.List;
import java.util.ArrayList;
import entidades.Escuderia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMISHO
 */
public class pruebaMain {
    public static void main(String [] arg) throws ParseException {
    
        //creamos una lista de pilotos activos
        //como solo son string que contienen claves lo creamos
        //directamente para pruebas
        List<String> pilotosActivos=new ArrayList<String>();
        pilotosActivos.add("PIL1");
        pilotosActivos.add("PIL3");
        
        //como decidimos meter la fecha de creacion como tipo
        //Date debemos hacer una convercion de String a date
        //poner atencion en el throws Parse... de arriba
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	String dateInString = "7-Jun-2013";
        Date date = formatter.parse(dateInString);

        //creamos una escuderia sin pilotos porque
        //aun no se hace la implememntacion de
        //pilotos, se descomenta una vez ya esté
        Escuderia esc=new Escuderia();
        esc.introducirDatos("Esc1", pilotosActivos, "Escuderia 1", "Sede 1", "Chasis 1", "Motor 1", "Neumatico 1", "1990", "7-Jun-2013");
        
        //ahora para guardar en el fichero, creamos un 
        //registro y le pasamos la escuderia que
        //queremos grabar
        registroEscuderias rE=new registroEscuderias();
        //--rE.guardarEscuderia(esc);
        //rE.LeeFichero();
        //rE.escribir("text de prueba");
        
        //por ultimo leo el fichero para ver
        //si lo guarda en el formato deseado
        //--rE.LeeFichero();
        
        List<Escuderia> escuderias=new ArrayList<Escuderia>();
        escuderias=rE.cargarEscuderias();
        
        Escuderia esc1=escuderias.get(0);
        
        esc1.mostrarDatos(esc1);
    }
    
}
