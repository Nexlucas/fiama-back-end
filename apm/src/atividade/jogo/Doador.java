package atividade.jogo;

public class Doador extends ADM{
    private String nickname;
    private String password;

    public Doador(){

    }

    public Doador(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public Doador(String nome, int idade, int id, String nickname, String password) {
        super(nome, idade, id);
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
