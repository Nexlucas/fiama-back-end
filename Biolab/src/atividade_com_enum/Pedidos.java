package atividade_com_enum;

public class Pedidos {
    int id;
    String cliente;
    StatusPedido status;

    public Pedidos() {
    }

    public Pedidos(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    public void avancarStatus(){
        this.status = this.status.proximo();
    }
    public void cancelarPedido(){
        if (this.status == StatusPedido.ENTREGUE){

        }else {
            this.status = StatusPedido.CANCELADO;
        }

    }
    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }
}

