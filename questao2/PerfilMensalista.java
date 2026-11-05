package questao2;

// -- RQ2.3
public class PerfilMensalista implements CalculoTarifaStrategy{
    private static final double VALOR_FIXO = 0.0;

    @Override
    public double calcularValor(int tempoMinutos) {
        return VALOR_FIXO;
    }
}
