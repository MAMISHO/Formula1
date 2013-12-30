/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
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
    
    /*Aqui se añadira el código de consultas
     * Despues de dincronizar la implementacion de
     * inicializacion de F1 y de insertar Resultados
     * porque si no hay fallos
     */
    
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
