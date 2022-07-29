package escritorio;

public enum Pagamento {

    DEBITO(0.05), CREDITO(0.15), BOLETO(0.10);

    private Double taxaDeCobranca;

    Pagamento(Double taxaDeCobranca){
        this.taxaDeCobranca = taxaDeCobranca;
    }

    public Double getTaxaDeCobranca(){
        return taxaDeCobranca;
    }
}
