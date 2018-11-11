//-Pedir un número entero al usuario,
//luego imprimir los números del 1 al 100 que no sean divisibles entre el número proporcionado.
package eva2_for_11;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valorUsuario;
        
        System.out.println("Introduce un numero entero");
        valorUsuario = input.nextInt();

        for (int i = 1; i < 100; i++) {
            if (i % valorUsuario != 0) {
                System.out.println(i);
            }
        }
    }
}
