package publicacion;

class Disco extends Publicacion {
    private float Duracion;

    public Disco(String Titulo, float Precio, float Duracion) {
        super(Titulo, Precio);
        this.Duracion = Duracion;
    }

    @Override
    public void Mostrar() {
        super.Mostrar();
        System.out.println("Duracion: " + Duracion + " minutos");
    }
}
