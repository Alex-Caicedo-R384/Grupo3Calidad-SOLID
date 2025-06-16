public class ServicioCorreo {
    public void enviarNotificacionCorreo(PedidoPan pedido, String factura) {
        if (!pedido.getCliente().getCorreo().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Formato de correo inválido");
        }
        System.out.println("Enviando correo a " + pedido.getCliente().getCorreo() + ":\n" + factura);
    }
}