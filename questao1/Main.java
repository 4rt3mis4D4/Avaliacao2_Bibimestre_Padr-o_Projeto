package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Teclado", 0);

        AreaInteressada compras = new AreaCompras();
        AreaInteressada vendas = new AreaVendas();
        AreaInteressada auditoria = new AreaAuditoria();

        notebook.incluirArea(compras);
        notebook.incluirArea(vendas);
        notebook.incluirArea(auditoria);

        // RQ1.8. 
        notebook.alterarEstoque(10); 

        notebook.alterarEstoque(10); 

        notebook.alterarEstoque(3); 

        notebook.removerArea(auditoria); 

        notebook.alterarEstoque(0); 

        notebook.alterarEstoque(8); 
    }
}