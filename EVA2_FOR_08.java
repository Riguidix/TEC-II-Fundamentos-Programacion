//-Imprimir 20 números aleatorios cuyo valor esté entre 1 y 100
package eva2_for_08;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 20; i++) {
            int iRandom = (int) (Math.random() * 100);
            System.out.println(iRandom);
        }
    }
    
}
