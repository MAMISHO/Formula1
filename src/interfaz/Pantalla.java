/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Formula1;
import edi.io.IO;

/**
 *
 * @author MAMISHO
 */
public class Pantalla {
    Formula1 f1;
    
    public Pantalla(Formula1 f1){
        this.f1=f1;
    }
    
    public void menuPrincipal(){
        int op=0;
        Boolean salir=false;
        while(!salir){
        do{
        System.out.println("**** Gestión de fromula1 ****\n");
        System.out.println("1) Gestión Pilotos\n");
        System.out.println("2) Gestión Escuderias\n");
        System.out.println("3) Gestión Circuitos\n");
        System.out.println("4) Gestión Salir\n");
        System.out.println("\n_____Selecciona una opción_____\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>4);
        
        switch(op){
            case 1:
                System.out.println("Entrarte a gestión Pilotos");
                break;
            case 2:
                this.menuEscuderias();
                break;
            case 3:
                System.out.println("Entrarte a gestión Pilotos");
                break;
            case 4: 
                System.out.println("Selección salir");
                salir=true;
                break;
        }
        }
    }
    
    private void menuEscuderias(){
        int op=0;
        Boolean salir=false;
        while(!salir){
        do{
        System.out.println("**** Gestión Escuderías ****\n");
        System.out.println("1) Alta Escudería\n");
        System.out.println("2) Baja Escudería\n");
        System.out.println("3) Modificar Escudería\n");
        System.out.println("4) Consultar Escudería\n");
        System.out.println("5) Regresar a menu principal\n");
        System.out.println("\n_____Selecciona una opción_____\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>5);
        
        switch(op){
            case 1:
                this.f1.realizarAltaEscuderia();
                this.introducirDatosEscuderia();
                System.out.println("\nEscuderia guardada correctamente");
                break;
            case 2:
                System.out.println("\n** Baja de Escuderia **\n");
                this.f1.realizarBajaEscuderia(this.solicitarId());
                System.out.println("La escuderia se elimino de forma correcta\n");
                break;
            case 3:
                System.out.println("\n** Modificar Escuderia **\n");
                this.f1.realizarModificarEscuderia(this.solicitarId());
                this.ModificarDatosEscuderia();
                
                break;
            case 4:
                this.f1.realizarConsultaEscuderia(this.solicitarId());
                break;
            case 5:
                salir=true;
                break;
        }
        }
    }
    
    public void introducirDatosEscuderia(){
        String nombre;
        String[] idPilotos=new String[4];
        int numPilotos=0;
        String[] idPilotosActivos;
        String sede;
        String chasis;
        String motor;
        String neumaticos;
        String primeraTemporada;
        String fechaCrea;
        Boolean completo=false;
        Boolean otromas=false;
        int contador=0;
        int opcion=1;
        
        System.out.println("**Introduzca los datos de la Escudería**");
        System.out.println("\nNombre: ");
        nombre=IO.readLine();
        System.out.println("\nSede: ");
        sede=IO.readLine();
        System.out.println("\nChasis: ");
        chasis=IO.readLine();
        System.out.println("\nMotor: ");
        motor=IO.readLine();
        System.out.println("\nNeumaticos: ");
        neumaticos=IO.readLine();
        System.out.println("\nPrimera Temporada: ");
        primeraTemporada=IO.readLine();
        System.out.println("\nFecha Creación(dd-mm-yyy): ");
        fechaCrea=IO.readLine();
        
        System.out.println("\n**** Pilotos de la escudería ****");
        while(contador<4 && !otromas){
            System.out.println("\nID del piloto");
            String aux=IO.readLine();
            idPilotos[contador]=aux;
            numPilotos++;
            if(contador>0){//hacer pruebas de index
                do{
                    if(contador<3){
                    System.out.println("\nIngresar otro?\n\t[1=si | 2=no]");
                    opcion=(int)IO.readNumber();
                    }else{
                        opcion=2;
                    }
                    
                }while(opcion<1 || opcion >2);
                
                if(opcion==2){
                    otromas=true;
                }
            }
            contador++;
        }
        
        idPilotosActivos=this.seleccionaPilotosActivos(idPilotos,numPilotos);
        
        
        this.f1.introducirDatosEscuderia(idPilotos, idPilotosActivos, nombre, sede, chasis, motor, neumaticos, primeraTemporada, fechaCrea);
    }
    
    public void ModificarDatosEscuderia(){
        //String nombre;
        //String[] idPilotos=new String[4];
        //int numPilotos=0;
        //String[] idPilotosActivos;
        String sede;
        String chasis;
        String motor;
        String neumaticos;
        String primeraTemporada;
        String fechaCrea;
        //Boolean completo=false;
        //Boolean otromas=false;
        //int contador=0;
        //int opcion=1;
        
        System.out.println("**Introduzca nuevos datos de la Escudería**");
        //System.out.println("\nNombre: ");
        //nombre=IO.readLine();
        System.out.println("\nSede: ");
        sede=IO.readLine();
        System.out.println("\nChasis: ");
        chasis=IO.readLine();
        System.out.println("\nMotor: ");
        motor=IO.readLine();
        System.out.println("\nNeumaticos: ");
        neumaticos=IO.readLine();
        System.out.println("\nPrimera Temporada: ");
        primeraTemporada=IO.readLine();
        System.out.println("\nFecha Creación(dd-mm-yyy): ");
        fechaCrea=IO.readLine();
        
        /*System.out.println("\n**** Pilotos de la escudería ****");
        while(contador<4 && !otromas){
            System.out.println("\nID del piloto");
            String aux=IO.readLine();
            idPilotos[contador]=aux;
            numPilotos++;
            if(contador>0){//hacer pruebas de index
                do{
                    if(contador<3){
                    System.out.println("\nIngresar otro?\n\t[1=si | 2=no]");
                    opcion=(int)IO.readNumber();
                    }else{
                        opcion=2;
                    }
                    
                }while(opcion<1 || opcion >2);
                
                if(opcion==2){
                    otromas=true;
                }
            }
            contador++;
        }*/
        
        //idPilotosActivos=this.seleccionaPilotosActivos(idPilotos,numPilotos);
        
        
        this.f1.modificarDatosEscuderia(/*nombre,*/ sede, chasis, motor, neumaticos, primeraTemporada, fechaCrea);
    }
    
    private String[] seleccionaPilotosActivos(String[] p,int numPilotos){
        String[] pA=new String[2];
        int opcion=0;
        int i;
        int contador=0;
        
        System.out.println("\n**** Selecciona los Pilotos activos ****");
        do{
            do{
                for(i=0;i<numPilotos;i++){
                        System.out.println("\n"+i+") "+p[i]);
                }
             opcion=(int)IO.readNumber();
            }while(opcion<0 || opcion>numPilotos-1);
            
            
            if(contador==0){
                pA[contador]=p[opcion];
                System.out.println("\nSeleccion correcta, ahora selecciona otro");
            }else{
                if(pA[0].equals(p[opcion])){
                    System.out.println("\nYa esta seleccionado, selecciona otro\n");
                    contador--;
                }else{
                    pA[contador]=p[opcion];
                }
            }
            contador++;
        }while(contador<2);
        
        return pA;
    }
    
    public String solicitarId(){
        String idEscuderia;
        System.out.println("Introduce el id de la escuderia\n");
        idEscuderia=IO.readLine();
        //this.f1.realizarBajaEscuderia(idEscuderia);
        return idEscuderia;
    }
}
