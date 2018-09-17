/**
 *
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {

    /**
     *  JAVA es fuertemente tipados
     */
    public static void main(String[] args) {
        // int no puede contener double/floats
        // Manera de declarar una variable
        int iDato; // Define operaciones para enteros

        // System.out.println(iDato); // Nos imprimiria cero
        
        // iVal es primitivo, no cuenta como objeto que no muestra funciones despues de x.some
        int iVal; // 4 bytes (-2,147,483,648 to 2,147,483,647)
        iVal = 10;
        
        String iCadena = "Hola, Mundo";
        System.out.println(iCadena.length());                
        
        // CONSTANTES ----> RECOMENDACION EN MAYUSCULAS
        final double PI = 3.141592;
        
    }
}
