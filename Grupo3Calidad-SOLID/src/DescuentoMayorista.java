public class DescuentoMayorista implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.90; // 10% descuento
    }
}