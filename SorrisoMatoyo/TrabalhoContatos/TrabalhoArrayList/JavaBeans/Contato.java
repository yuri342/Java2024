package JavaBeans;


public class Contato {
    private String Nome;
    private long Telefone;
    private long Celular;
    private String Email;
    private String Grupo;
    private String ContatoPricipal;

    public Contato(){}


    public String getContatoPricipal() {
        return ContatoPricipal;
    }
    public long getCelular() {
        return Celular;
    }
    public String getEmail() {
        return Email;
    }
    public String getGrupo() {
        return Grupo;
    }
    public String getNome() {
        return Nome;
    }
    public long getTelefone() {
        return Telefone;
    }
    public void setCelular(long celular) {
        Celular = celular;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setGrupo(String grupo) {
        Grupo = grupo;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setTelefone(long telefone) {
        Telefone = telefone;
    }
    public void setContatoPricipal(String contatoPricipal) {
        ContatoPricipal = contatoPricipal;
    }
}
