"""
    Capturar nombre del usuario String (texto)
    pedir su edad Int (entero)
    Calcular su fecha de nacimiento (año)
    año actual - fecha de nacimiento/edad
    Mostrar los resultados
"""

sName = input('Ingresa tu nombre: ')
iAge = int(input('Ingresa tu edad: '))
iActualDate = 2018
iBornDate = iActualDate - iAge

print("Tu nombre es: " + sName)
print("Tu año de nacimiento es: " + str(iBornDate))
