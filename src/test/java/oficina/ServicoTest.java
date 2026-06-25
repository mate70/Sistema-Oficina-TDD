package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoTest {
    @Test
    public void deveCriarServicoComSucesso() {
        // Teste para verificar a criação de um serviço
        Servico servico = new Servico("alinhamento e balanceamento", 100.0);
        assertEquals("alinhamento e balanceamento", servico.getNome());
        assertEquals(100.0, servico.getValor());
    }
}
