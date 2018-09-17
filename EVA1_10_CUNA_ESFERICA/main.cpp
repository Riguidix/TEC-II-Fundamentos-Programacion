
/* 
 * File:   main.cpp
 * Author: riguidix
 *
 * Created on 13 de septiembre de 2018, 10:13
 */

#include <cstdlib>
#include <iostream>
#define _USE_MATH_DEFINES
#include <math.h>
#include <string>
#include <sstream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    float radio, grados, PI, volumen;
    string mystr;
    PI = M_PI;
      
    cout << "Ingresa el valor del radio: ";
    getline(cin, mystr);
    stringstream(mystr) >> radio;
    cout << "Ingresa el valor de los grados: ";
    getline(cin, mystr);
    stringstream(mystr) >> grados;
    
    volumen = ( (4/3) * PI * (pow(radio, 3)) * grados ) / 360;

    cout << "El valor del volumen es: " << volumen << endl; 
    
    return 0;
}

