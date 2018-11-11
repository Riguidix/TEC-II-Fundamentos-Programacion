import random

iNumAleatorio = random.randint(1,10)
iUserValue = 0

print('Ingresa y encuentra el numero aleatroio entre 1 y 10')
for i in range(4):
    iUserValue = int(input(''))
    if (iUserValue == iNumAleatorio):
        print('Has encontrado el numero aleatorio')
        break
    else :
        if (iUserValue > iNumAleatorio) :
            print('Estas arriba del numero')
        elif (iUserValue < iNumAleatorio) :
            print('Estas debajo del numero')

    if (i == 3):
        print('Has agotado las oportunidades')
        break

    print('No has adivinado, intenta de nuevo')