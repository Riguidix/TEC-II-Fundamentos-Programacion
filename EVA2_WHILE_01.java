
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
        Scanner input = new Scanner(System.in);
        int userHand = 0;
        int cpuHand = 0;
        boolean UserWantOne = true;
        boolean CpuWantOne = true;
        String userAnswer;
        int cpuAnswer;
        boolean gameStart = true;
        
        int randomCard = 0;
        
        while (true) {   
            
            if (gameStart) {
                for (int i = 0; i <= 1 ; i++) {
                    randomCard = (int) (Math.random() * 14 + 1);
                    userHand += randomCard;
                    randomCard = (int) (Math.random() * 14 + 1);
                    cpuHand += randomCard;
                }
            }
            
            System.out.println("Tu cuenta es: " + userHand);
            
            
                if (userHand == 21 || (userHand > cpuHand && userHand <= 21 && !CpuWantOne && !UserWantOne) ||(cpuHand > 21 && userHand < 21)) {
                    System.out.println("Tu mano fue: " + userHand + ", y la de la maquina es: " + cpuHand);
                    System.out.println("Has ganado");
                    gameStart = true;
                    break;
                } else if (cpuHand == 21 || (cpuHand > userHand && cpuHand <= 21 && !CpuWantOne && !UserWantOne) || (userHand > 21 && cpuHand < 21)) {
                    System.out.println("Tu mano fue: " + userHand + ", y la de la maquina es: " + cpuHand);
                    System.out.println("Te han ganado");                    
                    gameStart = true;
                    break;
                } else if (cpuHand > 21 && userHand > 21) {
                    System.out.println("Tu mano fue: " + userHand + ", y la de la maquina es: " + cpuHand);
                    System.out.println("ambos pierden");
                    break;
                } else if (cpuHand == userHand) {
                    System.out.println("Ha sido un empate");
                    System.out.println("Ambos llegaron a: " + userHand);
                    break;
                }
            
            
            if (UserWantOne) {
                System.out.println("Usuario quieres una carta? [S/N]");
                userAnswer = input.nextLine();
                if ("S".equals(userAnswer.toUpperCase())) {
                    UserWantOne = true;
                    userHand += (int) (Math.random() * 14 + 1);
                } else {
                    UserWantOne = false;
                }
            }
            
            
            if (CpuWantOne) {
                System.out.println("CPU quieres una carta");
                cpuAnswer = (int) (Math.random() * 10 + 1);
                // System.out.println("CpuHand es: " + cpuHand);
                if (cpuHand <= 17) {
                    CpuWantOne = true;
                    cpuHand += (int) (Math.random() * 14 + 1);
                    // System.out.println("CpuHand es: " + cpuHand);
                }else {
                    CpuWantOne = false; 
                }

            }
            
            gameStart = false;

        }
    }
}
