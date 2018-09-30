
import java.util.Scanner;

/**
 *  Utilizando una de las dos fórmulas canónicas de la hipérbola 
 * (seleccione cualquiera de las dos, vertical u horizontal):
 *  Solicite al usuario los datos de la fórmula (centro y divisores)
 *      De como resultado:
 *          Distancia del centro al foco.
 *          Las coordenadas de los vértices.
 *          Las coordenadas de los focos.
 * 
 * @author Reydescel Herrera
 * @matricula 18550937
 */

// ======================= HIPERBOLA HORIZONTAL =====================================

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
//        Variables
        double focoX, focoY, focoXPrima, focoYPrima, verticeX, verticeY, verticeXPrima, verticeYPrima, excentricidad;
        double ejeTransverso, ejeConjugado, semiEjeTransverso, semiEjeConjugado, distanciaFocal, ladoRecto; 
        double centroX, centroY;
        
        System.out.println("Introduce el valor del centro");
        System.out.println("Introduce su valor de X");
        centroX = input.nextFloat();
        System.out.println("Introduce su valor de Y");
        centroY = input.nextFloat();
        
        System.out.println("Introduce los valores de los divisores");
        System.out.println("Introduce el semi eje transverso (a)");
        semiEjeTransverso = input.nextFloat();
        System.out.println("Introduce el semi eje conjugado (b)");
        semiEjeConjugado = input.nextFloat();
        
        // V V' = 2a
        ejeTransverso = 2 * semiEjeTransverso;
        // B B' = 2b
        ejeConjugado = 2 * semiEjeConjugado;
        // C = Sqrt(a^2 + b^2)  
        distanciaFocal = Math.sqrt((Math.pow(semiEjeTransverso, 2))+(Math.pow(semiEjeConjugado, 2)));
        // LR = 2b^2 / a
        ladoRecto = (2 * (Math.pow(semiEjeConjugado, 2))) / semiEjeTransverso;
        // e = c / a || e = Sqrt(a^2 + b^2) / a
        excentricidad = distanciaFocal / semiEjeTransverso;
        
        //  Coordenadas
            // Vertices
            verticeX = centroX + semiEjeTransverso;
            verticeY = centroY;
            verticeXPrima = centroX - semiEjeTransverso;
            verticeYPrima = centroY;
            // Focos
            focoX = centroX + distanciaFocal;
            focoY = centroY;
            focoXPrima = centroX - distanciaFocal;
            focoYPrima = centroY;
        
        System.out.println("La distancia del centro al foco es de: " + distanciaFocal);
        System.out.println("Las coordenadas de el vertice es: X = " + verticeX + " Y = " + verticeY);
        System.out.println("Las coordenadas de el vertice prima es: X = " + verticeXPrima + " Y = " + verticeYPrima);
        System.out.println("Las coordenadas de el foco es: X = " + focoX + " Y = " + focoY);
        System.out.println("Las coordenadas de el foco prima es: X = " + focoXPrima + " Y = " + focoYPrima);
        
        
        
    }

}
