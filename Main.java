package TallerJava9FundamentosPoo;

public class Main {
    public static void main(String[] args) {
        //? CuentaBancaria
        //* Constructor vacio
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setNombreTitular("David Alvarez");
        cuenta1.setNumeroCuenta(456345765);
        cuenta1.setTipoCuenta("Ahorros");
        cuenta1.setSaldo(5400);
        cuenta1.mostrarDatos();
        //* Constructor con parametros
        CuentaBancaria cuenta2 = new CuentaBancaria("Carlos Santacruz", 987987234, "Corriente", 7450);
        cuenta2.mostrarDatos();
        //*Operaciones cuenta 1
        System.out.println("---------- Operacion transaccional cuenta 1----------");
        cuenta1.retirar(6000);
        cuenta1.depositar(600);
        cuenta1.retirar(6000);
        //*Operaciones cuenta 2
        System.out.println("---------- Operacion transaccional cuenta 2----------");
        cuenta2.retirar(6000);
        cuenta2.depositar(600);
        cuenta2.retirar(6000);
        //* Informacion cuenta 1
        cuenta1.mostrarDatos();
        //* Informacion cuenta 2
        cuenta2.mostrarDatos();

        //?Libro
        //* Constructor con parametros
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry",1943);
        Libro libro2 = new Libro("El alquimista", "Paulo Coelho",1988);
        //* Informacion de los libros
        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
        //* Prestamo del libro 1
        System.out.println("------ Estado del libro ------");
        libro1.prestar();
        System.out.println("------ Estado del libro ------");
        libro1.prestar();
        //* Devolver libro 1
        System.out.println("------ Estado del libro ------");
        libro1.devolver();
        System.out.println("------ Estado del libro ------");
        libro1.prestar();

        //? Auto
        //* Constructor vacio
        Auto auto1 = new Auto();
        auto1.setMarca("Audi");
        auto1.setModelo(2020);
        auto1.setColor("Negro Mate");
        auto1.setKilometraje(57643);
        auto1.mostrarInformacion();
        //* Constructor con parametros
        Auto auto2 = new Auto("Ford", 2024, "Azul Metalico",73890);
        auto2.mostrarInformacion();
        //* Actualizar km auto 1
        System.out.println("----------Estado del kilometraje auto 1:----------");
        auto1.actualizarKilometraje(2430);
        System.out.println("----------Estado del kilometraje auto 1:----------");
        auto1.actualizarKilometraje(-120);
        //* Cambiar el estado de detallado del auto 2
        auto2.setDetallado(false);
        //*Informacion de ambos autos
        auto1.mostrarInformacion();
        auto2.mostrarInformacion();

        //? Pedido
        //* Constructor vacio
        Pedido pedido1 = new Pedido();
        pedido1.setNumeroPedido(2389);
        pedido1.setNombreCliente("Ana Alvarado");
        System.out.println("---------Lista de productos---------");
        pedido1.agregarProducto("Brocoli",1200);
        pedido1.agregarProducto("Berenjena",3500);
        pedido1.agregarProducto("Espinaca",800);
        pedido1.agregarProducto("Tomate",2300);
        pedido1.mostrarPedido();
        //* Aplicar descuento pedido 1 - invalido
        pedido1.calcularDescuento(125);
        //* Constructor con parametros
        Pedido pedido2 = new Pedido(6543, "Natalia Diaz");
        System.out.println("---------Lista de productos---------");
        pedido2.agregarProducto("Pepino",4600);
        pedido2.agregarProducto("Zanahoria",3700);
        pedido2.agregarProducto("Papa Amarilla",5300);
        pedido2.mostrarPedido();
        //* Aplicar descuento pedido 2
        pedido2.calcularDescuento(25);
    }
}
