userValue = int(input('Introduce un numero entero positivo (mayor a 1): '))
bFlagPrime = True

for i in range(2, userValue):
    if (userValue % i == 0) :
        bFlagPrime = False
        continue

if(bFlagPrime):
    print('Numero primo')
else:
    print('No es numero primo')