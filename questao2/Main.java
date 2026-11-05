package questao2;

public class Main {
    public static void main(String[] args) {
        int tempoPermanencia = 90; 

        System.out.println("Tempo Permanencia: " + tempoPermanencia);
        System.out.println();
        
        CalculoTarifaStrategy rotativo = new PerfilRotativo();
        CalculoTarifaStrategy mensalista = new PerfilMensalista();
        CalculoTarifaStrategy conveniado = new PerfilConveniado();

        
        Tiquete t1 = new Tiquete("A30-ADB", tempoPermanencia, rotativo);
        Tiquete t2 = new Tiquete("UYQ-12Q", tempoPermanencia, mensalista);
        Tiquete t3 = new Tiquete("TQ8-13A", tempoPermanencia, conveniado);

        System.out.printf("\nPerfil Rotativo | Placa Veículo: %s | Valor a Pagar: R$ %.2f%n", t1.getPlaca(), t1.calcularValorPagar());
        System.out.printf("\nPerfil Mensalista | Placa Veículo: %s | Valor a Pagar: R$ %.2f%n", t2.getPlaca(), t2.calcularValorPagar());
        System.out.printf("\nPerfil Conveniado | Placa Veículo: %s | Valor a Pagar: R$ %.2f%n", t3.getPlaca(), t3.calcularValorPagar());

        Tiquete tiqueteDinamico = new Tiquete("GAB-I21", 75, rotativo);

        // -- Rotativo
        System.out.println();
        System.out.printf("\nPlaca Veículo %s | Permanência: %d min | Valor a Pagar: R$ %.2f%n",
                        tiqueteDinamico.getPlaca(), 
                        tiqueteDinamico.getTempoPermanenciaMinuto(), 
                        tiqueteDinamico.calcularValorPagar()
                        );
        
        // -- Conveniado
        tiqueteDinamico.setPerfilCobranca(conveniado);
        System.out.printf("\nPlaca Veículo %s | Permanência: %d min | Valor a Pagar: R$ %.2f%n",
                tiqueteDinamico.getPlaca(), tiqueteDinamico.getTempoPermanenciaMinuto(), tiqueteDinamico.calcularValorPagar());
        
        // -- Mensalista
        tiqueteDinamico.setPerfilCobranca(mensalista);
        System.out.printf("\nPlaca Veículo %s | Permanência: %d min | Valor a Pagar: R$ %.2f%n",
                tiqueteDinamico.getPlaca(), tiqueteDinamico.getTempoPermanenciaMinuto(), tiqueteDinamico.calcularValorPagar());
    }
}