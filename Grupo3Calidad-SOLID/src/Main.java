//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana López", "ana@example.com");
        PedidoPan pedido = new PedidoPan("domicilio", cliente);
        pedido.agregarPan(new PanRegular("Baguette", 25.0));
        pedido.agregarPan(new PanSinGluten("Croissant", 15.0));

        CalculadorPedido calculador = new CalculadorPedido(new DescuentoFiel(), new CostoDomicilio());
        double total = calculador.calcularTotal(pedido);

        GeneradorFactura generadorFactura = new GeneradorFactura();
        String factura = generadorFactura.generarFactura(pedido, total);

        ServicioCorreo servicioCorreo = new ServicioCorreo();
        servicioCorreo.enviarNotificacionCorreo(pedido, factura);

        ServicioBaseDatos servicioBD = new ServicioBaseDatos();
        servicioBD.guardarEnBaseDatos(pedido);

        System.out.println("Total: $" + total);
    }
}