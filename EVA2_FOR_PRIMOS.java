package eva2_for_primos;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_PRIMOS {
    public static void main(String[] args) {
        // Verificar si un numero brindado por el usuario es primo o no,
        // Si es sencillamente imprimir 
        //"El numero" + userValue + " es primo", de lo contrario imprimir
        // "El numero" + userValue + " no es primo
        int userValue;
        boolean bFlagPrime = true;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo (mayor a 1)");
        userValue = input.nextInt();
        
        // Teacher's Code
        for (int i = 2; i < userValue; i++) {
            if ((userValue % i) == 0) {
                bFlagPrime = false;
                continue;
            }
        }
        
        if (bFlagPrime) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
