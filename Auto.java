package TallerJava9FundamentosPoo;

public class Auto {
    //? Atributos
    private String marca;
    private int modelo;
    private String color;
    private int kilometraje = 0;
    private boolean detallado = true;
    //? Constructores
    public Auto() {}
    public Auto(String marca, int modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }
    //? Getters & Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    public boolean isDetallado() {
        return detallado;
    }
    public void setDetallado(boolean detallado) {
        this.detallado = detallado;
    }
    //? Metodos
    public void mostrarInformacion(){
        System.out.println("--------- Informacion del auto: ---------");
        System.out.println("Marca del auto: " + marca);
        System.out.println("Modelo del auto: " + modelo);
        System.out.println("Color del auto: " + color);
        if (detallado){
            System.out.println("kilometraje del auto: " + kilometraje);
        }
    }
    public void actualizarKilometraje(int km){
        if (km >= 0){
            kilometraje += km;
            System.out.println("Kilometraje actual: " + kilometraje);
        }else {
            System.out.println("Kilometraje invalido");
        }
    }
}
