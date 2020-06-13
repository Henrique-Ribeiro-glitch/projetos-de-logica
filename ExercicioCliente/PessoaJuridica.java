public class PessoaJuridica extends Cliente {

    private String CNPJ;
    private String razaoSocial;
    private int inscricaoEstadual;
    private String capitalInicial;

    public PessoaJuridica() {
        super();
    }
    
    public String getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public int getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getCapitalInicial() {
        return this.capitalInicial;
    }
    
    public void setCapitalInicial(String capitalInicial) {
        this.capitalInicial  = capitalInicial;
    }
    
    @Override
    public String toString() {
        return "\nCNPJ: " + this.CNPJ 
             + "\nRazao Social: " + this.razaoSocial
             + "\nInscricaoEstadual: " + this.inscricaoEstadual
             + "\nCapitalInicial: " + this.capitalInicial;
    }
    
}