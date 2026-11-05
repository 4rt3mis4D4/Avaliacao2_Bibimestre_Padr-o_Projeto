package questao2;

// -- RQ2.2
public class PerfilRotativo implements CalculoTarifaStrategy{
    private static final double VALOR_POR_HORA = 10.0;

    @Override
    public double calcularValor(int tempoMinutos) {
        if (tempoMinutos <= 0){
            return 0.0;
        }

        int horasIniciadas = (tempoMinutos + 59) / 60;
        return horasIniciadas * VALOR_POR_HORA;
    }
}
