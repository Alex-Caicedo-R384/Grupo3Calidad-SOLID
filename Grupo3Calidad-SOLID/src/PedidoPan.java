import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PedidoPan {
    private List<Pan> panes = new ArrayList<>();
    private String tipoPedido; // "local" o "domicilio"
    private Cliente cliente;

    public PedidoPan(String tipoPedido, Cliente cliente) {
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
    }

    public void agregarPan(Pan pan) {
        panes.add(pan);
    }

    // Viola SRP, OCP
    public double calcularTotal(String tipoDescuento) {
        double total = 0.0;
        for (Pan pan : panes) {
            total += pan.getPrecio();
        }
        if (tipoDescuento.equals("fiel")) {
            total *= 0.95; // 5% descuento
        } else if (tipoDescuento.equals("mayorista")) {
            total *= 0.90; // 10% descuento
        }
        if (tipoPedido.equals("domicilio")) {
            total += 50.0; // Costo de envío
        }
        return total;
    }

    // Viola SRP
    public void generarFactura() {
        System.out.println("Generando factura PDF para " + cliente.getNombre() + " con " + panes.size() + " panes.");
    }

    // Viola SRP
    public void enviarNotificacionCorreo() {
        System.out.println("Enviando correo a " + cliente.getCorreo() + " sobre el pedido.");
    }

    // Viola SRP
    public void guardarEnBaseDatos() {
        System.out.println("Guardando pedido de " + cliente.getNombre() + " en la base de datos MySQL.");
    }

    public List<Pan> getPanes() { return panes; }
    public String getTipoPedido() { return tipoPedido; }
    public Cliente getCliente() { return cliente; }
}