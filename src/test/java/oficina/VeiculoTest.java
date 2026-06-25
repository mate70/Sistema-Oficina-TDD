package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VeiculoTest {
    @Test
    public void deveCriarVeiculoComSucesso() {
       Cliente dono = new Cliente("Matheus", "123", "999");
       Veiculo carro = new Veiculo("ABC-1234", dono);
       assertEquals("ABC-1234", carro.getPlaca());
    }
}
