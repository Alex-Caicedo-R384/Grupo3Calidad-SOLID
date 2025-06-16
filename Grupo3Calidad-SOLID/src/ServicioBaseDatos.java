public class ServicioBaseDatos implements Persistible {
    @Override
    public void guardarEnBaseDatos(PedidoPan pedido) {
        System.out.println("Guardando pedido de " + pedido.getCliente().getNombre() + " en la base de datos MySQL.");
    }
}