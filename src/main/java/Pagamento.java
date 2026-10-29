public class Pagamento {

    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }

    public float pagar(FormaPagamento formaPagamento) {
        return formaPagamento.calcularValorFinal(valor);
    }

}
