
/* 
 * File:   main.cpp
 * Author: riguidix
 *
 * Created on 17 de septiembre de 2018, 12:07
 */

#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int iNum1, iDen1, iNum2, iDen2;
    int x, y;

    cout << "Introduzca el numerador de la fraccion 1: \n";
    cin >> iNum1;
    cout << "Introduzca el denominador de la fraccion 1: \n";
    cin >> iDen1;
    cout << "Introduzca el numerador de la fraccion 2: \n";
    cin >> iNum2;
    cout << "Introduzca el denominador de la fraccion 2: \n";
    cin >> iDen2;
    
    for (int i = 0; i < 10; i++) {
        cout << " \n";
    }

// Suma 
    // Numerador
        x = (iNum1 * iDen2) + (iNum2 * iDen1);
    // Denominador
        y = iDen1 * iDen2;
        
        cout << "El resultado de la suma es: " << x << "/" << y << endl;
//  Resta
    // Numerador
       x = (iNum1 * iDen2) - (iNum2 * iDen1);
   // Denominador
        y = iDen1 * iDen2;

        cout << "El resultado de la resta es: " << x << "/" << y << endl;        
//  Multiplicacion
   // Numerador
       x = iNum1 * iNum2;
   // Denominador
       y = iDen1 * iDen2;

        cout << "El resultado de la multiplicacion es: " << x << "/" << y << endl;       
// Division
  // Numerador
        x = iNum1 * iDen2;
    // Denominador
        y = iDen1 * iNum2;
        
        cout << "El resultado de la division es: " << x << "/" << y << endl;       
    return 0;
}

