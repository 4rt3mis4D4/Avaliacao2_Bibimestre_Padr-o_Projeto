package questao3;

// -- RQ3.3. Complemento Leite
public class LeiteDecorator extends ABSCondimentDecorator{
    public LeiteDecorator(iBebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
}
