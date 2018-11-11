
import java.util.Scanner;

/*
 * Escribir un programa que lea la temperatura en grados centigrados, y muestre
 * un mensaje acorde a la temperatura
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
        int iTemperatura;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca la temperatura");
        iTemperatura = input.nextInt();
        
        if (iTemperatura <= 0) {
            System.out.println("Freezing Weather");
        } else if (iTemperatura <= 10) {
            System.out.println("Very Cold Weather");
        } else if (iTemperatura <= 20) {
            System.out.println("Cold Weather");
        } else if (iTemperatura <= 30) {
            System.out.println("Normal in Temp");
        } else if (iTemperatura <= 40) {
            System.out.println("It's Hot");
        } else if (iTemperatura >= 40) {
            System.out.println("It's very Hot");
        }
    }
    
}
