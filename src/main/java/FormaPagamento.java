public abstract class FormaPagamento {

    public float calcularValorFinal(float valor) {
        return valor - this.calcularDesconto(valor) + this.calcularTaxa(valor);
    }

    protected abstract float calcularDesconto(float valor);

    protected float calcularTaxa(float valor) {
        return 0.0f;
    }
}
