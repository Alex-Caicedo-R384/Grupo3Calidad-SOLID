public class CostoDomicilio implements EstrategiaCostoAdicional {
    @Override
    public double aplicarCostoAdicional(double total) {
        return total + 50.0;
    }
}