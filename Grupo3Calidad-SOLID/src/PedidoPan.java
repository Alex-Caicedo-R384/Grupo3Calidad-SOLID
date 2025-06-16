import java.util.ArrayList;
import java.util.List;

public class PedidoPan {
    private List<Pan> panes = new ArrayList<>();
    private String tipoPedido;
    private Cliente cliente;

    public PedidoPan(String tipoPedido, Cliente cliente) {
        if (tipoPedido == null || (!tipoPedido.equals("local") && !tipoPedido.equals("domicilio"))) {
            throw new IllegalArgumentException("Tipo de pedido inválido");
        }
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
    }

    public void agregarPan(Pan pan) {
        if (pan == null || pan.getPrecio() <= 0) {
            throw new IllegalArgumentException("Pan inválido");
        }
        panes.add(pan);
    }

    public List<Pan> getPanes() { return panes; }
    public String getTipoPedido() { return tipoPedido; }
    public Cliente getCliente() { return cliente; }
}