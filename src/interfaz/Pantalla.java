/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Formula1;
import poo.io.IO;

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
        //ampliar los demas casos de uso en el menu
        System.out.println("4) Iniciar CM\n");
        System.out.println("5) Insertar Resultados\n");
        System.out.println("6) Ver clasificación de Pilotos en CM\n");
        System.out.println("7) Ver clasificación de Escuderias en CM\n");
        System.out.println("8) Ver clasificación de Pilotos en GP\n");
        System.out.println("9) Ver clasificación de Escuderias en GP\n");
        System.out.println("10) Gestión Salir\n");
        System.out.println("\n_____Selecciona una opción_____\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>10);
        
        switch(op){
            case 1:
                System.out.println("Entrarte a gestión Pilotos");
                break;
            case 2:
                this.menuEscuderias();
                break;
            case 3:
                System.out.println("Entraste a gestión Pilotos");
                this.menuCircuitos();
                break;
            case 4:
                System.out.println("Entrarte a iniciar CM");
                break;
            case 5:
                System.out.println("Entrarte a insertar Resultados");
                break;
            case 6:
                System.out.println("\n*** Ver clasificación de Pilotos en CM ***\n");
                this.f1.consultaCPCM();
                break;
            case 7:
                System.out.println("\n*** Ver clasificación de Escuderias en CM ***\n");
                this.f1.consultaCECM();
                break;
            case 8:
                System.out.println("Entraste ver clasificacion pilotos en GP");
                break;
            case 9:
            System.out.println("Entraste ver clasificacion Escuderias en GP");
                break;
            case 10: 
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
        System.out.println("5) Cambiar pilotos activos\n");
        System.out.println("6) Regresar a menu principal\n");
        System.out.println("\n_____Selecciona una opción_____\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>6);
        
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
                System.out.println("\n*** Cambio de pilotos activos ***\n");
                this.f1.realizarCambioPilotosActivos(this.solicitarId());
                System.out.println("El cambio es correcto\n");
                break;
            case 6:
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
    public void menuCircuitos(){
        int op=0;
        Boolean salir=false;
        while(!salir){
        do{
        System.out.println("**** Gestión Circuitos ****\n");
        System.out.println("1) Alta Circuitoa\n");
        System.out.println("2) Baja Circuito\n");
        System.out.println("3) Modificar Circuito\n");
        System.out.println("4) Consultar Circuito\n");
        System.out.println("5) Regresar a menu principal\n");
        System.out.println("\n_____Selecciona una opción_____\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>6);
        
        switch(op){
            case 1:
                this.f1.realizarAltaCircuito();
                this.introducirDatosCircuito();
                System.out.println("\nCircuito guardado correctamente");
                break;
            case 2:
                System.out.println("\n** Baja de Circuito **\n");
                System.out.println("\nintroduce id del circuito: ");
                
                this.f1.realizarBajaCircuito(IO.readLine());
                System.out.println("El Circuito se elimino de forma correcta\n");
                break;
            case 3:
                System.out.println("\n** Modificar Circuito **\n");
                System.out.println("\nintroduce id del circuito: ");
                this.f1.realizarModificarCircuito(IO.readLine());
                this.ModificarDatosCircuito();
                
                break;
            case 4:
                this.f1.realizarConsultaCircuito(this.solicitarId());
                break;
            case 5:
                salir=true;
                break;
            
        }
        }
    }
    
     public void introducirDatosCircuito(){
        
        
        String idcircuitos;
        String nombre;
        String ubicacion;
        int longitud;
        int nvueltas;
        int distancia;
        int recordvuelta;
        Boolean completo=false;
        Boolean otromas=false;
        int contador=0;
        int opcion=1;
        
        System.out.println("**Introduzca los datos del Circuito**");
        System.out.println("\nNombre: ");
        nombre=IO.readLine();
        System.out.println("\nlongitud: ");
        longitud=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nNumero de vueltas: ");
        nvueltas=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nDistancia: ");
        distancia=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nRecord vuelta: ");
        recordvuelta=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nId del circuito: ");
        idcircuitos=IO.readLine();
             
        
        
        this.f1.introducirDatosCircuito(idcircuitos, nombre, longitud ,nvueltas , distancia, recordvuelta);
    }
    
    public void ModificarDatosCircuito(){
        
        String idcircuitos;
        String nombre;
        String ubicacion;
        int longitud;
        int nvueltas;
        int distancia;
        int recordvuelta;
                
        System.out.println("**Introduzca nuevos datos del Circuito**");
        System.out.println("\nNombre: ");
        nombre=IO.readLine();
        System.out.println("\nlongitud: ");
        longitud=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nNumero de vueltas: ");
        nvueltas=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nDistancia: ");
        distancia=Integer.valueOf(IO.readLine()).intValue();
        System.out.println("\nRecord vuelta: ");
        recordvuelta=Integer.valueOf(IO.readLine()).intValue();
        
        
        
        this.f1.modificarDatosEscuderia(nombre, longitud ,nvueltas , distancia, recordvuelta);
    }
    }

