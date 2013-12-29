/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author zadik
 */
public class GranPremio {
    String nombre;
    String pais;
    String dia;
    String mes;
    String anyo;
    Posicion posicion;
    
    public GranPremio(){
        
    }
    
    public Posicion nuevaPosicion(){
        return this.posicion=new Posicion(this.anyo,this.nombre);
    }
    
}
