/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Circuito;
import entidades.Escuderia;
import entidades.Piloto;
import java.util.ArrayList;
import java.util.List;
import registros.RegistroEscuderias;

/**
 *
 * @author MAMISHO
 */
public class Formula1 {
    //Registros
    RegistroEscuderias registroDatosEscuderias;
    //RegistroPilotos registroDatosPilotos;
    //RegistroCircuitos registroDatosCircuitos;
    
    //entidades
    Escuderia escuderia;
    Piloto piloto;
    
    public Formula1(){
        //creamos los registros y la carga de datos se hace
        //en el main
        registroDatosEscuderias=new RegistroEscuderias();
    }
    
    //piloto
    public void realizarAltaPiloto(){
        
    }
    public void realizarBajaPiloto(){
        
    }
    public void realizarConsultaPiloto(){
        
    }
    public void realizarModificarPiloto(){
        
    }
    
    //Escuderia
    public void realizarAltaEscuderia(){
        this.escuderia=new Escuderia();
    }
    public void realizarBajaEscuderia(){
        
    }
    public void realizarConsultaEscuderia(){
        
    }
    public void realizarModificarEscuderia(){
        
    }
    public void introducirDatosEscuderia(String[] pilotos,String[] pilotosActivos,String nombre,String sede,String chasis,String motor,String neumaticos,String primeraTemporada,String fechaCrea){
        //construimos los datos de La escuderia y se la enviamos
        List<Piloto> listaPilotos=new ArrayList<Piloto>();
        List<String> listaPilotosActivos=new ArrayList<String>();
        int i=0;
        //creo la lista de pilotos
        for(i=0;i<pilotos.length;i++){
            Piloto p=new Piloto(pilotos[i]);
            listaPilotos.add(p);
        }
        
        //creo la lista de idPilotosActivos
        for(i=0;i<pilotosActivos.length;i++){
            listaPilotosActivos.add(pilotosActivos[i]);
        }
        
        //introducimos los datos en la escuderia
        this.escuderia.introducirDatos(listaPilotos, listaPilotosActivos, nombre, sede, chasis, motor, neumaticos, primeraTemporada, fechaCrea);
        
        //guarda la escuderia
        registroDatosEscuderias.guardarEscuderia(this.escuderia);
    }
   
    
    
    //circuitos
    
    public void realizarAltaCircuito(){
        
    }
    public void realizarBajaCircuito(){
        
    }
    public void realizarConsultaCircuito(){
        
    }
    public void realizarModificarCircuito(){
        
    }
    
    public void cargarDatosEscuderias(){
        this.registroDatosEscuderias.cargarEscuderias();
    }
}
