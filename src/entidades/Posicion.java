/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author MAMISHO
 */
public class Posicion {
    private String anyo;
    private String nombreGranPremio;
    private Piloto piloto;
    private int posicion;
    
    
    public Posicion(String anyo,String nombreGranPremio){
        this.anyo=anyo;
        this.nombreGranPremio=nombreGranPremio;
    }
    
    public void mostrarClasificacionEscuderiasCM(List<Posicion> posiciones){
        int[] puntos={25,18,15,12,10,8,6,4,2,1};
        
        for(Posicion p:posiciones){
            System.out.println(p.getNombreGranPremio()+" - "+p.getPiloto().getIdPiloto()+" - "+p.getPosicion()+"\n");
        }
        
        //ordenar lista en orden de llegada Pilotos
        //asignar puntos y crear lista por escuderias(Escuderia,puntos)
        //generar cadena 
        
        //System.out.println(cadena generada);
    }
    
    
        /*la lista recibida sera generica con la estructura
         *@overwrite
         * Escuderia Nombre=Lo sacamos de los pilotos.equipo
         * puntos
         */
    private String cadenaClasificacionEscuderiasCM(List posiciones){
        String cadenaPosiciones="";
        
        return cadenaPosiciones;
    }
    
     public void mostrarClasificacionPilotosCM(List<Posicion> posiciones){
        //implementar la clasificacion
        
        //ordenar lista en orden de llegada Pilotos
        //asignar puntos y crear lista por Pilotos(Pilotos,puntos)
        //generar cadena 
         
         
         //System.out.println(cadena generada);
    }
    
    
        /*la lista recibida sera generica con la estructura
         *@overwrite
         * Pilotos
         * puntos
         */
    private String cadenaClasificacionPilotosCM(List posiciones){
        String cadenaPosiciones="";
        //generamos cadena a partir del array y revoyvemos
        return cadenaPosiciones;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getNombreGranPremio() {
        return nombreGranPremio;
    }

    public void setNombreGranPremio(String nombreGranPremio) {
        this.nombreGranPremio = nombreGranPremio;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto =piloto;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
