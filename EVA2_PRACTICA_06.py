x = int(input('Introduce el valor de X: '))
y = int(input('Introduce el valor de Y: '))

if (x > 0 and y > 0) :
    print('Las coordenadas son del priemr cuadrante')
elif (x < 0 and y > 0) :
    print('Las coordenadas son del segundo cuadrantes')
elif (x < 0 and y < 0) :
    print('Las coordenadas son del tercer cuadrante')
elif (x > 0 and y < 0) :
    print('Las coordenadas son del cuarto cuadrante')
else :
    print('Las coordenadas son del origen')