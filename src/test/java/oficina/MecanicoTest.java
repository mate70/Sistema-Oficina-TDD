package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MecanicoTest {
    @Test
    public void deveCriarMecanicoComSucesso() {
        Mecanico mecanico = new Mecanico("João","Especialidade", "1234");
        assertEquals("João", mecanico.getNome());
        assertEquals("Especialidade", mecanico.getEspecialidade());
        assertEquals("1234", mecanico.getMatriculo());
    }
}
