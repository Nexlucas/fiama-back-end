package dia_da_semana;

public class Main {
    public static void main(String[] args) {


       Pedido pedido = new Pedido(1,"Igor",Status.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        pedido.setStatus(Status.CANCELADO);

        System.out.println(pedido);

    }
}
