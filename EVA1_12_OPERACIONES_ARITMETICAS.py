x = 0
iNum1 = int(input("Introduzca el numerador de la fraccion 1: "));
iDen1 = int(input("Introduzca el denominador de la fraccion 1: "));
iNum2 = int(input("Introduzca el numerador de la fraccion 2: "));
iDen2 = int(input("Introduzca el denominador de la fraccion 2: "));

while x != 10:
  x = x + 1
  print(" ")
  pass

## Suma 
  #   Numerador
x = (iNum1 * iDen2) + (iNum2 * iDen1);
  #   Denominador
y = iDen1 * iDen2;

print('El resultado de la suma es: ' + str(x) + "/" + str(y))

## Resta
  #   Numerador
x = (iNum1 * iDen2) - (iNum2 * iDen1);
  #   Denominador
y = iDen1 * iDen2;
   
print('El resultado de la resta es: ' + str(x) + "/" + str(y))     

## Multiplicacion
  #   Numerador
x = iNum1 * iNum2;
  #   Denominador
y = iDen1 * iDen2;
      
print('El resultado de la multiplicacion es: ' + str(x) + "/" + str(y))

## Division
  #   Numerador
x = iNum1 * iDen2;
  #   Denominador
y = iDen1 * iNum2;        
      
print('El resultado de la division es: ' + str(x) + "/" + str(y))
