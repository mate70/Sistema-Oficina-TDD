package oficina;

public class Veiculo {
    private String placa;
    private Cliente dono;

    public Veiculo(String placa, Cliente dono) {
        this.placa = placa;
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public Cliente getDono() {
        return dono;
    }
}
