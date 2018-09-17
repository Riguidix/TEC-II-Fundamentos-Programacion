import java.util.Scanner;
// Importe para poder usar fuera de esta clase o este package
import MisClases.FirstClass;


/**
 * @author Reydescel Herrera
 * @matricula 18550937
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Aprender porque la manera de Clases y Objetos
        Scanner input = new Scanner(System.in);
        
//        int iVal = 10;
        Ejemplo eMiObjetoEjem;
        eMiObjetoEjem = new Ejemplo();
//        Maneras de imprimir y llamar desde un objeto en clase Ejemplo
//        System.out.println(eMiObjetoEjem.iVal);
        
        Ejemplo eObj2 = new Ejemplo();
        
        Ejemplo eObj3;
        
//        No se puede imprimir el eObj3 ya que no se ha inicializado
//        System.out.println(eObj3);

// Usando la clase fuera de otro paquete
        FirstClass oOtroObj = new FirstClass();
    }

}

// Tipos abstractos de datos
class Ejemplo {
//    int iVal = 10;
}

// m = y2 - y1  / x2 - x1
