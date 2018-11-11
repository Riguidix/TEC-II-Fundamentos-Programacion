/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_19_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String user = "";
        
        while (!"X".equals(user.toUpperCase())) {            
            System.out.println("Introduce un mensaje (X para salir)");
            user = input.nextLine();
            System.out.println("Tu mensaje es: " + user);
        }
    }
    
}
