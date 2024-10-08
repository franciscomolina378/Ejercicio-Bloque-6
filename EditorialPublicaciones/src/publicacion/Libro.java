package publicacion;

class Libro extends Publicacion {
    private int NumeroPaginas;
    private int AñoPublicacion;

    public Libro(String Titulo, float Precio, int NumeroPaginas, int AñoPublicacion) {
        super(Titulo, Precio);
        this.NumeroPaginas = NumeroPaginas;
        this.AñoPublicacion = AñoPublicacion;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Numero de Paginas: " + NumeroPaginas);
        System.out.println("Año de Publicacion: " + AñoPublicacion);
    }
}
