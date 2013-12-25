/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Date;


/**
 *
 * @author MAMISHO
 */
public class Piloto {
    String idPiloto;
    String nombre;
    String apelldo;
    String equipo;
    String equipoAnterior;
    String nacionalidad;
    Date fechaNacimiento;
    
    public Piloto(){
    
    }
    
    public void introducirDatos(){
        
    }
    
    public String imprimirPiloto(){
        return "imprimir datos de piloto";
    }
}
