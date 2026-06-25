package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MecanicoTest {
    @Test
    public void deveCriarMecanicoComSucesso() {
        Mecanico mecanico = new Mecanico("João");
        assertEquals("João", mecanico.getNome());
    }
}
