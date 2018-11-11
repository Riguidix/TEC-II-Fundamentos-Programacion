
name = input('Introduce el nombre a imprimir: ')
manyTimes = int(input('Introduce las veces a imprimir el nombre: '))

for i in range(manyTimes):
    print(f'{i}: {name}')