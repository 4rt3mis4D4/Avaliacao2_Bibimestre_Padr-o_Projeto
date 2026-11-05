package questao1;

// -- RQ1.6. AUDITORIA
public class AreaAuditoria implements AreaInteressada{

    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        System.out.println("\n[ESTOQUE ALTERADO] Produto: " + nomeProduto + " |=| Estoque Antigo: " + quantidadeAntiga + " |=| Estoque Atual: " + novaQuantidade + ".");
    }
    
}
