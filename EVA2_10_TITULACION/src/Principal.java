
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        boolean bResidencia, bServicio, bMaterias;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Has terminado tus residencias? [S/N]");
        bResidencia = input.nextBoolean();
        System.out.println("Has terminado tus servicio? [S/N]");
        bServicio  = input.nextBoolean();
        System.out.println("Has terminado tus materias? [S/N]");
        bMaterias  = input.nextBoolean();

        if (bResidencia && bServicio && bMaterias) {
            System.out.println("Puedes Titularte");
        } else {
            if (bResidencia && bServicio) {
                System.out.println("Tienes materias pendientes");
            } else if (bResidencia && bMaterias) {
                System.out.println("No has acabado tu servicio");
            } else if (bServicio && bMaterias) {
                System.out.println("No has acabado tus residencias");
            } else {
                System.out.println("El sistema no te quiere >:D");
            }
        }
        
    }
    
}
