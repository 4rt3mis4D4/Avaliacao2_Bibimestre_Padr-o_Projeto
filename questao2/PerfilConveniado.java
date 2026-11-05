package questao2;

// -- RQ2.4
public class PerfilConveniado implements CalculoTarifaStrategy {
    private static final double VALOR_POR_HORA = 10.0;
    private static final double DESCONTO_PERCENTUAL = 0.20;
    private static final int MINUTOS_GRATUITOS = 30;

    @Override
    public double calcularValor(int tempoMinutos) {
        if (tempoMinutos <= MINUTOS_GRATUITOS){
            return 0.0;
        }

        int tempoExcedente = tempoMinutos - MINUTOS_GRATUITOS;
        int horasIniciadas = (tempoExcedente + 59) / 60;

        double valorBruto = horasIniciadas * VALOR_POR_HORA;
        return valorBruto*(1.0 - DESCONTO_PERCENTUAL);
    }
    
}
