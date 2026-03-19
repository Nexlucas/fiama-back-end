package Atividade_personagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mago mago = new Mago("pato",300,5,15);
        Guerreiro guerreiro = new Guerreiro("Milton",450,20,30);
        Arqueiro arqueiro = new Arqueiro("Javier", 400,10,20);

        System.out.println("Mago pato digite 1");
        System.out.println("Guerreiro Milton digite 2");
        System.out.println("Arqueiro Javier digite 3");
        System.out.print("Escolha seu Personagem: ");
        int uso = sc.nextInt();
        System.out.println(" ");

        if (uso == 1){
            System.out.println("Soco digite 1");
            System.out.println("Ataque especial digite 2");
            System.out.print("Selecione qual ataque: ");
            int atak = sc.nextInt();
            System.out.println(" ");

            System.out.println("Guerreiro milton digite 1");
            System.out.println("Arqueiro Javier digite 2");
            System.out.print("atacar quem? ");
            int perso = sc.nextInt();
            System.out.println(" ");

            if (atak == 1){
                if (perso == 1){
                    mago.atacar(guerreiro);
                } else if (perso == 2) {
                    mago.atacar(arqueiro);
                }
            } else if (atak == 2) {
                if (perso == 1){
                    mago.podeDiamante(guerreiro);
                } else if (perso == 2) {
                    mago.podeDiamante(arqueiro);
                }

            }

        } else if (uso == 2) {
            System.out.println("Soco digite 1");
            System.out.println("Ataque especial digite 2");
            System.out.print("Selecione qual ataque: ");
            int atak = sc.nextInt();
            System.out.println(" ");

            System.out.println("Mago pato digite 1");
            System.out.println("Arqueiro Javier digite 2");
            System.out.print("atacar quem? ");
            int perso = sc.nextInt();
            System.out.println(" ");

            if (atak == 1){
                if (perso == 1){
                    guerreiro.atacar(mago);
                } else if (perso == 2) {
                    guerreiro.atacar(arqueiro);
                }
            } else if (atak == 2) {
                if (perso == 1) {
                    guerreiro.espadada(mago);
                } else if (perso == 2) {
                    guerreiro.espadada(arqueiro);
                }

            }
        }else if (uso == 3) {
            System.out.println("Soco digite 1");
            System.out.println("Ataque especial digite 2");
            System.out.print("Selecione qual ataque: ");
            int atak = sc.nextInt();
            System.out.println(" ");

            System.out.println("Mago pato digite 1");
            System.out.println("Guerreiro milton digite 2");
            System.out.print("atacar quem? ");
            int perso = sc.nextInt();
            System.out.println(" ");

            if (atak == 1){
                if (perso == 1){
                    arqueiro.atacar(mago);
                } else if (perso == 2) {
                    arqueiro.atacar(arqueiro);
                }
            } else if (atak == 2) {
                if (perso == 1) {
                    arqueiro.chuvaDeFlecha(mago);
                } else if (perso == 2) {
                    arqueiro.chuvaDeFlecha(guerreiro);
                }
            }

            }


        }
}
