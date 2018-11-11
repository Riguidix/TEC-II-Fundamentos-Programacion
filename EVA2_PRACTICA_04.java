
import java.util.Scanner;

/*
 * Escribir un programa que lea un valor entero, y muestre un valor de "1" si el
 * valor es mayor que cero, muestre "0" si es igual a cero, y "-1" si el valor es menor que cero
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
            System.out.println("1");
        } else {
            if (iVal < 0) {
                System.out.println("-1");
            } else {
                System.out.println("0");
            }
        }
    }
}
