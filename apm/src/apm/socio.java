package apm;

public class socio {
    private String nome;
    private int cpf;
    private String email;
    private int telefone;

    public socio(String nome, int cpf, String email, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(){
        this.cpf = cpf;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email = email;
    }

    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(){
        this.telefone = telefone;
    }

}
