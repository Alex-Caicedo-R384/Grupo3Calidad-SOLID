public class PanRegular implements Pan {
    private String tipo;
    private double precio;

    public PanRegular(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String getTipo() { return tipo; }

    @Override
    public double getPrecio() { return precio; }
}