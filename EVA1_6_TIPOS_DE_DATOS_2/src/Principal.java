
import java.util.Scanner;

/**
 *
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Capturar datos de una persona e imprimirlo
            - nombre
            - edad
            - genero
            - estatura
            - peso
            - nacionalidad 
            - estado civil
            - curp
            - estado
            - ciudad
        */
        
        // Inicializando todos los valores
        String sName;
        int iAge;
        String sGenero;
        float dHeight;
        float dWeight;
        String sNationality;
        String sStatus;
        String sCurp;
        String sState;
        String sCity;
        
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Introduzca su nombre: ");
        sName = input.nextLine();
        
        System.out.println("Introduzca su genero [M/F]: ");
        sGenero = input.nextLine();
        
        System.out.println("Introduzca su nacionalidad");
        sNationality = input.nextLine();

        System.out.println("Introduzca su estado civil");
        sStatus = input.nextLine();
        
        System.out.println("Introduzca su curp");
        sCurp = input.nextLine();
        
        System.out.println("Introduzca su estado");
        sState = input.nextLine();
        
        System.out.println("Introduzca su ciudad");
        sCity = input.nextLine();        
                
        System.out.println("Introduzca su edad: ");
        iAge = input.nextInt();

        System.out.println("Introduzca su altura");
        dHeight = input.nextFloat();
        
        System.out.println("Introduzca su peso");
        dWeight = input.nextFloat();
        
// Crea un espacio en blanco :)
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }
        
        System.out.println("Su nombre es: " + sName.toUpperCase() + ".");
        System.out.println("Su edad es: " + iAge + ".");
        System.out.println("Su genero es: " + sGenero.toUpperCase() + ".");
        System.out.println("Su nacionalidad es: " + sNationality.toUpperCase() + ".");
        System.out.println("Su estado civil es: " + sStatus.toUpperCase() + ".");     
        System.out.println("Su curp es: " + sCurp.toUpperCase() + ".");
        System.out.println("Su estado es:" + sState.toUpperCase() + ".");
        System.out.println("Su ciudad es: " + sCity.toUpperCase() + "."); 
        System.out.println("Su altura es: " + dHeight + ".");
        System.out.println("Su peso es: " + dWeight + ".");



    }

}
