package publicacion;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los detalles del libro:");
        System.out.print("Titulo: ");
        String TituloLibro = sc.nextLine();
        System.out.print("Precio: ");
        float PrecioLibro = sc.nextFloat();
        System.out.print("Numero de Paginas: ");
        int NumeroPaginas = sc.nextInt();
        System.out.print("Año de Publicacion: ");
        int AñoPublicacion = sc.nextInt();
        sc.nextLine();  

       
        Libro libro = new Libro(TituloLibro, PrecioLibro, NumeroPaginas, AñoPublicacion);

       
        System.out.println("\nIngrese los detalles del disco:");
        System.out.print("Titulo: ");
        String TituloDisco = sc.nextLine();
        System.out.print("Precio: ");
        float PrecioDisco = sc.nextFloat();
        System.out.print("Duracion (en minutos): ");
        float Duracion = sc.nextFloat();

        
        Disco disco = new Disco(TituloDisco, PrecioDisco, Duracion);

        
        System.out.println("\nDetalles del libro:");
        libro.Mostrar();

        System.out.println("\nDetalles del disco:");
        disco.Mostrar();

        sc.close();
    }
}

