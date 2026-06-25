package oficina;

public class Servico {
    private String nome;
    private double valor;

    public Servico(String nome, double valor) {
        //Regra de negócio: O valor do serviço não pode ser negativo
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do serviço não pode ser negativo.");
        }
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
