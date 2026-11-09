public class BoletoBancario implements MeioPagamento {
    private static final double TAXA_PERCENTUAL = 0.03;
    private static final double TAXA_FIXA = 2.50;

    @Override
    public void pagar(double valor) {
        double total = valor + (valor * TAXA_PERCENTUAL) + TAXA_FIXA;
        System.out.printf("[BOLETO] Valor original: R$ %.2f | Total com taxas: R$ %.2f%n", valor, total);
    }
}