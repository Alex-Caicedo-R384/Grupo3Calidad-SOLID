public interface ProcesadorPedido {
    double calcularTotal(PedidoPan pedido);
    String generarFactura(PedidoPan pedido, double total);
    void enviarNotificacionCorreo(PedidoPan pedido, String factura);
    void guardarEnBaseDatos(PedidoPan pedido);
}