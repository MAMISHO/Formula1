/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;
import entidades.Escuderia;
import entidades.Piloto;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MAMISHO
 */
public class registroEscuderias {
    List<Escuderia> listaEscuderias;
    String ruta;
    File archivo;
    FileReader fr;
    BufferedReader br;
    
    public registroEscuderias(){
        listaEscuderias=new ArrayList<Escuderia>();
        ruta="src/registros/";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
    }
    
    public void LeeFichero() {
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File (this.ruta+"R_Escuderia.txt");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);
           
         // Lectura del fichero
           String linea;
           while((linea=br.readLine())!=null)
            System.out.println(linea);
    }
    catch(Exception e){
       e.printStackTrace();
    }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
       try{                    
            if( null != fr ){   
                fr.close();     
            }                  
        }catch (Exception e2){ 
            e2.printStackTrace();
        }
    }
  }
    
    public void guardarEscuderia(Escuderia esc){
        String grabar="";
        String pilotos="PIL1:PIL2:PIL3:PIL4:";
        /*for(Piloto piloto:esc.getPilotos()){
            pilotos+=piloto.getIdPiloto()+":";
        }*/
        pilotos=pilotos.substring(0, pilotos.length()-1);
        
        grabar+=esc.getIdEscuderia()+";";
        grabar+=pilotos+";";
        grabar+=esc.getIdPilotosActivos().get(0)+":";
        grabar+=esc.getIdPilotosActivos().get(1)+";";
        grabar+=esc.getNombre()+";";
        grabar+=esc.getSede()+";";
        grabar+=esc.getChasis()+";";
        grabar+=esc.getMotor()+";";
        grabar+=esc.getNeumaticos()+";";
        grabar+=esc.getPrimeraTemporada()+";";
        grabar+=esc.getFechaCrea().toString()+";";
        
        this.escribir(grabar);
    }
    
    public void escribir(String cadena){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(this.ruta+"R_Escuderia.txt",true);
            pw = new PrintWriter(fichero);
 
            
                pw.println(cadena);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public Escuderia introduceIdEscuderia(String id){
        Escuderia esc=new Escuderia();
        return esc;
    }
    
    public void borraEscuderia(Escuderia esc){
        
    }

    public List<Escuderia> getListaEscuderias() {
        return listaEscuderias;
    }

    public void setListaEscuderias(List<Escuderia> listaEscuderias) {
        this.listaEscuderias = listaEscuderias;
    }
}

