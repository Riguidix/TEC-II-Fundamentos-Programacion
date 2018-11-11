iCalMath = int(input('Introduzca su calificacion de Matematicas: '))
iCalPhys = int(input('Introduzca su calificacion de Fisica: '))
iCalChem = int(input('Introduzca su calificacion de Quimica: '))

if (iCalMath >= 65 and iCalPhys >= 55 and iCalChem >= 50 and (iCalMath + iCalPhys + iCalChem ) >= 180) :
    if (iCalMath >= 65 and (iCalMath + iCalChem + iCalPhys) >= 140) :
        print('Estas calificado para la admision')
else:
    print('No eres calificado para admision')

