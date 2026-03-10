package Atividade;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Vaca vaca = new Vaca();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        vaca.setNome("mimosa");
        vaca.setCor("Preto e Branco");
        cachorro.setNome("Betoven");

        System.out.printf(vaca.toString());
        vaca.fazersom();


    }
}
