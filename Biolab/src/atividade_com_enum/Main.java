package atividade_com_enum;

public class Main {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos(1,"carlos",StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido.status.getGetDescricao());
        pedido.avancarStatus();
        pedido.avancarStatus();
        pedido.cancelarPedido();
        System.out.println(pedido.status.getGetDescricao());
    }
}
