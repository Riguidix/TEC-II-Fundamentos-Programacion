
package eva1_8_formula_distancia;

import java.util.Scanner;

/**
 *
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class EVA1_8_FORMULA_DISTANCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        d = ((vf + vi) / 2) * t
        float velInicial;
        float velFinal;
        float distancia;
        float time;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa la velocidad inicial [kilometros/hora]");
        velInicial = input.nextFloat();
        System.out.println("Ingresa la velocidad final [kilometros/hora]");
        velFinal = input.nextFloat();
        System.out.println("Ingresa el tiempo [horas]");
        time = input.nextFloat();
        
        distancia = ((velInicial + velFinal) / 2) * time;
        System.out.println("Distancia es: " + distancia + " km");
        
    }

}
