package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();


        banco.add(new Pessoa(1,"lucas",20));
        banco.add(new Pessoa(2,"antonio",20));
        banco.add(new Pessoa(3,"rikelme",20));
        banco.add(new Pessoa(4,"rafael",15));
        banco.add(new Pessoa(5,"gabriel",16));
        cache.add(new Pessoa(6,"douglas",30));
        cache.add(new Pessoa(7,"bruno",25));
        cache.add(new Pessoa(8,"caio",21));
        cache.add(new Pessoa(9,"sandro",18));
        cache.add(new Pessoa(10,"leonardo",29));

    }
}
