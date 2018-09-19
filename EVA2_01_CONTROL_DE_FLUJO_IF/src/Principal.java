
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float calificacion;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu calificación: ");
        calificacion = input.nextInt();
        
        /*
            OPERADORES CONDICIONALES
                == IGUALDAD DE
                = ASIGNACIÓN DE 
                <= MENOR O IGUAL DE
                >= MAYOR O IGUAL DE
                < MENOR DE
                > MAYOR DE
                != DIFERENTE DE
        */    
        if (calificacion >= 70) {
            if (calificacion < 75) {
                System.out.println("Apensas pasaste");
            } else {
                System.out.println("Pasaste");
            }
        } else {
            System.out.println("Has reprobado");
        }
    }
}
