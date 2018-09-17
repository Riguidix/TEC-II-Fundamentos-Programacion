
/* 
 * File:   main.cpp
 * Author: riguidix
 *
 * Created on 13 de septiembre de 2018, 9:24
 */

#include <cstdlib>
#include <stdio.h>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
//        // A = (a + b / 2) * h
//        float area;
//        float bMayor;
//        float bMenor;
//        float altura;
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("--------------- AREA DEL TRAPECIO ---------------");
//        System.out.println("Introduce la base mayor");
//        bMayor = input.nextFloat();
//        System.out.println("Introduce la base menor");
//        bMenor = input.nextFloat();
//        System.out.println("Introduce la altura");
//        altura = input.nextFloat();
//        
//        area = ((bMayor + bMenor) / 2) * altura;
//        System.out.println("El área del Trapecio es: " + area);
//        
    float area;
    float bMayor;
    float bMenor;
    float altura;
    
    printf("Introduce la base mayor \n");
    scanf('%f', &bMayor);
    printf("Introduce la base menor \n");
    scanf('%f', &bMenor);
    printf("Introduce la altura \n");
    scanf('%f', &altura);
    
    area = ((bMayor + bMenor) / 2) * altura;
    printf("El area del Trapecio es: %f", area);
    return 0;
}

