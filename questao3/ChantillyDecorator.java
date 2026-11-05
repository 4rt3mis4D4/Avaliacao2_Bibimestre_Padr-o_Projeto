package questao3;

// -- RQ3.3. Complemento Chantilly
public class ChantillyDecorator extends ABSCondimentDecorator{
    public ChantillyDecorator(iBebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }

    
}
