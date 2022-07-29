package escritorio;

public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public abstract String getDocumento();
    public abstract String getData();




}
