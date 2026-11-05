package questao3;

// -- RQ3.8
public class ConsumidorDecorator {
    public static void main(String[] args) {
        iBebida pedido1 = new Espresso();
        pedido1 = new LeiteDecorator(pedido1);
        pedido1 = new ChantillyDecorator(pedido1);

        System.out.println("--- Pedido 1 ---");
        System.out.println("Descrição: " + pedido1.getDescricao());
        System.out.printf("Preço Total: R$ %.2f%n%n", pedido1.getPreco());

        iBebida pedido2 = new Cha();
        pedido2 = new CaldaDecorator(pedido2);

        System.out.println("--- Pedido 2 ---");
        System.out.println("Descrição: " + pedido2.getDescricao());
        System.out.printf("Preço Total: R$ %.2f%n%n", pedido2.getPreco());

        iBebida pedido3 = new Espresso();
        pedido3 = new LeiteDecorator(pedido3);
        pedido3 = new LeiteDecorator(pedido3); 
        pedido3 = new CaldaDecorator(pedido3);

        System.out.println("--- Pedido 3 ---");
        System.out.println("Descrição: " + pedido3.getDescricao());
        System.out.printf("Preço Total: R$ %.2f%n", pedido3.getPreco());
    }
}