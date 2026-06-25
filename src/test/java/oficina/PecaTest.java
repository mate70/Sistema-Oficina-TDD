package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PecaTest {
    @Test
    public void deveCriarPecaComSucesso() {
        
        //Nome, preço e quantidade
        Peca peca = new Peca("Filtro de óleo", 50.0, 5);
        assertEquals("Filtro de óleo", peca.getNome());
        assertEquals(50.0, peca.getPreco());
        assertEquals(5, peca.getQuantidade());
    }
    @Test
    public void deveRemoverItensDoEstoque() {
        Peca peca = new Peca("Filtro de óleo", 50.0, 5);
        peca.removerDoEstoque(2);
        assertEquals(3, peca.getQuantidade());
    }
    @Test
    public void naoDeveRemoverMaisItensDoQueExisteNoEstoque() {
        Peca peca = new Peca("Filtro de óleo", 50.0, 5);
        assertThrows(IllegalArgumentException.class, () -> {
            peca.removerDoEstoque(6);
        });
    }
}
