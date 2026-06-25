package oficina;

public class Veiculo {
    private String placa;
    private Cliente dono;
    private String modelo;

    public Veiculo(String placa, Cliente dono, String modelo) {
        this.placa = placa;
        this.dono = dono;
        this.modelo = modelo;

    }
    public String getPlaca() {
        return placa;
    }
    public Cliente getDono() {
        return dono;
    }
    public String getModelo() {
        return modelo;
    }
}
