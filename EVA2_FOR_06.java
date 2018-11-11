//-Imprimir los múltiplos de 5 entre 0 y 100
package eva2_for_06;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
