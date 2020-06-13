public class PessoaFisica extends Cliente{

    private String CPF;
    private String estadoCivil;
    private String dataDeNascimento;

    public PessoaFisica() {
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String toString() {
        return "\nCPF: " + this.CPF
             + "\nEstadoCivil: " + this.estadoCivil
             + "\nDataDeNascimento: " + this.dataDeNascimento;
    }
    
}
