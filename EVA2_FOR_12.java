//-Imprimir n cantidad de asteriscos (según un valor solicitado al usuario):
//	Ejemplo: introduce "5", se imprime --> *****
package eva2_for_12;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valorUsuario;
        
        System.out.println("Intorudce la cantidad de asteriscos a imprimir");
        valorUsuario = input.nextInt();
        
        for (int i = 1; i <= valorUsuario; i++) {
            System.out.print("*");
        }
    }
    
}
