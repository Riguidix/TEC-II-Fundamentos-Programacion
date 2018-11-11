
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        float media;
        int sumatoria;
        sumatoria = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la edad " + i + " a evaluar: ");
            sumatoria += input.nextInt();
        }
        
        media = (float) sumatoria / 5;
        System.out.println("El valor de la media es: " + media);
        
        // Teacher Code
        // Scanner input = new Scanner(System.in);
        sumatoria = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Edad " + i + ": ");
            sumatoria = sumatoria + input.nextInt();
        }
        media = (float) sumatoria / 5;
        System.out.println("La media es: " + media);
    }   
}
