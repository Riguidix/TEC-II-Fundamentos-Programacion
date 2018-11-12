
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    || El juego tendrá dos jugadores, la computadora y usted.
       
    || Usará un ciclo sin fin, en el cual usted decide cuando terminar (usted establezca el método que prefiera para terminar el ciclo)

    || Usted captura primero.

    || En  cada  partida  usted  introducirá  a  través  de  la  consola  con  que  va  a  jugar  (piedra,  papel  o  tijera).  Usted 
        determine como captura su juego (con texto, con números, con letras, ejemplo: piedra = 1, papel = 2, tijera = 3)

    || La  computadora  genera  su  partida  de  manera  aleatoria,  imprima  después  de  que  usted  haya  capturado  su jugada.

    || Determine quien ganó o si hubo empate. Reglas:
        Papel vence a Piedra
        Piedra vence a Tijera
        Tijera vence a Papel
*/
/**
 *
 * @author riguidix
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sPlayerPick; String sCpuPick = "";
        int cpuRandom;
        boolean draw;
        int winU = 0, winC = 0, winE = 0, veces = 0;
        while (true) {            
            veces++;
            draw = false;
            System.out.println("Escoge un valor: \n 1) Tijeras \n 2) Piedra \n 3) Papel \n 4) Salir");
            sPlayerPick = input.nextLine().toLowerCase();
            if ("tijeras".equals(sPlayerPick) || "1".equals(sPlayerPick)) {
                System.out.println("Tomaste tijeras");
                sPlayerPick = "Tijeras";
            } else if ("piedra".equals(sPlayerPick) || "2".equals(sPlayerPick)) {
                System.out.println("Tomaste Piedra");
                sPlayerPick = "Piedra";
            } else if ("papel".equals(sPlayerPick) || "3".equals(sPlayerPick)) {
                System.out.println("Tomaste Papel");
                sPlayerPick = "Papel";
            } else if ("salir".equals(sPlayerPick) || "4".equals(sPlayerPick)) { 
                System.out.print("Saliendo del programa");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.print(".");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("");
                break;
            } else {
                System.out.println("Jugaras con TIJERAS por no usar correctamente las opciones");
                sPlayerPick = "Tijeras";
            }
            
            cpuRandom = (int) (Math.random() * 9 + 1);
            if (cpuRandom <= 3) {
//                System.out.println("CPU es igual a Piedra");
                sCpuPick = "Piedra";
            } else if (cpuRandom <= 6) {
//                System.out.println("CPU es igual a Papel");
                sCpuPick = "Papel";
            } else if (cpuRandom <= 9) {
//                System.out.println("CPU es igual a Tijeras");
                sCpuPick = "Tijeras";
            } else {
                System.out.println("La computadora se ha confundido, has ganado por default");
            }
            
            // Llamando a el metodo TIE para administrar si existe empate
            tie(sPlayerPick, sCpuPick, draw, input);
            
            if (draw) {
                System.out.println("Empate");
            } else {
                if ("Tijeras".equals(sCpuPick) && "Papel".equals(sPlayerPick)) {
                    System.out.println("'Tijeras' ha ganado cortando 'Papel'");
                    System.out.println("Te ha ganado la maquina");
                    winC++;
                    blankspace();
                } else if ("Tijeras".equals(sPlayerPick) && "Papel".equals(sCpuPick)) {
                    System.out.println("'Tijeras' ha ganado cortando 'Papel'");
                    System.out.println("Le has ganado a la maquina");
                    winU++;
                    blankspace();
                } else if ("Piedra".equals(sCpuPick) && "Tijeras".equals(sPlayerPick)) {
                    System.out.println("'Piedra' ha ganado destruyendo 'Tijeras'");
                    System.out.println("Te ha ganado la maquina");
                    winC++;
                    blankspace();
                } else if ("Piedra".equals(sPlayerPick) && "Tijeras".equals(sCpuPick)) {
                    System.out.println("'Piedra' ha ganado destruyendo 'Tijeras'");
                    System.out.println("Le has ganado a la maquina");
                    winU++;
                    blankspace();
                } else if ("Papel".equals(sCpuPick) && "Piedra".equals(sPlayerPick)) {
                    System.out.println("'Papel' ha ganado cubriendo a 'Piedra'");
                    System.out.println("Te ha ganado la maquina");
                    winC++;
                    blankspace();
                } else if ("Papel".equals(sPlayerPick) && "Piedra".equals(sCpuPick)) {
                    System.out.println("'Papel' ha ganado cubriendo a 'Piedra'");
                    System.out.println("Le has ganado a la maquina");
                    winU++;
                    blankspace();
                }
            }
            winE = veces - (winC + winU);
            System.out.println("La maquina ha ganado " + winC + " veces");
            System.out.println("El usuario ha ganado " + winU + " veces");
            System.out.println("Han habido " + winE + " empates");
            System.out.println("");
        }
    }
    
    // Metodo para crear un espaciado de consola
    public static String blankspace() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
        return null;
    }
    
    
    // Metodo que sirve para saber si empataron
    public static boolean tie(String user, String cpu, boolean empate, Scanner scanner) {
        if (user.equals(cpu)) {
            blankspace();
            System.out.println("Empate");
            empate = true;
        }
        return empate;
    }
}