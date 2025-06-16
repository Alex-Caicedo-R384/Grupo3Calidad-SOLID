public class CalculadorPedido implements Calculable {
    private final EstrategiaDescuento descuento;
    private final EstrategiaCostoAdicional costoAdicional;

    public CalculadorPedido(EstrategiaDescuento descuento, EstrategiaCostoAdicional costoAdicional) {
        this.descuento = descuento;
        this.costoAdicional = costoAdicional;
    }

    @Override
    public double calcularTotal(PedidoPan pedido) {
        double total = pedido.getPanes().stream().mapToDouble(Pan::getPrecio).sum();
        total = descuento.aplicarDescuento(total);
        total = costoAdicional.aplicarCostoAdicional(total);
        return total;
    }
}