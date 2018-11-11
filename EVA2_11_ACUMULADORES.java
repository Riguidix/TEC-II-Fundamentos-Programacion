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
               // ACULUADOR
        int iSuma = 10; // PUNTO DE PARTIDA
        System.out.println("Valor de el acumulador: " + iSuma);
        iSuma = iSuma + 10;
        System.out.println("Valor de el acumulador: " + iSuma);
        iSuma += 10;
        System.out.println("Valor de el acumulador: " + iSuma);

        int iMult = 5;
        System.out.println("Valor de el multiplicador: " + iMult);
        iMult = iMult * 5;
        System.out.println("Valor de el multiplicador: " + iMult);
        iMult *= 5;
        System.out.println("Valor de el multiplicador: " + iMult);

        int iResta = 100;
        System.out.println("Valor de una resta: " + iResta);
        iResta = iResta - 5;
        System.out.println("Valor de una resta: " + iResta);
        iResta -= 5;
        System.out.println("Valor de una resta: " + iResta);

        double dDivision = 1000;
        System.out.println("Valor de la division: " + dDivision);
        dDivision = dDivision / 2;
        System.out.println("Valor de la division: " + dDivision);
        dDivision /= 2;
        System.out.println("Valor de la division: " + dDivision);

        // CONTADORES
        // iContador+= ----> Incrementa cualquier valor
        // iContador++ ----> Solamente incrementa en 1
        //
        // FUNNY :
        // El incremento de C -----> C++, siendo el incremento "Orientado a Objetos"

        String sCadena = "Hola";
        System.out.println(sCadena);
        sCadena = sCadena + ", Mundo";
        System.out.println(sCadena);
        sCadena += " " + sCadena;
        System.out.println(sCadena);

        int iContador = 0;
    //
    //        // Esperar hasta ser usada la variable Variable++;
    //        iContador++;
    //        System.out.println("Incrementa en uno: " + iContador);
    //        // Aplicar en el momento el incremento de variable es ++Variable;
    //        ++iContador;
    //        System.out.println("Incrementa en uno: " + iContador);
    //
        System.out.println("**********************************");
        System.out.println("Valor de Contador: " + iContador);
        System.out.println("Valor de Contador: " + (iContador++));
        System.out.println("Valor de Contador: " + (++iContador));

        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Valor de Contador: " + iContador);
        iContador++;
        System.out.println("Valor de Contador: " + iContador);
        ++iContador;
        System.out.println("Valor de Contador: " + iContador);

    //        iSuma += 10;
    //        for (int i = 0; i < 10; i++) {
    //            System.out.println("Valor de Suma: " + iSuma);
    //            iSuma = iSuma + 10;
    //        }
        
    }
    
}
