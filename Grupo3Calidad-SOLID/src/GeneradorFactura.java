public class GeneradorFactura {
    public String generarFactura(PedidoPan pedido, double total) {
        StringBuilder factura = new StringBuilder();
        factura.append("Factura para ").append(pedido.getCliente().getNombre()).append("\n");
        factura.append("Panes:\n");
        for (Pan pan : pedido.getPanes()) {
            factura.append("- ").append(pan.getTipo()).append(": $").append(pan.getPrecio()).append("\n");
        }
        factura.append("Total: $").append(total);
        System.out.println(factura);
        return factura.toString();
    }
}