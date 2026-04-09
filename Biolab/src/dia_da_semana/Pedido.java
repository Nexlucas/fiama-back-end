package dia_da_semana;

public class Pedido {
    private int id;
    private String nomeCliente;
    private Status status;

    public Pedido() {}

    public Pedido(int id, String nomeCliente, Status status) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{ " +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", status=" + status +
                " }";
    }
}
