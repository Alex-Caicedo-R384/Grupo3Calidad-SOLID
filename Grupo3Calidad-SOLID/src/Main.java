//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana López", "ana@example.com");
        PedidoPan pedido = new PedidoPan("domicilio", cliente);
        pedido.agregarPan(new Pan("Baguette", 25.0));
        pedido.agregarPan(new Pan("Croissant", 15.0));
        double total = pedido.calcularTotal("fiel");
        System.out.println("Total: $" + total);
        pedido.generarFactura();
        pedido.enviarNotificacionCorreo();
        pedido.guardarEnBaseDatos();
    }
}