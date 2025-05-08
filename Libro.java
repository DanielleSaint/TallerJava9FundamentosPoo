package TallerJava9FundamentosPoo;

public class Libro {
    //? Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;
    //? Constructores
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    //? Getters & Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //? Metodos
    public void mostrarDetalles(){
        System.out.println("--------- Datos del libro: ---------");
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Año de publicacion del libro: " + anioPublicacion);
        if (disponible){
            String estadoLibro = "Disponible";
            System.out.println("Estado del libro: " + estadoLibro);
        }else{
            String estadoLibro = "No disponible";
            System.out.println("Estado del libro: " + estadoLibro);
        }
    }
    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println("Libro prestado con exito!");
        }else {
            System.out.println("Libro no disponible.");
        }
    }
    public void devolver(){
        if (!disponible){
            disponible = true;
            System.out.println("Libro devuelto!");
        }else {
            System.out.println("Libro disponible.");
        }
    }
}
