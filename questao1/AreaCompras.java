package questao1;

// -- RQ1.6. COMPRAS
public class AreaCompras implements AreaInteressada{

    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        if (novaQuantidade < 5){
            System.out.println("\n[ALERTA] O Produto: " + nomeProduto + " está com estoque abaixo de 5! (" + novaQuantidade + " unidades).");
        }
    }
}
