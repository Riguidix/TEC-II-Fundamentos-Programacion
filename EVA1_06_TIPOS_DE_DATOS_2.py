# /*
#     Capturar datos de una persona e imprimirlo
#     - nombre
#     - edad
#     - genero
#     - estatura
#     - peso
#     - nacionalidad 
#     - estado civil
#     - curp
#     - estado
#     - ciudad
# */

sName = input('Ingresa tu nombre: ').capitalize()
iAge = int(input('Introduzca su edad: '))
sGenre = input('Introduzca su genero, [M/F]: ').capitalize()
dHeight = float(input('Introduzca su estatura, [X.Y]: '))
dWeight = float(input('Introduzca su peso, [X,Y]: '))
sNationality = input('Introduzca su nacionalidad: ').capitalize()
sStatus = input('Introduzca su estado civil, [Soltero, Casado, Divorciado]: ').capitalize()
sCurp = input('Introduzca su curp, [Si no la sabe favor de dejarla en blanco]: ').capitalize()
sState = input('Introduzca su estado: ').upper()
sCity = input('Introduzca su ciudad: ').upper()


# Crear un espacio en blanco para que no se empalme en consolas
i = 0
while i != 10:
    print()
    i = i + 1
    pass

print('Su nombre es: ' + sName)
print('Su edad es: ' + str(iAge))
print('Su genero es: ' + sGenre)
print('Su altura es: ' + str(dHeight))
print('Su peso es: ' + str(dWeight))
print('Su nacionalidad es: ' + sNationality)
print('Su estado civil es: ' + sStatus)
print('Su curp es: ' + sCurp)
print('Su estado es:' + sState)
print('Su ciudad es: ' + sCity)

