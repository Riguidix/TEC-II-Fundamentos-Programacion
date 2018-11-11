//-Imprimir los números entre 1 y 100 y mostrar su sumatoria
//	1 2 3 4 5 ... 100
//	resultado de la sumatoria = 1 + 2 + 3 + 4 + 5 + ... + 100
package eva2_for_09;

/**
 *
 * @author riguidix
 */
public class EVA2_FOR_09 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here 
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            j = j + i;

        }
        int n = 100;
        int gauss = (int) (n * ( n + 1 )) / 2 ;
        System.out.println(gauss);
//        n(n+1)/2.
        System.out.println(j);   
    }
    
}
