
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
                float media;
        int sumatoria = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la primer edad");
        sumatoria += input.nextInt();
        System.out.println("Ingresa la segunda edad");
        sumatoria += input.nextInt();
        System.out.println("Ingresa la tercera edad");
        sumatoria += input.nextInt();
        System.out.println("Ingresa la cuarta edad");
        sumatoria += input.nextInt();
        System.out.println("Ingresa la quinta edad");
        sumatoria += input.nextInt();

        media = (float) sumatoria / 5;
        System.out.println("El valor de la media es: " + media);
    }
    
}
