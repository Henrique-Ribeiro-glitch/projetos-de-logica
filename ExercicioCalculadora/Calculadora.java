public class Calculadora {

    private double numero1;
    private double numero2;
    int espoente = 3;
    
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

    public double somar() {
        return numero1 + numero2;
    }
    
    public double subtrair() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }
    
    public double dividir() {
        return numero1 / numero2;
    }
    
    public double calcularRaizQuadradaDoNumero1() {
        return Math.sqrt(numero1);
    }
    
    public double calcularPotenciaDoNumero1() {
        return Math.pow(numero1, 2);
    }
    
    public double calcularPotenciaDoNumero2(int espoente) {
        return Math.pow(numero2, espoente);
    }
    
    @Override
    public String toString() {
        return "O numero 1 é: " + this.numero1
               +"\nO numero 2 é: " + this.getNumero2()
               +"\nResultado da soma:" + this.somar()
               +"\nResultado da subtração:" + this.subtrair()
               +"\nResultado da multiplicação:" + this.multiplicar()
               +"\nResultado da divisão:" + this.dividir()
               +"\nResultado da raiz quadrada do número1:" + this.calcularRaizQuadradaDoNumero1()
               +"\nResultado da potência do número 1:" + this.calcularPotenciaDoNumero1()
               +"\nResultado da potencia do numero 2:" + this.calcularPotenciaDoNumero2(espoente);
    }
}
