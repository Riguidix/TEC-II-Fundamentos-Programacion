a = int(input('Introduzca el primer valor a evaluara: '))
b = int(input('Introduzca el segundo valor a evaluar: '))
c = int(input('Introduzca el tercer valor a evaluar: '))

if (a > b) :
    if (a > c) :
        print(f'{a} es el mayor')
    else :
        print(f'{c} es el mayor')
else :
    if (b > c) :
        print(f'{b} es el mayor')
    else :
        print(f'{c} es el mayor')