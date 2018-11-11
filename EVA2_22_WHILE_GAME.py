import random as rm

iRandom = rm.randint(1, 10)

userValue = 0
intentos = 0
i = 0

print('Adivina el numero del 1 al 10')
print(iRandom)

while userValue != iRandom:
    userValue = int(input('Introduce tu numero para adivinar: '))
    if userValue > iRandom:
        print('Te has pasado')
    elif userValue < iRandom:
        print('Te falta poco')

    while i != 3:
        print(" ")
        i = i + 1
    intentos = intentos + 1

print(f'Has ganado, adivinaste el numero en {intentos} intentos.')
