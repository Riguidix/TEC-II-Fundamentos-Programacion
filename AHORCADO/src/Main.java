
import java.util.Scanner;

public class Main {
    public static int intentos = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Palabra 1
        String word1 = "perro";
        char[] word11 = new char[]{'p', 'e', 'r', 'r', 'o'};
        // Palabra 2
        String word2 = "mouse";
        char[] word21 = new char[]{'m', 'o', 'u', 's', 'e'};
        // Palabra 3
        String word3 = "delfin";
        char[] word31 = new char[]{'d', 'e', 'l', 'f', 'i', 'n'};
        // Palabra 4
        String word4 = "programar";
        char[] word41 = new char[]{'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'r'};
        // Palabra 5
        String word5 = "auto";
        char[] word51 = new char[]{'a', 'u', 't', 'o'};
        
        char[] word = new char[]{};
        char user = ' ';
        
        while (intentos < 5) {            
            int random = (int) (Math.random() * 5 + 1);
            System.out.println(random);
            boolean flagGame = true;
            switch(random) {
                case 1:
                    System.out.println("La palabra tiene" + word1.length() + " caracteres");
                    word = new char[word11.length];
                    word = word11.clone();
                    break;
                case 2:
                    System.out.println("La palabra tiene" + word2.length() + " caracteres");                    
                    word = new char[word21.length];
                    word = word21.clone();                    
                    break;
                case 3:
                    System.out.println("La palabra tiene" + word3.length() + " caracteres");                    
                    word = new char[word31.length];
                    word = word31.clone();                    
                    break;
                case 4:
                    System.out.println("La palabra tiene" + word4.length() + " caracteres");                    
                    word = new char[word41.length];
                    word = word41.clone();                    
                    break;
                case 5:
                    System.out.println("La palabra tiene" + word5.length() + " caracteres");                    
                    word = new char[word51.length];
                    word = word51.clone();                    
                    break;
            }
            
            while(flagGame) {
                System.out.println("Ingresa un caracter para adivinar la palabra");
                user = input.next(".").charAt(0);
                checkWord(word, user);
            }
            
        }
        
    }
    
    public static String checkWord(char[] word, char caracter) {
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                System.out.print("_ ");                
            }
            System.out.println("");
            if (word[i] != caracter) {
                System.out.println("te has equivocado");
            }
            if (word[i] == caracter) {
                System.out.print(i);
                break;
            }
            
        }
        printTable(intentos);
        intentos++;
        return null;
    }
    
    public static String printTable(int intentos) {
            System.out.println("   ____");
            if (intentos == 0) {
                System.out.println("  |    |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|________");                 
            } else {
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|________");                
            }
            if (intentos == 1) {
                System.out.println("  |    |");   
                System.out.println("  |    |");      
                System.out.println("  |    0");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|________");                
            }
            if (intentos == 2) {
                System.out.println("  |    |"); 
                System.out.println("  |    |");      
                System.out.println("  |    0");
                System.out.println("  |   ---");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|________");                
            }
            if (intentos == 3) {
                System.out.println("  |    |");
                System.out.println("  |    |");      
                System.out.println("  |    0");
                System.out.println("  |   ---");
                System.out.println("  |    |");
                System.out.println("  |   | |");
                System.out.println("  |");
                System.out.println("__|________");                
            }
            if (intentos == 4) {
                System.out.println("  |    |");      
                System.out.println("  |    0");
                System.out.println("  |   ---");
                System.out.println("  |    |");
                System.out.println("  |   | |");
                System.out.println("  |");
                System.out.println("__|________");                
            }
        return null;
    }
}