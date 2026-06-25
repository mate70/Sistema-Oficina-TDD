package oficina;
public class Peca {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Peca(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void removerDoEstoque(int qtd) {
        if (qtd > this.quantidade) {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque.");
        }
        this.quantidade -= qtd;
    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
