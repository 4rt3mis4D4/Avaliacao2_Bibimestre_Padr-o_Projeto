package questao1;

// RQ1.6. VENDAS
public class AreaVendas implements AreaInteressada {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        if (quantidadeAntiga == 0 && novaQuantidade > 0){
            System.out.println("\n[ALERTA] O Produto: " + nomeProduto + " voltou a ter estoque (" + novaQuantidade + " unidades). Disponível para venda!");
        }
    }
    
}
