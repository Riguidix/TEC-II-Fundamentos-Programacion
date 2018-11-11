
import java.util.Scanner;

/*
 * Escribir un programa que determine si un numero es positivo o negativo
 */

/**
 *
 * @author riguidix
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iVal;
        
        System.out.println("Introduzca el valor a evaluar");
        iVal = input.nextInt();
        
        if (iVal > 0) {
            System.out.println("El valor es positivo");
        } else {
            if (iVal < 0) {
                System.out.println("El valor es negativo");
            } else {
                System.out.println("El valor es neutro, 0");
            }
        }
    }  
}
