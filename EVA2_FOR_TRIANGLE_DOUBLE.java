/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_triangle_double;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_TRIANGLE_DOUBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 10; i+= 1) {
            System.out.println("*");
            for (int j = 0; j < i; j+= 1) {
                System.out.print("*");
                for (int k = 0; k < j && k > i; k+= 1) {
                    System.out.print("*");
                }
            }
        }
        for (int i = 10; i > 1; i-= 1) {
            System.out.println("*");
            for (int j = i; j > 0; j-= 1) {
                System.out.print("*");
                for (int k = j; k > 0 && i < k; k-=1) {
                    System.out.print("*");
                }
            }
        }
    }
    
}
