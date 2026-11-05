package questao3;

// -- RQ3.3. Complemento Calda
public class CaldaDecorator extends ABSCondimentDecorator {

    public CaldaDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.75;
    }
    
}
