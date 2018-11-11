/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_perpetual;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riguidix
 */
public class EVA2_20_WHILE_PERPETUAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println("Si miras este mensaje se trabo tu computadora");
            } catch (InterruptedException ex) {
                Logger.getLogger(EVA2_20_WHILE_PERPETUAL.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
