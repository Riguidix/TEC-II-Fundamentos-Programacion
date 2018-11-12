import java.util.Scanner;

public class Main {
    // Casillas
    public static char c11 = ' ', c12 = ' ', c13 = ' ', c21 = ' ', c22 = ' ', c23 = ' ', c31 = ' ', c32 = ' ', c33 = ' ';
    public static boolean userWon = false, cpuWon = false;
    public static boolean game = false;
    public static int x = 0, y = 0;
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        String exit = "";
        while (!"exit".equals(exit.toLowerCase())) {            
            int random = (int) (Math.random() * 100 + 1);
            if (random > 50) {
                // Empieza el usuario
                while (!game) {
                    if (c11 != ' ' && c12 != ' ' && c13 != ' ' && c21 != ' ' && c22 != ' ' && c23 != ' ' && c31 != ' ' && c32 != ' ' && c33 != ' ' ) {
                        game = true;
                        break;
                    }
                    if ((c11 == 'O' && c12 == 'O' && c13 == 'O') || (c21 == 'O' && c22 == 'O' && c23 == 'O') || (c31 == 'O' && c32 == 'O' && c33 == 'O') || (c11 == 'O' && c21 == 'O' && c31 == 'O') || (c12 == 'O' && c22 == 'O' && c32 == 'O') || (c13 == 'O' && c23 == 'O' && c33 == 'O') || (c11 == 'O' && c22 == 'O' && c33 == 'O') || (c31 == 'O' && c22 == 'O' && c13 == 'O')) {
                    userWon = false;
                    cpuWon = true;
                    } else if ((c11 == 'X' && c12 == 'X' && c13 == 'X') || (c21 == 'X' && c22 == 'X' && c23 == 'X') || (c31 == 'X' && c32 == 'X' && c33 == 'X') || (c11 == 'X' && c21 == 'X' && c31 == 'X') || (c12 == 'X' && c22 == 'X' && c32 == 'X') || (c13 == 'X' && c23 == 'X' && c33 == 'X') || (c11 == 'X' && c22 == 'X' && c33 == 'X') || (c31 == 'X' && c22 == 'X' && c13 == 'X')) {
                    cpuWon = false;
                    userWon = true;            
                    }
                    if (userWon) {
                        System.out.println("El usuario ha ganado");
                        game = true;
                        break;
                    } else if (cpuWon) {
                        System.out.println("La maquina ha ganado");
                        game = true;
                        break;
                    }                    
                    userPlay();
                    cpuPlay();

                }
            } else {
                // Empieza la maquina
                while (!game ) {   
                    if (c11 != ' ' && c12 != ' ' && c13 != ' ' && c21 != ' ' && c22 != ' ' && c23 != ' ' && c31 != ' ' && c32 != ' ' && c33 != ' ' ) {
                        game = true;
                        break;
                    }
                    if ((c11 == 'O' && c12 == 'O' && c13 == 'O') || (c21 == 'O' && c22 == 'O' && c23 == 'O') || (c31 == 'O' && c32 == 'O' && c33 == 'O') || (c11 == 'O' && c21 == 'O' && c31 == 'O') || (c12 == 'O' && c22 == 'O' && c32 == 'O') || (c13 == 'O' && c23 == 'O' && c33 == 'O') || (c11 == 'O' && c22 == 'O' && c33 == 'O') || (c31 == 'O' && c22 == 'O' && c13 == 'O')) {
                    userWon = false;
                    cpuWon = true;
                    } else if ((c11 == 'X' && c12 == 'X' && c13 == 'X') || (c21 == 'X' && c22 == 'X' && c23 == 'X') || (c31 == 'X' && c32 == 'X' && c33 == 'X') || (c11 == 'X' && c21 == 'X' && c31 == 'X') || (c12 == 'X' && c22 == 'X' && c32 == 'X') || (c13 == 'X' && c23 == 'X' && c33 == 'X') || (c11 == 'X' && c22 == 'X' && c33 == 'X') || (c31 == 'X' && c22 == 'X' && c13 == 'X')) {
                    cpuWon = false;
                    userWon = true;     
                    }
                    if (userWon) {
                        System.out.println("El usuario ha ganado");
                        game = true;
                        break;
                    } else if (cpuWon) {
                        System.out.println("La maquina ha ganado");
                        game = true;
                        break;
                    }
                    cpuPlay();
                    userPlay();

                }
            }
            
            System.out.println("Ingresa 'exit' para terminar el juego");
            exit = input.nextLine();
        }
    }
    
    // Metodo para que juegue el usuario
    public static String userPlay() {
        System.out.println("Turno del usuario");
        boolean flag = false;
        while (!flag) {            
            System.out.println("Ingresa el numero de fila [1/3]");
            x = input.nextInt();
            System.out.println("Ingresa el numero de columna [1/3] ");
            y = input.nextInt();
            switch (x) {
                case 1:
                    switch (y) {
                        case 1:
                            if (availableCell(c11)) {
                                c11 = 'X';
                                flag = true;
                                printTable();
                            }
                            break;
                        case 2:
                            if (availableCell(c12)) {
                                c12 = 'X';
                                flag = true;
                                printTable();
                            }
                            break;
                        case 3:
                            if (availableCell(c13)) {
                                c13 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch (y) {
                        case 1:
                            if (availableCell(c21)) {
                                c21 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        case 2:
                            if (availableCell(c22)) {
                                c22 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        case 3:
                            if (availableCell(c23)) {
                                c23 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    switch (y) {
                        case 1:
                            if (availableCell(c31)) {
                                c31 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        case 2:
                            if (availableCell(c32)) {
                                c32 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        case 3:
                            if (availableCell(c33)) {
                                c33 = 'X';
                                flag = true;
                                printTable();
                            }                            
                            break;
                        default:
                            break;
                    }                    
                    break;
                default:
                    break;
            }
        }
        return null;
    }
    
    // Metodo para que juegue la maquina
    public static String cpuPlay() {
        System.out.println("Turno de la maquina");
        boolean flag = false;
        while(!flag){
            int random = (int) (Math.random() * 9 + 1);
            switch(random) {
                case 1:
                    if (availableCell(c11)) {
                        c11 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 2:
                    if (availableCell(c12)) {
                        c12 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 3:
                    if (availableCell(c13)) {
                        c13 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 4:
                    if (availableCell(c21)) {
                        c21 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 5:
                    if (availableCell(c22)) {
                        c22 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 6:
                    if (availableCell(c23)) {
                        c23 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 7:
                    if (availableCell(c31)) {
                        c31 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 8:
                    if (availableCell(c32)) {
                        c32 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;                    
                case 9:  
                    if (availableCell(c33)) {
                        c33 = 'O';
                        flag = true;
                        printTable();
                    }     
                    break;
            }
        }
        return null;
    }

    // Metodo para imprimir el tablero
    public static String printTable() {
        System.out.println("| " + c11 + " | " + c12 + " | " + c13 + " |");
        System.out.println("");
        System.out.println("| " + c21 + " | " + c22 + " | " + c23 + " |");
        System.out.println("");
        System.out.println("| " + c31 + " | " + c32 + " | " + c33 + " |");
        for (int i = 0; i < 4; i++) {
        System.out.println("");
        }
        return null;
    }
    
    // Metodo para verificar si una casilla esta disponible
    public static boolean availableCell(char cell) {
        if (cell == 'O' || cell == 'X') {
            System.out.println("La celda esta ocupada, intenta con otra");
            return false;   
        } else {
            return true;
        }
    }
}