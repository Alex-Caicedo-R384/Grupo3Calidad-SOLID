public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double total) {
        return total;
    }
}