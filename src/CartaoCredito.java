public class CartaoCredito implements MeioPagamento {
    private static final double JUROS = 0.12;
    private final int parcelas;

    public CartaoCredito(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public void pagar(double valor) {
        double total = valor * (1 + JUROS);
        double valorParcela = total / parcelas;
        System.out.printf("[CRÉDITO] Total: R$ %.2f em %dx de R$ %.2f%n", total, parcelas, valorParcela);
    }
}