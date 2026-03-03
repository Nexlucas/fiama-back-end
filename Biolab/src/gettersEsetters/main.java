package gettersEsetters;

public class main {
    static void main() {
        Funcionarios funcionarios =  new Funcionarios();

        funcionarios.setNome("lucas");
        IO.println(funcionarios.getNome());

        funcionarios.setSalario(1850);
        IO.println(funcionarios.getSalario());

        funcionarios.setCargo("Caminhoneiro");
        IO.println(funcionarios.getCargo());
    }
}
