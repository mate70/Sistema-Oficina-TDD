package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCriarClienteComSucesso() {
        Cliente cliente = new Cliente("Matheus", "123.456.789-00");
        assertEquals("Matheus", cliente.getNome());
        assertEquals("123.456.789-00", cliente.getCpf());
    }
}