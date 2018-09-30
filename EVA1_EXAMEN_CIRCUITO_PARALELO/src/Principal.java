
import java.util.Scanner;

/**
 * Construir un programa para calcular los datos de un circuito eléctrico, se tomarán en cuenta 5 resistencias 
 * conectadas en paralelo:
 *      Capturar los valores de las resistencias desde el teclado.
 *      Capturar el voltaje.
 *      Mostrar al usuario: 
 *          Resistencia equivalente
 *          Intensidad de corriente
 *          Intensidad de la corriente en cada resistencia
 * 
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
//        Variables
        double res1, res2, res3, res4, res5, voltaje, resEquivalente, intTotal, int1, int2, int3, int4, int5;
        
        System.out.println("Introduzca el valor de la primer resistencia");
        res1 = input.nextFloat();
        System.out.println("Introduzca el valor de la segunda resistencia");
        res2 = input.nextFloat();
        System.out.println("Introduzca el valor de la tercera resistencia");
        res3 = input.nextFloat();
        System.out.println("Introduzca el valor de la cuarta resistencia");
        res4 = input.nextFloat();
        System.out.println("Introduzca el valor de la quinta resistencia");
        res5 = input.nextFloat();
        System.out.println("Introduzca el valor de el voltaje");
        voltaje = input.nextFloat();
              
        int1 = voltaje / res1;
        int2 = voltaje / res2;
        int3 = voltaje / res3;
        int4 = voltaje / res4;
        int5 = voltaje / res5;
        intTotal = int1 + int2 + int3 + int4 + int5;
        
    // Es igual que usar la formula de Rt = 1 / 1/r1 + 1/r2 + 1/r3 ... 1/rn
        resEquivalente = voltaje / intTotal;
        
        System.out.println("El voltaje total es: " + voltaje);
        System.out.println("La resistencia equivalente es: " + resEquivalente);
        System.out.println("La intensidad de corrientes es: " + intTotal);
        System.out.println("El valor de la intensidad en cada resistencia es\n"
                + " - resistencia 1 : " + int1 + "\n"
                + " - resistencia 2 : " + int2 + "\n"
                + " - resistencia 3 : " + int3 + "\n"
                + " - resistencia 4 : " + int4 + "\n"
                + " - resistencia 5 : " + int5 + "\n");
    }

}
