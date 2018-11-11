
import java.util.Scanner;

/*
 * Escribir un programa que determine la elegibilidad de admitir a un estudiante a un curso
 * basado en sus calificaciones. Seguir los siguientes criterios
    * Criterio 1:
        Puntos en matematicas >= 65
        Puntos en fisica >= 55
        Puntos en Quimica >= 50
        Total en las tres materias >= 180
    * Criterio 2:
        Puntos en matematicas >= 65
        Total en matematicas mas las otras materias >= 140
 */

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
        int iCalMat, iCalFis, iCalQuim;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca su calificacion en Matematicas");
        iCalMat = input.nextInt();
        System.out.println("Introduzca su calificacion en Fisica");
        iCalFis = input.nextInt();
        System.out.println("Introduzca su calificacion en Quimica");
        iCalQuim = input.nextInt();
        
        if (iCalMat >= 65 && iCalFis >= 55 && iCalQuim >= 50 && (iCalMat + iCalFis + iCalQuim) >= 180 ) {
            if (iCalMat >= 65 && (iCalMat + iCalQuim + iCalFis) >= 140) {
                System.out.println("Estas calificado para la admision");
            }
        } else {
            System.out.println("No eres calificado para admision");
        }
        
/////////////////////////// Teachers CODE
//        int suma = iCalMat + iCalFis + iCalQuim;
//        if (((iCalMat >= 65) && (iCalFis >= 55) && (iCalQuim >= 50) && (suma >= 180)) && ( (iCalMat >= 65) && (suma >= 140))) {
//            System.out.println("ACEPTADO");
//        } else {
//            System.out.println("INTENTALO DESPUES");
//        }
///////////////////////////
    }
    
}
