
import java.util.Scanner;

/*
 * Escribir un programa que solicite las coordenadas de un punto (en un sistema cartesiano)
 * y determine a que cuadrante pertenece
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
        int X, Y;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor de X");
        X = input.nextInt();
        System.out.println("Introduce el valor de Y");
        Y = input.nextInt();
        
        if (X > 0 && Y > 0) {
            System.out.println("Las coordenadas son del primer cuadrante");
        } else if (X < 0 && Y > 0) {
            System.out.println("Las coordenadas son del segundo cuadrante");
        } else if (X < 0 && Y < 0) {
            System.out.println("Las coordenadas son del tercer cuadrante");
        } else if (X > 0 && Y < 0) {
            System.out.println("Las coordenadas son del cuarto cuadrante");
        } else {
            System.out.println("Las coordenadas son del origen");
        }
    }    
}
