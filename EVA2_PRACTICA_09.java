
import java.util.Scanner;

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
        int iA, iB, iC;
        double resultado1, resultado2;
        // b ^ 2 - 4ac > 0 RAICES DIFERENTES
        // b ^ 2 - 4ac == 0 Solo entrega una raiz
        // b ^ 2 - 4ac < 0 RAICES NEGATIVAS
        double discriminante = 0;
        
        System.out.println("Introduce el valor de A");
        iA = input.nextInt();
        System.out.println("introduce el valor de B");
        iB = input.nextInt();
        System.out.println("introduce el valor de C");
        iC = input.nextInt();
        
        // DISCRIMINANTE
        discriminante = (Math.pow(iB, 2)) - (4 * iA * iC);
        if (discriminante > 0) {
            // Se obtienen dos raices reales diferentes
            resultado1 = (-iB + Math.sqrt(discriminante)) / (2 * iA);
            resultado2 = (-iB - Math.sqrt(discriminante)) / (2 * iA);
            System.out.println("El valor de X1 es: " + resultado1 + ", el valor de X2 es: " + resultado2);
        } else if (discriminante == 0) {
            // Se obtienen dos raices reales iguales(Una solucion)
            resultado1 = (-iB + Math.sqrt(discriminante)) / (2 * iA);
            System.out.println("El valor de X1 y X2 es: " + resultado1);
        } else if (discriminante < 0) {
            // Se obtienen dos raices imaginarias diferentes
            System.out.println("La raiz es negativa, por lo tanto dara un valor i(imaginario)");
        } else {
            System.out.println("Ocurrio algo fuera del programa");
        }
        
        // FORMULA GENERAL
        // (- b +/- raiz(b^2 - 4ac))/2*a
        
    }
    
}
