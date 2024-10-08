package jerarquia;
import java.util.Scanner;

class CilindroHueco extends Cilindro {
    private double RadioInterno;

    public void LeerRadioInterno(Scanner sc) {
        
        System.out.print("Ingrese el radio interno del cilindro hueco: ");
        RadioInterno = sc.nextDouble();
    }

    @Override
    public double Area() {
        double areaExterno = super.Area();
        double areaInterno = 2 * Math.PI * RadioInterno * Altura + 2 * Math.PI * Math.pow(RadioInterno, 2);
        return areaExterno - areaInterno;
    }

    @Override
    public double Volumen() {
        return Math.PI * (Math.pow(Radio, 2) - Math.pow(RadioInterno, 2)) * Altura;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Radio Interno: " + RadioInterno);
        System.out.println("Área del Cilindro Hueco: " + Area());
        System.out.println("Volumen del Cilindro Hueco: " + Volumen());
    }
}
