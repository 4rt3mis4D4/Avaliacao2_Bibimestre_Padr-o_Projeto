package questao2;

public class Tiquete {
    // -- RQ2.1
    private String placa;
    private int tempoPermanenciaMinutos;
    private CalculoTarifaStrategy perfilCobranca;

    public Tiquete(String placa, int tempoPermanenciaMinutos, CalculoTarifaStrategy perfilInicial){
        this.placa = placa;
        this.tempoPermanenciaMinutos = tempoPermanenciaMinutos;
        this.perfilCobranca = perfilInicial;
    }

    public void setPerfilCobranca(CalculoTarifaStrategy novoPerfil){
        this.perfilCobranca = novoPerfil;
    }

    public double calcularValorPagar(){
        return perfilCobranca.calcularValor(this.tempoPermanenciaMinutos);
    }

    public String getPlaca(){
        return placa;
    }

    public int getTempoPermanenciaMinuto(){
        return tempoPermanenciaMinutos;
    }
}
