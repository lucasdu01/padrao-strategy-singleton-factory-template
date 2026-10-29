public class FormaPagamentoCartaoCredito extends FormaPagamento {

    private static FormaPagamentoCartaoCredito formaPagamentoCartaoCredito = new FormaPagamentoCartaoCredito();

    private FormaPagamentoCartaoCredito() {};

    public static FormaPagamentoCartaoCredito getInstancia() {
        return formaPagamentoCartaoCredito;
    }

    @Override
    protected float calcularDesconto(float valor) {
        return 0.0f;
    }

    @Override
    protected float calcularTaxa(float valor) {
        return valor * 0.03f;
    }
}
