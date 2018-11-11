import math as m

iA = int(input('Introduce el valor de A: '))
iB = int(input('Introduce el valor de B: '))
iC = int(input('Introduce el valor de C: '))

fDiscriminante = float((m.pow(iB, 2)) - (4 * iA * iC))
if (fDiscriminante > 0) :
    # Se obtienen dos raices reales diferentes
    fRes1 = float( (-iB + m.sqrt(fDiscriminante)) / (2 * iA) )
    fRes2 = float( (-iB - m.sqrt(fDiscriminante)) / (2 * iA) )
    print(f'El valor de X1 es: {fRes1}, el valor de X2 es: {fRes2}')
elif (fDiscriminante == 0) :
    # Se obtienen dos raices reales iguales
    fRes1 = float( (-iB + m.sqrt(fDiscriminante)) / (2 * iA) )
elif (fDiscriminante < 0) :
    # Se obtienen dos raices imaginarias diferentes
    print('La raiz es negativa, por lo tanto dara un valor i (imaginario)')
else :
    print('Ocurrio algo fuera del programa')