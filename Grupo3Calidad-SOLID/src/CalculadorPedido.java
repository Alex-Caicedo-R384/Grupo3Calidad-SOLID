public class CalculadorPedido {
    public double calcularTotal(PedidoPan pedido, String tipoDescuento) {
        double total = pedido.getPanes().stream().mapToDouble(Pan::getPrecio).sum();
        if (tipoDescuento.equals("fiel")) {
            total *= 0.95;
        } else if (tipoDescuento.equals("mayorista")) {
            total *= 0.90;
        }
        if (pedido.getTipoPedido().equals("domicilio")) {
            total += 50.0;
        }
        return total;
    }
}