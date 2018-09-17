
/* 
 * File:   main.cpp
 * Author: riguidix
 *
 * Created on 14 de septiembre de 2018, 9:45
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
//        // TODO code application logic here
//        // m = y2 - y1  / x2 - x1
//        int pendiente, y1, y2, x1, x2;
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Ingresa la primer coordenada, valor de X: ");
//        x1 = input.nextInt();
//        System.out.println("Ingresa la primer coordenada, valor de Y: ");
//        y1 = input.nextInt();
//        
//        System.out.println("Ingresa la segunda coordenada, valor de X: ");
//        x2 = input.nextInt();
//        System.out.println("Ingresa la segunda coordenada, valor de Y: ");
//        y2 = input.nextInt();
//        
//        pendiente = (y2 - y1) / (x2 - x1);
//        System.out.println("El valor de la pendiente es: " + pendiente);
//        
    int pendiente, x1, y1, x2, y2;
    cout << "Ingresa la primer coordenada, valor de X: ";
    cin >> x1 ;
    cout << "Ingresa la primer coordenada, valor de Y: ";
    cin >> y1;
            
    cout << "Ingresa la segunda coordenada, valor de X: ";
    cin >> x2;
    
    cout << "Ingresa la segunda coordenada, valor de Y: ";
    cin >> y2;
    
    pendiente = (y2 - y1) / (x2 - x1);
    cout << "El valor de la pendiente es: " <<  ;
            
    return 0;
}

