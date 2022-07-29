package escritorio;

public class Acordo {

    private Divida divida;
    private Pagamento pagamento;
    private Double valorTotal;


    public Acordo(Divida divida, Pagamento pagamento) {
        this.divida = divida;
        this.setPagamento(pagamento);
    }

    public Divida getDivida(){
        return divida;
    }

    public Pagamento getPagamento(){
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento){

        this.pagamento = pagamento;
        setValorTotal();

    }

    public Double getValorTotal(){
        return valorTotal;
    }

    private void setValorTotal(){
        this.valorTotal = this.divida.getValorDivida() * (1 + pagamento.getTaxaDeCobranca());

    }
    

   

}
