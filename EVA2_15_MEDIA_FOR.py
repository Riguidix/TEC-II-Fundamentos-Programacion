fMedia = float(0)
iSumatoria = 0

for i in range(5):
    iSumatoria += int(input(f'Introduce la edad {i} ha evaluar: '))

fMedia = float(iSumatoria / 5)
print(f'El valor de la media es: {fMedia}')

