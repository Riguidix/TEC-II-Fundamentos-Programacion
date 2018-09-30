
import java.util.Scanner;


/**
 * Construir un programa que permita calcular el número de metros cúbicos de agua que fluyen por una tubería
 *  Solicitar al usuario el radio de la tubería
 *  Solicitar la velocidad del flujo de agua en m/s.
 *  Mostrar la cantidad de m3 que fluyen por la tubería
 * 
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Q = v * A
        
        Donde
            Q es el caudal en m3 / s
            v es la velocidad m/s
            A es el area de la seccion transversal de la tuberia m2
                Siendo para encontrar que A = pi * r ^ 2
        */
//        Constantes
        final float PI = (float) Math.PI;
//        Variables
        float radio, velocidad, caudal, area;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el radio de la tuberia");
        radio = input.nextFloat(); 
        
        area = (float) (PI * (Math.pow(radio, 2)));
        
        System.out.println("Introduce la velocidad del flujo de agua en m/s");
        velocidad = input.nextFloat();
        
        caudal = velocidad * area;
        System.out.println("El valor de metros cubicos que fluyen por la tuberia es: " + caudal);

    }

}
