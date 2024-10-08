package publicacion;

class Publicacion {
    protected String Titulo;
    protected float Precio;

    public Publicacion(String Titulo, float Precio) {
        this.Titulo = Titulo;
        this.Precio = Precio;
    }

    public void Mostrar() {
        System.out.println("Titulo: " + Titulo);
        System.out.println("Precio: $" + Precio);
    }
}

