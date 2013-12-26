
import registros.registroEscuderias;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMISHO
 */
public class pruebaMain {
    public static void main(String [] arg) {
    
    registroEscuderias rE=new registroEscuderias();
    rE.LeeFichero();
    rE.escribir("text de prueba");
    rE.LeeFichero();
    }
    
}
