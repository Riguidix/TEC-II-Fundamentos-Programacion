//Imprimir su nombre el número de veces que el usuario quiera.
package eva2_for_2;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int manyTimes;
        String name;

        System.out.println("Introduce el nombre a imprimir");
        name = input.nextLine();        
        System.out.println("Introduce las veces a imprimir el nombre");
        manyTimes = input.nextInt();

        
        for (int i = 1; i <= manyTimes; i++) {
            System.out.println(i + ": " + name);
        }
        
    }
    
}
