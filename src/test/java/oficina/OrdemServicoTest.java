package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OndemServicoTest {
    @Test  
    public void deveCriarOrdemServicoComSucesso() {
        Cliente cliente = new Cliente("Matheus", "123.456.789-00", "(11) 98765-4321");
        Veiculo veiculo = new Veiculo("ABC-1234", cliente, "Carro");
        Mecanico mecanico = new Mecanico("João","Especialidade", "1234");
        
        OrdemServico ordemServico = new OrdemServico(cliente, veiculo, mecanico);
        assertEquals(cliente, ordemServico.getCliente());
        assertEquals(veiculo, ordemServico.getVeiculo());
        assertEquals(mecanico, ordemServico.getMecanico());
    }
}
