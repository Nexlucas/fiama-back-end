package atividadeentregar;

public class Bolo extends Doce{
    @Override
    public void cobertura() {
        super.cobertura();
        System.out.printf("Chocolate");
    }

    @Override
    public void massa() {
        super.massa();
        System.out.printf("Cenoura");
    }


}
