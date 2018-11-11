/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_break_continue;

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
        // REGLAS DEL FOR
        // For : No manipular la variable contador
        
        // BREAK
        for (int i = 1; i < 10; i++) {
            // Detener el for cuando se encuentre un numero divisible entre si
            System.out.println(i);
            if (i % 5 == 0) {
                System.out.println("Este numero " + i + " es divisible entre 5");
                for (int j = 0; j < 2; j++) {
                    System.out.println("         ");
                }
                break; // Interrumpe la logica del programa
            }
            
        }
        
        // CONTINUE
        for (int i = 1; i < 10; i++) {
            // Detener el for cuando se encuentre un numero divisible entre si
            if (i % 5 == 0) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("         ");
                }
                continue; // Interrumpe la logica del programa
            }
            System.out.println(i);
        }
    }
}
