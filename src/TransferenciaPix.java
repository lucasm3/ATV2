public class TransferenciaPix implements MeioPagamento {
    private static final double DESCONTO = 0.02;

    @Override
    public void pagar(double valor) {
        double total = valor - (valor * DESCONTO);
        System.out.printf("[PIX] Valor com 2%% de desconto: R$ %.2f%n", total);
    }
}