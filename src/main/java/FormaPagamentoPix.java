public class FormaPagamentoPix extends FormaPagamento {

    private static FormaPagamentoPix formaPagamentoPix = new FormaPagamentoPix();

    private FormaPagamentoPix() {};

    public static FormaPagamentoPix getInstancia() {
        return formaPagamentoPix;
    }

    @Override
    protected float calcularDesconto(float valor) {
        return valor * 0.05f;
    }
}
