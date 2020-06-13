public class Cliente {

    private int codigo;
    private String nome;
    private String profissao;

    public Cliente() {
    }
    
    public Cliente(int codigo, String nome, String profissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.profissao = profissao;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String toString() {
        return "\nCodigo: " + this.codigo
             + "\nNome: " + this.nome 
             + "\nProfissão: " + this.profissao;
    }
}
