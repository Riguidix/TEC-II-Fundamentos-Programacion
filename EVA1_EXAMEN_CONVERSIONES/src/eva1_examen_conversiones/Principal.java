
package eva1_examen_conversiones;

import java.util.Scanner;

/**
 * Construir un programa que permita obtener la conversión entre diferentes 
 * escalas de temperatura. 
 * Investigar las fórmulas:
 *   La temperatura se capturará desde el teclado y será en grados Fahrenheit.
 *   Mostrar el equivalente en grados centígrados y Kelvin. 
 *   Deberá realizar la petición de los datos al usuario de la mejor manera, indicando 
 *   que le pide y en que unidad de medida. 
 *   Deberá mostrar los resultados indicando claramente a que unidad de medida corresponden.
 * 
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Variables
        Scanner input = new Scanner(System.in);
        double user, temperatura1, temperatura2;
        String validator;
        
        System.out.println("¿Tiene el valor en grados Fahrenheits? [S/N]");
        validator = input.nextLine();
        
        /*
            Si el usuario indica S este se convertira de Fahrenheits a Centigrados y Kelvin
            Sino entonces seguira verificando hasta lograr convertir en estas 3 medidas
        */
        if ("S".equals(validator.toUpperCase())) {
            System.out.println("Introduzca la temperatura en grados Fahrenheit (°F)");
            user = input.nextFloat();

            temperatura1 = (5 * ( user - 32)) / 9;
            temperatura2 = ((5 * ( user - 32)) / 9) + 273.15;

            System.out.println("La temperatura de " + user + " °F es igual a " + temperatura1 + " °C y " + temperatura2 + " °K" );
        
        } else {
            System.out.println("¿Tiene el valor en grados Centigrados? [S/N]");
            validator = input.nextLine();
            
            if ("S".equals(validator.toUpperCase())) {
                System.out.println("Introduzca la temperatura en grados Centigrados (°C)");
                user = input.nextFloat();
                
                temperatura1 = ((9 * user) / 5 ) + 32;
                temperatura2 = user + 273.15;
                
                System.out.println("La temperatura de " + user + " °C es igual a " + temperatura1 + " °F y " + temperatura2 + " °K" );
                
            } else {
                System.out.println("¿Tiene el valor en grados Kelvin? [S/N]");
                validator = input.nextLine();
                
                if ("S".equals(validator.toUpperCase())) {
                    System.out.println("Introduzca la temperatura en grados Kelvin (°K)");
                    user =  input.nextFloat();
                    
                    temperatura1 = user - 273.15;
                    temperatura2 = ((9 * (user - 273.15)) / 5 ) + 32;
                    
                    System.out.println("La temperatura de " + user + " °K es igual a " + temperatura1 + " °C y " + temperatura2 + " °F" );
                } else {
                    System.out.println("Perdona, pero sólo 'Fahrenheits', 'Centigrados' o 'Kelvin' son admitidos");
                }
            }
        }
        
        
    }

}
