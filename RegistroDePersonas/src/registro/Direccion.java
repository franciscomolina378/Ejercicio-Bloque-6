package registro;
import java.util.Scanner;

class Direccion extends Nombre {
    private String Calle;
    private String Ciudad;
    private String Provincia;
    private String CodigoPostal;

    public Direccion(String Nombre, String PrimerApellido, String SegundoApellido,
                     String Calle, String Ciudad, String Provincia, String CodigoPostal) {
        super(Nombre, PrimerApellido, SegundoApellido);
        this.Calle = Calle;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.CodigoPostal = CodigoPostal;
    }

    public void NuevaDireccion(Scanner sc) {
        
        
        System.out.print("Ingrese la Calle: ");
        Calle = sc.nextLine();
        System.out.print("Ingrese la Ciudad: ");
        Ciudad = sc.nextLine();
        System.out.print("Ingrese la Provincia: ");
        Provincia = sc.nextLine();
        System.out.print("Ingrese el Código Postal: ");
        CodigoPostal = sc.nextLine();
        
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Direccion: Calle " + Calle + ", Ciudad " + Ciudad + ", Provincia " + Provincia + ", Código Postal: " + CodigoPostal);
    }
}
