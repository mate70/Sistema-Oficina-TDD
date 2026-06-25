package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PecaTesta {
    @Test
    public void deveCriarPecaComSucesso() {
        
        //Nome, preço e quantidade
        Peca peca = new Peca("Filtro de óleo", 50.0, 5);
        assertEquals("Filtro de óleo", peca.getNome());
        assertEquals(50.0, peca.getPreco());
        assertEquals(5, peca.getQuantidade());
    }
}
