package JavaBeans;

public class Cliente {
    private String Nome;
    private long Cpf;

    public Cliente(){}

    public String getNome() {
        return Nome;
    }
    public long getCpf() {
        return Cpf;
    }
    public void setCpf(long cpf) {
        Cpf = cpf;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
}
