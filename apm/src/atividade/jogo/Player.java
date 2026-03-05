package atividade.jogo;

public class Player extends ADM {
    private String nickname;
    private String password;

    public Player() {
    }

    public Player(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public Player(String nome, int idade, int id, String nickname, String password) {
        super(nome, idade, id);
        this.nickname = nickname;
        this.password = password;
    }
}
