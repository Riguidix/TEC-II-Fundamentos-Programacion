/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_while_02;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_WHILE_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String user, password;
        int i = 0;
        user = "PedroPepe";
        password = "asdfg123";
        
        while (i < 3) {            
            System.out.println("Ingresa el usuario");
            String checkUser = input.nextLine();
            System.out.println("Ingresa la contrasena");
            String checkPass = input.nextLine();
            
            if (checkUser.equals(user) && checkPass.equals(password)) {
                System.out.println("Bienvenido");
                break;
            } else {
                System.out.println("Acceso Denegado");
                i++;
            }
        }
    }
}
