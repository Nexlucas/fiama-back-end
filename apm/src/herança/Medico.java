package herança;

public class Medico extends Funcionario{
    private String crm;

    public Medico() {
    }

    public Medico(String crm) {
        this.crm = crm;
    }

    public Medico(String nome, double salario, String cpf, String crm) {
        super(nome, salario, cpf);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
