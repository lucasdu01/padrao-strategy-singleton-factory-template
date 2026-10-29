public class FormaPagamentoDinheiro extends FormaPagamento {

    private static FormaPagamentoDinheiro formaPagamentoDinheiro = new FormaPagamentoDinheiro();

    private FormaPagamentoDinheiro() {};

    public static FormaPagamentoDinheiro getInstancia() {
        return formaPagamentoDinheiro;
    }

    @Override
    protected float calcularDesconto(float valor) {
        return valor * 0.10f;
    }
}
