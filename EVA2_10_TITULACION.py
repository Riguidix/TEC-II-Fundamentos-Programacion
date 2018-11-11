
def toBoolean(variable):
    if (variable.upper() == 'S') :
        variable = True
    elif (variable.upper() == 'N') :
        variable = False
    else:
        print("El valor no esta en las opciones")
        variable = input("Intenta otra vez ")
        toBoolean(variable)

bResidencia = ""
bServicio = ""
bMaterias = ""

bResidencia = input("Has terminado tus residencias? [s/n]")
toBoolean(bResidencia)
bServicio = input("Has terminado tu servicio? [s/n]")
toBoolean(bServicio)
bMaterias = input("Has terminado todas tus materias? [s/n]")
toBoolean(bMaterias)



if (bResidencia and bServicio and bMaterias):
    print("Puedes Titularte")
else:
    if (bResidencia and bServicio) :
        print("Tienes materias pendientes")
    elif (bResidencia and bMaterias) :
        print("No has acabado tu servicio")
    elif (bServicio and bMaterias) :
        print("No has acabado tus residencias")
    else:
        print("El sistema no te quiere")