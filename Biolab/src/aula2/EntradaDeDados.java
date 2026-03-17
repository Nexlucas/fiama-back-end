package aula2;
import java.util.Scanner;
public class EntradaDeDados {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nome= sc.next();
        int idade= sc.nextInt();
        Double altura= sc.nextDouble();
        Double peso= sc.nextDouble();
        Double imc= peso/(altura*altura);
        System.out.println(imc);
    }
}
