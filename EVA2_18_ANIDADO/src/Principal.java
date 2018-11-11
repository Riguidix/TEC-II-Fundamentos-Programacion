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
        int iContador = 0;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                iContador++;
                System.out.println(i + "," + j);
            }  
        }
        
        System.out.println(iContador);
    }
}
