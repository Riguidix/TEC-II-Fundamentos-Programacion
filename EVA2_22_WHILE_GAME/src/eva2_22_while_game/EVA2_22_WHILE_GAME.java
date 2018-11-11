/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_while_game;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_22_WHILE_GAME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // GENERAR EL NUMERO 1 Y 10
        // NO DEJEN TERMINAR AL USUARIO HASTA QUE ADIVINE
        Scanner input = new Scanner(System.in);
        
        int iRandom = (int) (Math.random() * 10);
        
        if (iRandom == 0) {
            iRandom = (int) (Math.random() * 1);
        }
        
        int userValue = 0;
        int intentos = 0;
        
        
        System.out.println("Adivina el numero del 1 al 10");
        System.out.println(iRandom);
        while (userValue != iRandom) {            
            System.out.println("Introduce el numero para adivinar");
            userValue = input.nextInt();
            if (userValue > iRandom) {
                System.out.println("Te has pasado");
            } else if (userValue < iRandom){
                System.out.println("Te falta poco");
            }
            
            for (int i = 0; i < 3; i++) {
                System.out.println(" ");
            }
            intentos++;
        }
        System.out.println("Has ganado, adivinaste el numero en " + intentos + " intentos.");
    }
    
}
