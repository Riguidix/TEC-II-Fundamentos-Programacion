/*-Imprimir los números entre 100 y 1:
//	asi: 
//	100
//	99	
//	98
//	...
//	y después así: 100 - 99 - 98 ... 1
*/
package eva2_for_04;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        
        for (int i = 100; i > 1; i--) {
            System.out.print(i);
            System.out.print(" - ");
        }
    }
    
}
