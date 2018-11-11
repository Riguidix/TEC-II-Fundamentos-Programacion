
import java.util.Scanner;

/*
 * Escribir un programa que pida tres valores entero, y determine cual es el
 * mas grande de los tres
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
        int a, b, c;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el primer valor a evaluar");
        a = input.nextInt();
        System.out.println("Introduzca el segundo valor a evaluar");
        b = input.nextInt();
        System.out.println("Introduzca el tercer valor a evaluar");
        c = input.nextInt();
        
        if (a > b) {
            if (a > c) {
                System.out.println( a + " es el mayor");
            } else {
                // a menor que c
                System.out.println(c + " es el mayor");
            }
        } else {
            // a menor que b
            if (b > c) {
                System.out.println(b + " es el mayor");
            } else {
                // b menor que c
                System.out.println(c + " es el mayor");
            }
        }
    }
    
}
