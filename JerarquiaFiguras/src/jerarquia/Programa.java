package jerarquia;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Circulo circulo = new Circulo();
        circulo.LeerRadio(sc);
        circulo.Mostrar();

        
        Cilindro cilindro = new Cilindro();
        cilindro.LeerRadio(sc);
        cilindro.LeerAltura(sc);
        cilindro.Mostrar();

        
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.LeerRadio(sc);
        cilindroHueco.LeerAltura(sc);
        cilindroHueco.LeerRadioInterno(sc);
        cilindroHueco.Mostrar();

        
        sc.close();
    }
}


