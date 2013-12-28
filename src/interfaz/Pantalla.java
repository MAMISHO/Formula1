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
        do{
        System.out.println("----gestion de fromula1----\n");
        System.out.println("1) Gestion Pilotos\n");
        System.out.println("2) Gestion Escuderias\n");
        System.out.println("3) Gestion Circuitos\n");
        System.out.println("4) Gestion Salir\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>4);
        
        switch(op){
            case 1:
                System.out.println("Entrarte a gestion Pilotos");
                break;
            case 2:
                this.menuEscuderias();
                break;
            case 3:
                System.out.println("Entrarte a gestion Pilotos");
                break;
            case 4: 
                System.out.println("salir");
                break;
        }
    }
    
    private void menuEscuderias(){
        int op=0;
        do{
        System.out.println("----gestion Escuderias----\n");
        System.out.println("1) Alta Escuderia\n");
        System.out.println("2) Baja Escuderia\n");
        System.out.println("3) Modificar Escuderia\n");
        System.out.println("4) Consultar Escuderia\n");
        op=(int)IO.readNumber();
        }
        while(op<1 || op>4);
        
        switch(op){
            case 1:
                this.f1.realizarAltaEscuderia();
                this.introducirDatosEscuderia();
                break;
            case 2:
                this.f1.realizarBajaEscuderia();
                break;
            case 3:
                this.f1.realizarModificarEscuderia();
                break;
            case 4:
                this.f1.realizarConsultaEscuderia();
                break;
        }
    }
    
    public void introducirDatosEscuderia(){
        String nombre;
        String[] idPilotos=new String[4];
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
        
        System.out.println("Introduzca los datos de la Escuderia");
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
        System.out.println("\nFecha Creacion(dd-mm-yyy): ");
        fechaCrea=IO.readLine();
        
        System.out.println("\n**Pilotos de la escuderia**");
        while(contador<4 && !otromas){
            System.out.println("\nID del piloto");
            String aux=IO.readLine();
            idPilotos[contador]=aux;
            if(contador>0){//hacer pruebas de index
                do{
                    if(contador<3){
                    System.out.println("\nIngresar otro?[1-->si 2-->no]");
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
        
        idPilotosActivos=this.seleccionaPilotosActivos(idPilotos);
        
        
        this.f1.introducirDatosEscuderia(idPilotos, idPilotosActivos, nombre, sede, chasis, motor, neumaticos, primeraTemporada, fechaCrea);
    }
    
    
    private String[] seleccionaPilotosActivos(String[] p){
        String[] pA=new String[2];
        int opcion=0;
        int i;
        int contador=0;
        
        System.out.println("\n**Selecciona los Pilotos activos**");
        do{
            do{
                for(i=0;i<p.length;i++){
                    System.out.println("\n"+i+")"+p[i]);
                }
             opcion=(int)IO.readNumber();
            }while(opcion<0 || opcion>p.length);
            
            
            if(contador==0){
                pA[contador]=p[opcion];
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
}
