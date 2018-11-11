
import java.util.Scanner;

/*
 * Escribir un programa que revise si el numero es par o impar
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
        
        System.out.println("Introduzca el numero a evaluar");
        iVal = input.nextInt();
        
        if (iVal % 2 == 0) {
            System.out.println("El valor es par");
        } else {
            System.out.println("El valor es impar");
        }
    }
    
}
