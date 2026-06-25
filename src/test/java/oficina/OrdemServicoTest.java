package oficina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OrdemServicoTest {
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
    @Test
    public void deveCalcularValorTotalEBaixarEstoqueComSucesso() {
        Cliente cliente = new Cliente("Matheus", "123.456.789-00", "(11) 98765-4321");
        Veiculo veiculo = new Veiculo("ABC-1234", cliente, "Carro");
        Mecanico mecanico = new Mecanico("João","Especialidade", "1234");
        
        OrdemServico os = new OrdemServico(cliente, veiculo, mecanico);
       
        //Instacia pecas e servicos
        Peca filtro = new Peca("Filtro de óleo", 50.0, 5);
        Servico trocaOleo = new Servico("Troca de óleo", 100.0);

        //Executa as ações os
        os.adicionarPeca(filtro, 2);
        os.adicionarServico(trocaOleo);

        //Calcula o valor total e verifica se a quantidade de peças no estoque foi atualizada corretamente
        assertEquals(200.0, os.getValorTotal());
        assertEquals(3, filtro.getQuantidade());
    }
}
