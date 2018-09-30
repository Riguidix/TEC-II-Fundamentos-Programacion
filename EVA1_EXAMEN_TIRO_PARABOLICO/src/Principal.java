
import java.util.Scanner;
 
/**
 *  Construir un programa que permita conocer a que distancia caerá un objeto disparado con un cañón, el cual 
 *  tiene un ángulo de 45 grados:
 *      Solicitar al usuario la velocidad inicial en m/s.
 *      Mostrar al usuario:
 *          La altura máxima 
 *          La distancia que alcanza el objeto al caer
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
//      Constantes
            final double GRAVEDAD = 9.807;
            final double ANGULO = 45;
            final double ANGULORAD = Math.toRadians(ANGULO);    
            final double SENANGULO = Math.sin(ANGULORAD);
            final double COSANGULO = Math.cos(ANGULORAD);
            
//      Variables
            Scanner input = new Scanner(System.in);
            double velInicial, velInicialY, velInicialX, tiempo, altura, alturaMax, distancia, distanciaMax;
            
            System.out.println("Ingresa el valor de la velocidad inicial (m/s)");
            velInicial = input.nextFloat();
           
            alturaMax = ((Math.pow(velInicial, 2)) * (Math.pow(SENANGULO, 2))) / (2 * GRAVEDAD);
            distancia = ((Math.pow(velInicial, 2)) * (Math.sin(2 * ANGULORAD)) ) / GRAVEDAD;
            tiempo = ((2 * velInicial) * (SENANGULO)) / GRAVEDAD;
            
            System.out.println("La altura maxima es: " + alturaMax);
            System.out.println("La distancia que alcanza el objeto al caer es de: " + distancia);
            
            
            
    }

}
