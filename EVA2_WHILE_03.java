/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_while_03;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_WHILE_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int userValue;
        Scanner input = new Scanner(System.in);
        String exit = "";
        boolean bFlagPrime = false;
        
        while (!exit.toUpperCase().equals("X")) {            
            System.out.println("");
            System.out.println("Introduce un numero entero positivo (mayor a 1)");
            userValue = input.nextInt();
            exit = input.nextLine();
            // Teacher's Code
            for (int i = 2; i < userValue; i++) {
                if ((userValue % i) == 0) {
                    bFlagPrime = false;
                    continue;
                }
            }

            if (bFlagPrime) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }           
            
            System.out.println("Si desea salir pulse 'X', si gusta reintentar teclee cualquier cosa diferente a 'X'");
            exit = input.nextLine();
            
        }
    }
}
