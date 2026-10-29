public class FormaPagamentoCartaoDebito extends FormaPagamento {

    private static FormaPagamentoCartaoDebito formaPagamentoCartaoDebito = new FormaPagamentoCartaoDebito();

    private FormaPagamentoCartaoDebito() {};

    public static FormaPagamentoCartaoDebito getInstancia() {
        return formaPagamentoCartaoDebito;
    }

    @Override
    protected float calcularDesconto(float valor) {
        return 0.0f;
    }

    @Override
    protected float calcularTaxa(float valor) {
        return valor * 0.01f;
    }
}
