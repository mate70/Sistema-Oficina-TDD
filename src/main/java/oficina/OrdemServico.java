package oficina;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    private Cliente cliente; 
    private Veiculo veiculo;
    private Mecanico mecanico;

    private List<Servico> servicos = new ArrayList<>();
    private List<Peca> pecas = new ArrayList<>();
    private double valorTotal = 0.0;

    public OrdemServico(Cliente cliente, Veiculo veiculo, Mecanico mecanico) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.mecanico = mecanico;
    }
    // Metodo para adicionar o servico e somar o valor
    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
        this.valorTotal += servico.getValor();
    }
    
    // Metodo para adicionar a peca e dar baixa no estoque dela e somar valor
    public void adicionarPeca(Peca peca, int qtd) {
        peca.removerDoEstoque(qtd);
        this.pecas.add(peca);
        this.valorTotal += peca.getPreco() * qtd;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }
}