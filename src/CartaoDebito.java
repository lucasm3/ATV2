public class CartaoDebito implements MeioPagamento {
    private static final double TAXA = 0.01;

    @Override
    public void pagar(double valor) {
        double total = valor + (valor * TAXA);
        System.out.printf("[DÉBITO] Total debitado da conta: R$ %.2f%n", total);
    }
}