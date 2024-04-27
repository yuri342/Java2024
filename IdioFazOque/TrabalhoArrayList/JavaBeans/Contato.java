package TrabalhoArrayList.JavaBeans;

public class Contato {
    private String nome;
    private Long telefone;
    private long celular;
    private String email;
    private String grupo;
    @SuppressWarnings("unused")
    private boolean cellPrincipal;
    @SuppressWarnings("unused")
    private boolean telefonePrincipal;

    public Contato(){}

    public long getCelular() {
        return celular;
    }
    public String getEmail() {
        return email;
    }
    public String getGrupo() {
        return grupo;
    }
    public String getNome() {
        return nome;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setCellPrincipal(boolean cellPrincipal) {
        this.cellPrincipal = cellPrincipal;
    }
    public void setCelular(long celular) {
        this.celular = celular;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public void setTelefonePrincipal(boolean telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }
}
