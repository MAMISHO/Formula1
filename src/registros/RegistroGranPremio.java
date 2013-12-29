/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import entidades.GranPremio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAMISHO
 */
public class RegistroGranPremio {
    List<GranPremio> listaGrandesPremios;
    //implementar
    public RegistroGranPremio(){
        listaGrandesPremios=new ArrayList<GranPremio>();
    }
    //implementar
    public List<GranPremio> cagarGrandesPremios(){
        return this.listaGrandesPremios;
    }
}
