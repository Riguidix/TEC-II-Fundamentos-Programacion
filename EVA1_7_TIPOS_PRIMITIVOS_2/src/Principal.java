
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
            Capturar nombre del usuario String (texto)
            pedir su edad Int (entero)
            Calcular su fecha de nacimiento (año)
            año actual - fecha de nacimiento/edad
            Mostrar los resultados
        */
        String sName;
        int iAge;
        int iActualYear = 2018;
        int iBornDate;
        String birthday;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        sName = input.nextLine();

//        Comprobar si ya ha cumplido annios y si ya fue asi
//        corresponde a iBornDate = (iActualYear - 1) - iAge;

//        System.out.println("Ya has cumplido años este año?");
//        birthday = input.nextLine();
//        if (true) {
//            
//        } else {
//            
//        }
//        
        System.out.println("Introduce tu edad: ");
        iAge = input.nextInt();        
        iBornDate = iActualYear - iAge; 
        
        System.out.println("Tu nombre es: " + sName.toUpperCase() + '\n' + 
                "Tu año de nacimiento es: " + iBornDate);
    }
}