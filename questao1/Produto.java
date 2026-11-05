package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    // -- RQ1.1. 
    private String nome;
    private int quantidadeEstoque;

    private List<AreaInteressada> areasInteressadas = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial){
        this.nome = nome;
        this.quantidadeEstoque = quantidadeInicial;
    }

    public void incluirArea(AreaInteressada area){
        areasInteressadas.add(area);
    }

    // -- RQ1.5
    public void removerArea(AreaInteressada area){
        areasInteressadas.remove(area);
    }

    // -- RQ1.2.
    public void alterarEstoque(int novaQuant){
        // -- RQ1.4. 
        if (this.quantidadeEstoque == novaQuant){
            return;
        } 

        int quantidadeAntiga = this.quantidadeEstoque;
        this.quantidadeEstoque = novaQuant;

        notificarAreas(quantidadeAntiga, this.quantidadeEstoque);
    }

    // -- RQ1.3. 
    private void notificarAreas(int quantAntiga, int quantNova){
        for(AreaInteressada area : areasInteressadas){
            area.atualizar(this.nome, quantAntiga, quantNova);
        }
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
}
