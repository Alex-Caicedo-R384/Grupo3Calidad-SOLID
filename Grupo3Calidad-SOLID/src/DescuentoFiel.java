public class DescuentoFiel implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total * 0.95; // 5% descuento
    }
}

