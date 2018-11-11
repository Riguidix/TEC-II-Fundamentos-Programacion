/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_09_annio_bisiesto_02;

import java.util.Scanner;

/**
 *
 * @author riguidix
 */
public class EVA2_09_ANNIO_BISIESTO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valueUser;

        System.out.println("Ingresa el año ha evaluar");
        valueUser = input.nextInt();

        if (valueUser % 400 == 0 && valueUser % 100 == 0 || valueUser % 4 == 0 && valueUser % 100 != 0) {
            System.out.println("Anio Bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
    
}
