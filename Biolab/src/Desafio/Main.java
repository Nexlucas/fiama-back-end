package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();


        banco.add(new Pessoa(1,"lucas",20));
        banco.add(new Pessoa(2,"antonio",20));
        banco.add(new Pessoa(3,"rikelme",20));
        banco.add(new Pessoa(4,"rafael",15));
        banco.add(new Pessoa(5,"gabriel",16));
        cache.add(new Pessoa());
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID");
        int id = sc.nextInt();
        boolean encontrada = false;


        for(Pessoa pessoa : cache){
            if (id == pessoa.getId()) {
                System.out.println("Pessoa encontrada no cache: " + pessoa);
                encontrada = true;
            }
        }


        if (!encontrada) {
            for (Pessoa pessoa : banco) {
                if (id == pessoa.getId()) {
                    System.out.println("Pessoa encontrada no banco: " + pessoa);
                    cache.add(pessoa);
                }
            }
        }


    }
}
