public class PanSinGluten implements Pan {
    private String tipo;
    private double precio;

    public PanSinGluten(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String getTipo() { return tipo + " (Sin Gluten)"; }

    @Override
    public double getPrecio() { return precio * 1.3; } // 30% más caro
}