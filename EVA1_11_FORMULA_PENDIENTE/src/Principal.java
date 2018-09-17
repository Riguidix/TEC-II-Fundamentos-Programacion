
import java.util.Scanner;

/**
 *
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // m = y2 - y1  / x2 - x1
        int pendiente, y1, y2, x1, x2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa la primer coordenada, valor de X: ");
        x1 = input.nextInt();
        System.out.println("Ingresa la primer coordenada, valor de Y: ");
        y1 = input.nextInt();
        
        System.out.println("Ingresa la segunda coordenada, valor de X: ");
        x2 = input.nextInt();
        System.out.println("Ingresa la segunda coordenada, valor de Y: ");
        y2 = input.nextInt();
        
        pendiente = (y2 - y1) / (x2 - x1);
        System.out.println("El valor de la pendiente es: " + pendiente);
        
    }

}
