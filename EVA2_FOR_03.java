/*
//-Imprimir los números entre 1 y 100:
//	asi: 
//	1
//	2	
//	3
//	...
//	y después así: 1 - 2 - 3 - 4 - 5 - 6 - ... 100
*/
package eva2_for_03;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        for (int i = 1; i < 100; i++) {
            System.out.print(i);
            System.out.print(" - ");
        }
    }
    
}
