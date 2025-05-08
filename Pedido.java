package TallerJava9FundamentosPoo;
import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private Map<String, Double> productos = new HashMap<>();
    private double total = 0;
}
