/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.CampeonatoMundial;
import entidades.Circuito;
import entidades.Escuderia;
import entidades.Piloto;
import entidades.Posicion;
import java.util.ArrayList;
import java.util.List;
import registros.RegistroClasificaciones;
import registros.RegistroEscuderias;

/**
 *
 * @author MAMISHO
 */
public class Formula1 {
    //Campeonato mundial
    CampeonatoMundial campeonatoMundial;
    //Registros
    RegistroClasificaciones registroClasificaciones;
    RegistroEscuderias registroDatosEscuderias;
    //RegistroPilotos registroDatosPilotos;
    //RegistroCircuitos registroDatosCircuitos;
    
    //entidades
    Escuderia escuderia;
    Piloto piloto;
    Posicion posicion;
    
    public Formula1(){
        //creamos los registros y la carga de datos se hace
        //en el main
        registroClasificaciones=new RegistroClasificaciones();
        registroDatosEscuderias=new RegistroEscuderias();
        
        
        //this.inicalizaCM();
    }
    
    public void inicializaCM(){
        //this.campeonatoMundial=new CampeonatoMundial("2014");
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
    
    /*Nota de la implementación
     @overwrite
     * Si implementaramos los escenarios alternativos
     * tendriamos que comprobar si el id existe en la
     * lista, como solo nos centramos en el caso normal
     * no comprobamos y solicitamos la escuderia
     */
    public void realizarBajaEscuderia(String idEscuderia){
        this.escuderia=this.registroDatosEscuderias.introduceIdEscuderia(idEscuderia);
        this.registroDatosEscuderias.borraEscuderia(escuderia);
    }
    
    public void realizarConsultaEscuderia(String idEscuderia){
        this.escuderia=this.registroDatosEscuderias.introduceIdEscuderia(idEscuderia);
        this.escuderia.mostrarDatos(escuderia);
    }
    
    public void realizarModificarEscuderia(String idEscuderia){
        this.escuderia=this.registroDatosEscuderias.introduceIdEscuderia(idEscuderia);
        this.escuderia.mostrarDatos(escuderia);
        
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
    
    public void modificarDatosEscuderia(/*String nombre,*/String sede,String chasis,String motor,String neumaticos,String primeraTemporada,String fechaCrea){
        this.escuderia.modificarDatos(/*nombre,*/sede, chasis, motor, neumaticos, primeraTemporada, fechaCrea);
        this.registroDatosEscuderias.guardarEscuderiaModificada(escuderia);
    }
   
    public void realizarCambioPilotosActivos(String idEscuderia, String idPiloto1, String idPiloto2){
        //se sincronizara cuando este implementado el registro de pilotos∫
        //porque es necesario para el funcionamiento.
        //System.out.println("inicia el cambio");
        escuderia=this.registroDatosEscuderias.introduceIdEscuderia(idEscuderia);
        //List<Piloto> pilotos=this.registroDatosPilotos.obtenerPilotosCambio(idPiloto1,idPiloto2);
                        // esta no solo para pruebas List<Piloto> pilotos= new ArrayList<Piloto>();
        //escuderia.sustituirPilotos(pilotos.get(0),pilotos.get(1));
        this.registroDatosEscuderias.guardarEscuderiaModificada(escuderia);
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
    
    /*metodos de consultas campeonato mundial
     * descomentar despues de implementar metodos 
     * necesarios para funcionamiento(CU-13 y CU-20)
     */
    
    public void consultaCECM(){
        List<Posicion> posiciones=registroClasificaciones.obtenerListaPosicionesCM(this.campeonatoMundial.getAnyo());
        this.posicion.mostrarClasificacionEscuderiasCM(posiciones);
    }
    
    public void consultaCPCM(){
        List<Posicion> posiciones=registroClasificaciones.obtenerListaPosicionesCM(this.campeonatoMundial.getAnyo());
        this.posicion.mostrarClasificacionPilotosCM(posiciones);
    }
    //metodos necesarios
    
    public void setCampeonatoMundial(CampeonatoMundial cm){
        this.campeonatoMundial=cm;
    }
    
    public CampeonatoMundial getCampeonatoMundial(){
        return this.campeonatoMundial;
    }
    
}
