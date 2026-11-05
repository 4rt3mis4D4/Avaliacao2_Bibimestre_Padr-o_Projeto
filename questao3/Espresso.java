package questao3;

// -- RQ3.2 Bebida Base Espresso
public class Espresso implements iBebida {

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
    
}
