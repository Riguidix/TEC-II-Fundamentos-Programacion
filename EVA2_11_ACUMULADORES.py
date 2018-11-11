iSuma = 10 # Punto de partida
print("Valor del acumulador suma: " + str(iSuma))
iSuma = iSuma + 10
print("Valor del acumulador suma: " + str(iSuma))
iSuma += 10
print("Valor del acumulador suma: " + str(iSuma))

iMult = 5
print("Valor del acumulador multiplicador: " + str(iMult))
iMult = iMult * 5
print("Valor del acumulador multiplicador: " + str(iMult))
iMult *= 5
print("Valor del acumulador multiplicador: " + str(iMult))

iResta = 100
print("Valor del acumulador resta: " + str(iResta))
iResta = iResta - 5
print("Valor del acumulador resta: " + str(iResta))
iResta -= 5
print("Valor del acumulador resta: " + str(iResta))

dDivision = 1000
print("Valor del acumulador division: " + str(dDivision))
dDivision = float(dDivision / 2)
print("Valor del acumulador division: " + str(dDivision))
dDivision /= float(2)
print("Valor del acumulador division: " + str(dDivision))

sCadena = "Hola"
print(sCadena)
sCadena = sCadena + ", Mundo"
print(sCadena)
sCadena += " " + sCadena
print(sCadena)