import numpy
"""
        // TODO code application logic here
        // ( (4 / 3) * Pi * radio ^ 3 * nGrados ) / 360
        final double PI = Math.PI;
        float radio;
        double grados;
        double volumen;
            
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor del radio");
        radio = input.nextFloat();
        System.out.println("Introduce el valor de los grados");
        grados = input.nextFloat();
        
        volumen = ( (4/3) * PI * (Math.pow(radio, 3)) * grados ) / 360;
        System.out.println("El valor del volumen es: " + volumen);
"""
radio = 0
grados = 0
volumen = 0
PI = 3.1416

radio = int(input('Introduce el valor del radio: '))
grados = int(input('Introduce el valor de los grados: '))

volumen = ( (4/3) * PI * (pow(radio,3)) * grados ) / 360
print('El valor del volumen es: ' + str(volumen))
