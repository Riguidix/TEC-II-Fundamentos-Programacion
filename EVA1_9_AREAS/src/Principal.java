
import java.util.Scanner;


/**
 *
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A = (a + b / 2) * h
        float area;
        float bMayor;
        float bMenor;
        float altura;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------- AREA DEL TRAPECIO ---------------");
        System.out.println("Introduce la base mayor");
        bMayor = input.nextFloat();
        System.out.println("Introduce la base menor");
        bMenor = input.nextFloat();
        System.out.println("Introduce la altura");
        altura = input.nextFloat();
        
        area = ((bMayor + bMenor) / 2) * altura;
        System.out.println("El área del Trapecio es: " + area);
        
    }

}
