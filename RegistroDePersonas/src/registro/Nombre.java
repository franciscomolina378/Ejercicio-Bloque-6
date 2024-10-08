package registro;

import java.util.Scanner;

class Nombre {
    protected String Nombre;
    protected String PrimerApellido;
    protected String SegundoApellido;

    public Nombre(String Nombre, String PrimerApellido, String SegundoApellido) {
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
    }

    public void LeerNombre(Scanner sc) {
       
        System.out.print("Ingrese el Nombre: ");
        Nombre = sc.nextLine();
        System.out.print("Ingrese el Primer Apellido: ");
        PrimerApellido = sc.nextLine();
        System.out.print("Ingrese el Segundo Apellido: ");
        SegundoApellido = sc.nextLine();
        
    }

    public void Mostrar() {
        System.out.println("Nombre Completo: " + Nombre + " " + PrimerApellido + " " + SegundoApellido);
    }
}
