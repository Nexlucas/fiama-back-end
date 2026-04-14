package atividade_com_enum;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Seu pedido aguarda o pagamento"),
    PROCESSANDO("Seu pedido está sendo processado"),
    ENVIADO("Seu pedido foi enviado"),
    ENTREGUE("Seu pedido foi entregue"),
    CANCELADO("Seu pedido foi cancelado");

    public StatusPedido proximo() {
        switch (this) {
            case AGUARDANDO_PAGAMENTO:
                return PROCESSANDO;
            case PROCESSANDO:
                return ENVIADO;
            case ENVIADO:
                return ENTREGUE;
            case ENTREGUE:
                return ENTREGUE;
            case CANCELADO:
                return CANCELADO;
        }
        return this;
    }

    private String getDescricao;

    StatusPedido(String getDescricao) {
        this.getDescricao = getDescricao;
    }

    public String getGetDescricao() {
        return getDescricao;
    }

}
