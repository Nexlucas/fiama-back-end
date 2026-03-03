package aula1;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Seu animal e um cachorro ou gato? (1 pra cachorro e 2 pra gato)");
        int tipo = sc.nextInt();

        if (tipo == 1){
            String teste = sc.nextLine();

            IO.println("Digite o nome do cachorro:");
            String nome = sc.nextLine();

            IO.println("Digite o sexo do cachorro:");
            String sexo = sc.nextLine();

            IO.println("Digite a idade do cachorro:");
            int idade = sc.nextInt();

            animal cachorro = new animal(nome,sexo,idade);


            IO.println(cachorro);
        } else if (tipo == 2) {

            String teste = sc.nextLine();

            IO.println("Digite o nome do gato:");
            String nome = sc.nextLine();

            IO.println("Digite o sexo do gato:");
            String sexo = sc.nextLine();

            IO.println("Digite a idade do gato:");
            int idade = sc.nextInt();

            animal gato = new animal(nome,sexo,idade);


            IO.println(gato);
        }


    }
}
