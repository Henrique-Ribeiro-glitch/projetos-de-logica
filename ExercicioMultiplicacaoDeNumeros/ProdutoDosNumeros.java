public class ProdutoDosNumeros{
    
    private double numero1;
    private double numero2;
    private double numero3;
    
    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double getNumero3() {
        return this.numero3;
    }
    
    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }
    
    public double multiplicar() {
        return numero1 * numero2 * numero3;
    }
    
    @Override
    public String toString() {
        return "O numero 1 é: " + this.getNumero1()
              +"\nO numero 2 é: " + this.getNumero2()
              +"\nO numero 3 é: " + this.getNumero3()
              +"\nProduto dos numeros: " + this.multiplicar();
    }
}    