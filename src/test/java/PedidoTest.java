import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarValorPagamentoDinheiro() {
        Pedido pedido = new Pedido(100.0f);
        assertEquals(90.0f, pedido.pagar("Dinheiro"));
    }

    @Test
    void deveRetornarValorPagamentoPix() {
        Pedido pedido = new Pedido(100.0f);
        assertEquals(95.0f, pedido.pagar("Pix"));
    }

    @Test
    void deveRetornarValorPagamentoCartaoCredito() {
        Pedido pedido = new Pedido(100.0f);
        assertEquals(103.0f, pedido.pagar("CartaoCredito"));
    }

    @Test
    void deveRetornarValorPagamentoCartaoDebito() {
        Pedido pedido = new Pedido(100.0f);
        assertEquals(101.0f, pedido.pagar("CartaoDebito"));
    }

    @Test
    void deveRetornarExcecaoParaFormaPagamentoInexistente() {
        try {
            Pedido pedido = new Pedido(100.0f);
            pedido.pagar("Boleto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarMesmaInstanciaFormaPagamento() {
        assertSame(FormaPagamentoPix.getInstancia(), FormaPagamentoFactory.obterFormaPagamento("Pix"));
    }
}
