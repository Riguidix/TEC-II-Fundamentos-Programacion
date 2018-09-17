/*
 * @author Reydescel Herrera
 * @matricula 18550937
 */

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iNum1, iDen1, iNum2, iDen2;
        int x, y;
        
        System.out.println("Introduzca el numerador de la fraccion 1");
        iNum1 = input.nextInt();
        System.out.println("Introduzca el denominador de la fraccion 1");
        iDen1 = input.nextInt();
        System.out.println("Introduzca el numerador de la fraccion 2");
        iNum2 = input.nextInt();
        System.out.println("Introduzca el denominador de la fraccion 2");
        iDen2 = input.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        
        
        
// Suma 
    // Numerador
        x = (iNum1 * iDen2) + (iNum2 * iDen1);
    // Denominador
        y = iDen1 * iDen2;
        
        System.out.println("El resultado de la suma es: " + x + "/" + y);
//  Resta
    // Numerador
        x = (iNum1 * iDen2) - (iNum2 * iDen1);
    // Denominador
        y = iDen1 * iDen2;
        
        System.out.println("El resultado de la resta es: " + x + "/" + y);
//  Multiplicacion
    // Numerador
        x = iNum1 * iNum2;
    // Denominador
        y = iDen1 * iDen2;
        
        System.out.println("El resultado de la multiplicacion es: " + x + "/" + y);
//  Division
    // Numerador
        x = iNum1 * iDen2;
    // Denominador
        y = iDen1 * iNum2;
        
        System.out.println("El resultado de la resta es: " + x + "/" + y);
    }

}
