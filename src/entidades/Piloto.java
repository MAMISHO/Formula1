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
    
    public Piloto(String idPiloto){
        this.idPiloto=idPiloto;
    }
    
    /*Contructor de pruebas, no aparece en la implementacion
     * final, solo es para ver la consyltas, eliminar despues de
     * las pruebas
     */
    public Piloto(String idPiloto,String equipo){
        this.idPiloto=idPiloto;
        this.equipo=equipo;
    }
    public void introducirDatos(){
        
    }
    
    public String imprimirPiloto(){
        return "imprimir datos de piloto";
    }

    public String getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(String idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apelldo;
    }

    public void setApelldo(String apelldo) {
        this.apelldo = apelldo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipoAnterior() {
        return equipoAnterior;
    }

    public void setEquipoAnterior(String equipoAnterior) {
        this.equipoAnterior = equipoAnterior;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
