package registro;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

     
        Direccion direccion = new Direccion("", "", "", "", "", "", "");

        
        direccion.LeerNombre(sc); 

      
        direccion.NuevaDireccion(sc);  

        
        direccion.Mostrar();

        sc.close();
    }
}

