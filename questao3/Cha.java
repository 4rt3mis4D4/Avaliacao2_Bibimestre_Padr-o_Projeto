package questao3;

// -- RQ3.2 Bebida Base Chá
public class Cha implements iBebida{

    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public double getPreco() {
        return 4.00;
    }
    
}
