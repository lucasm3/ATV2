import java.util.List;

public class Main {
    public static void main(String[] args) {
        double valorCompra = 250.00;

        List<MeioPagamento> formas = List.of(
                new BoletoBancario(),
                new CartaoCredito(3),
                new CartaoDebito(),
                new TransferenciaPix()
        );

        System.out.println("=== Compra de R$ " + valorCompra + " ===");
        for (MeioPagamento forma : formas) {
            forma.pagar(valorCompra);
        }
    }
}