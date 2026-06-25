package oficina;

public class Mecanico {
    private String nome;
    private String especialidade;
    private String matriculo;

    public Mecanico(String nome, String especialidade, String matriculo) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.matriculo = matriculo;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getMatriculo() {
        return matriculo;
    }
}
