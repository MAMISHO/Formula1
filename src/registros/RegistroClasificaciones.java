/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import entidades.Posicion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAMISHO
 */
public class RegistroClasificaciones {
    List<Posicion> listaPosiciones;
    String ruta;
    File archivo;
    FileReader fr;
    BufferedReader br;
    
    public RegistroClasificaciones(){
        listaPosiciones=new ArrayList<Posicion>();
        ruta="src/registros/";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
    }
    
    //implementar
    public List<Posicion> obtenerListaPosicionesEscuderia(String anyo){
        return this.listaPosiciones;
    }
}
