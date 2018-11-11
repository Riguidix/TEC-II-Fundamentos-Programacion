
import java.util.Scanner;

/*
 * Escribir un programa que acepte dos enteros y verifique si los numeros son 
 * iguales o no
 * 15 es igual a 15...
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
        int iVal, iVal2;
        
        System.out.println("Introduce el primer valor");
        iVal = input.nextInt();
        System.out.println("Introduce el segundo valor");
        iVal2 = input.nextInt();
        
        if (iVal == iVal2) {
            System.out.println("El valor " + iVal + " es igual a el valor " + iVal2);
        } else {
            System.out.println("Los valores son diferentes");
        }
        
    }
    
}
