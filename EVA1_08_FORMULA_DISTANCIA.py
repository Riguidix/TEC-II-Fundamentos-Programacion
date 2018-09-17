velInicial = 0
velFinal = 0
distancia = 0
time = 0

velInicial = float(input("Ingresa la velocidad inicial [kilometros / hora]: "))
velFinal = float(input("Ingresa la velocidad final [kilometros / hora]: "))
time = float(input("Ingresa el tiempo [hora]: "))

distancia = ((velInicial + velFinal) / 2) * time
print(str(distancia) + ' km')