package escritorio;

public class Divida {
    private Pessoa devedora;
    private Pessoa cobradora;
    private double valorDivida;

    public double getValorDivida() {
        return valorDivida;
    }

    public Pessoa getCobradora() {
        return cobradora;
    }

    public Pessoa getDevedora() {
        return devedora;
    }

    public Divida(Pessoa devedora, Pessoa cobradora, double valorDivida){

        this.devedora = devedora;
        this.cobradora = cobradora;
        this.valorDivida = valorDivida;

    }

}
