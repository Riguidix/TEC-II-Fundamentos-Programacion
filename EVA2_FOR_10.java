//-Pedir un número al usuario e imprimir la misma cantidad de asteriscos "*"
package eva2_for_10;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iVeces = 0;
        
        System.out.println("Introduce el numero de veces a imprimir");
        iVeces = input.nextInt();
        for (int i = 0; i < iVeces; i++) {
            System.out.print("*");
        }
        
    }
    
}
