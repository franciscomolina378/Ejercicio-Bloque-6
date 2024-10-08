package jerarquia;
import java.util.Scanner;


class Cilindro extends Circulo {
    protected double Altura;

    public void LeerAltura(Scanner sc) {
        
        System.out.print("Ingrese la altura del cilindro: ");
        Altura = sc.nextDouble();
    }

    @Override
    public double Area() {
        return 2 * Math.PI * Radio * Altura + 2 * Math.PI * Math.pow(Radio, 2);
    }

    public double Volumen() {
        return Math.PI * Math.pow(Radio, 2) * Altura;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Altura: " + Altura);
        System.out.println("Área del Cilindro: " + Area());
        System.out.println("Volumen del Cilindro: " + Volumen());
    }
}
