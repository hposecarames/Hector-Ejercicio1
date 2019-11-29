
package hector.ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIELCASTELAO\hposecarames
 */
public class HectorEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hilos hilo1 = new Hilos();
        Hilos hilo2 = new Hilos();
        Hilos hilo3 = new Hilos();
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(HectorEjercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El programa terminó");
    }
    
}
