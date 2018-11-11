/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_encontrar_numero;

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
        int iNumAleatorio = (int) (Math.random() * 10) + 1;
        int user;
        
        System.out.println("Ingresa y encuentra el numero aleatorio entre 1 y 10");
        for (int i = 1; i <= 3; i++) {
            user = input.nextInt();
            if (user == iNumAleatorio) {
                System.out.println("Has encontrado el numero aleatorio");
                break;
            } else {
                if (user < iNumAleatorio) {
                    System.out.println("Estas debajo del numero");
                } else {
                    System.out.println("Estas arriba del numero");
                }
            }
            if (i == 3) {
                System.out.println("Has agotado las oportunidades");
                break;
            }
            System.out.println("No has adivinado, intenta de nuevo");
        }
    }
}
