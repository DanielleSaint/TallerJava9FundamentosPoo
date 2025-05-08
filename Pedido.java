package TallerJava9FundamentosPoo;
import java.util.HashMap;
import java.util.Map;

public class Pedido {
    //? Atributos
    private int numeroPedido;
    private String nombreCliente;
    private Map<String, Double> productos = new HashMap<>();
    private double total = 0;
    //? Constructores
    public Pedido() {}
    public Pedido(int numeroPedido, String nombreCliente) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
    }
    //? Getters & Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public Map<String, Double> getProductos() {
        return productos;
    }
    public void setProductos(Map<String, Double> productos) {
        this.productos = productos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    //? Metodos
    public void agregarProducto(String producto, double precio){
        productos.put(producto, precio);
        total += precio;
        System.out.println("Producto " + producto + " Agregado a la lista");
    }
    public void calcularDescuento(double porcentaje){
        if (0 < porcentaje && porcentaje <= 100){
            double descuento = (total * porcentaje) / 100;
            System.out.println("Descuento del " + porcentaje + "%: $" + descuento);
            double totalConDescuento = total - descuento;
            total -= descuento;
            System.out.println("Total con descuento: $" + totalConDescuento);
        }else {
            System.out.println("Porcentaje no valido");
        }
    }
    public void mostrarPedido(){
        System.out.println("--------- Total pedido: ---------");
        System.out.println("Numero de pedido: " + numeroPedido);
        System.out.println("Nombre de cliente: " + nombreCliente);
        System.out.println("Lista de productos: " + productos);
        System.out.println("Total compra: $" + total);
    }
}
