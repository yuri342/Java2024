package Source.JavaBeans;

public class Produtos {
    private String nome;
    private int Quantidade;
    private double preco;

    public Produtos(){}

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
