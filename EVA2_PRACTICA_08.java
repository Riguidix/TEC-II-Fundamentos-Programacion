
import java.util.Scanner;

/*
 * Escribir un programa que determine si un triangulo es equilatero, isoceles o escaleno
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
        
        System.out.println("Introduzca el primer valor");
        a = input.nextInt();
        System.out.println("Introduzca el segundo valor");
        b = input.nextInt();
        System.out.println("Introduzca el tercer valor");
        c = input.nextInt();
        
        // Equilatero
        if (a == b && a == c ) {
            System.out.println("El triangulo es Equilatero");
        } else if (a == b && b != c || b == c && c != a || a == c && c != b) {
        // Isoceles    
            System.out.println("El triangulo es Isoceles");
        } else if (a != b && b != c && c != a) {
        // Escaleno
            System.out.println("El triangulo es escaleno");
        }        
    }   
}
