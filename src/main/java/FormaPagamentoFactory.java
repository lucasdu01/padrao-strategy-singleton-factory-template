public class FormaPagamentoFactory {

    public static FormaPagamento obterFormaPagamento(String formaPagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FormaPagamento" + formaPagamento);
            objeto = classe.getMethod("getInstancia").invoke(null);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Forma de pagamento inexistente");
        }
        if (!(objeto instanceof FormaPagamento)) {
            throw new IllegalArgumentException("Forma de pagamento inválida");
        }
        return (FormaPagamento) objeto;
    }
}
