package jerarquia;

import java.util.Scanner;

class Circulo {
    protected double Radio;

    public void LeerRadio(Scanner sc) {
        
        System.out.print("Ingrese el radio del círculo: ");
        Radio = sc.nextDouble();
    }

    public double Area() {
        return Math.PI * Math.pow(Radio, 2);
    }

    public double Circunferencia() {
        return 2 * Math.PI * Radio;
    }

    public void Mostrar() {
        System.out.println("Radio: " + Radio);
        System.out.println("Área del Círculo: " + Area());
        System.out.println("Circunferencia del Círculo: " + Circunferencia());
    }
}
