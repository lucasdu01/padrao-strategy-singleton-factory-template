public class Pedido {

    private float valor;

    public Pedido(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public float pagar(String formaPagamento) {
        Pagamento pagamento = new Pagamento(this.valor);
        return pagamento.pagar(FormaPagamentoFactory.obterFormaPagamento(formaPagamento));
    }
}
