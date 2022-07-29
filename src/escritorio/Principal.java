package escritorio;

public class Principal {

    public static void main(String[] args) {

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("Cobradora PG");
        empresa.setCnpj("94.679.343/0001-78");

        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("João Carlos");
        pessoa.setCpf("481.128.090-38");
        pessoa.setDataNascimento("20/03/1999");

        Divida divida = new Divida(pessoa, empresa, 1000.00);
        Acordo acordo = new Acordo(divida, Pagamento.CREDITO);

        System.out.println("-------Dados do Devedor-------\n"); 
        System.out.println("Nome: " + acordo.getDivida().getDevedora().getNome());
        System.out.println("Data de Nascimento: " + acordo.getDivida().getDevedora().getData());
        System.out.println("CPF: " + acordo.getDivida().getDevedora().getDocumento() + "\n");

        System.out.println("-------Dados da Empresa-------\n");
        System.out.println("Nome: " + acordo.getDivida().getCobradora().getNome());
        System.out.println("CNPJ: " + acordo.getDivida().getCobradora().getDocumento());
        System.out.println("Divida: R$" + acordo.getDivida().getValorDivida());
        System.out.println("Forma de Pagamento: " + acordo.getPagamento().name());
        System.out.println("Valor Total: R$" + acordo.getValorTotal());
        

    }
}
