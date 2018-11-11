
valueUser = int(input("Ingresa el año ha evaluar: "))

if (valueUser % 400 == 0 and valueUser % 100 == 0) :
    print("El año es bisiesto")
elif (valueUser % 4 == 0 and valueUser % 100 != 0) :
    print("El año es bisiesto")
else:
    print("El año no es bisiesto")

# Esto en un solo if
if (valueUser % 400 == 0 and valueUser % 100 == 0 or valueUser % 4 == 0 and valueUser % 100 != 0) :
    print("Anio bisiesto")
else:
    print("No es bisiesto")