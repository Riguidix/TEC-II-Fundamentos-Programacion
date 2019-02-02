import numpy
radio = 0
grados = 0
volumen = 0
PI = 3.1416

radio = int(input('Introduce el valor del radio: '))
grados = int(input('Introduce el valor de los grados: '))

volumen = ( (4/3) * PI * (pow(radio,3)) * grados ) / 360
print('El valor del volumen es: ' + str(volumen))
