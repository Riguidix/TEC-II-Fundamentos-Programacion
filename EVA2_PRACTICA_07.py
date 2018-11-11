iTemperatura = int(input('Introduzca la temperatura: '))

if (iTemperatura <= 0) :
    print('Freezing Weather')
elif (iTemperatura <= 10) :
    print('Very Cold Weather')
elif (iTemperatura <= 20) :
    print('Cold Weather')
elif (iTemperatura <= 30) :
    print('Normal in Temp')
elif (iTemperatura <= 40) :
    print("It's Hot")
elif (iTemperatura >= 40) :
    print("It's Very Hot")