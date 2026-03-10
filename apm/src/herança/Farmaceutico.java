package herança;

public class Farmaceutico extends Funcionario{
    private String crf;

    public Farmaceutico() {
    }

    public Farmaceutico(String crf) {
        this.crf = crf;
    }

    public Farmaceutico(String nome, double salario, String cpf, String crf) {
        super(nome, salario, cpf);
        this.crf = crf;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }
}
