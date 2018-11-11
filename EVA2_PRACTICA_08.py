a = int(input('Introduzca el primer valor: '))
b = int(input('Introduzca el segundo valor: '))
c = int(input('Introduzca el tercer valor: '))

if (a == b and a == c) :
    print('El triangulo es equilatero')
elif (a == b and b != c or b == c and c != a or a == c and c != b) :
    print('El triangulo es Isoceles')
elif (a != b and b != c and c != a) :
    print('El triangulo es escaleno')