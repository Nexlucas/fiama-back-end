package gettersEsetters;

public class main {
    static void main() {
        Funcionarios funcionarios =  new Funcionarios();

        funcionarios.setNome("lucas");
        System.out.println(funcionarios.getNome());

        funcionarios.setSalario(1850);
        System.out.println(funcionarios.getSalario());

        funcionarios.setCargo("Caminhoneiro");
        System.out.println(funcionarios.getCargo());
    }
}
