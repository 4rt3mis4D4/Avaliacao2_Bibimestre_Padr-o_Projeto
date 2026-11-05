package questao3;

public abstract class ABSCondimentDecorator implements iBebida{
    protected iBebida bebida;

    public ABSCondimentDecorator(iBebida bebida){
        this.bebida = bebida;
    }
}
