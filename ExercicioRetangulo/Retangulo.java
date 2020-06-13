public class Retangulo{
    
    private double base;
    private double altura;
    
    public Retangulo() {
    }
    
    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }
    
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularAreaDoRetangulo() {
        return base * altura;
    }
    
    public double calcularPerimetroDoRetangulo() {
        return 2 * base + 2 * altura;
    }
    
    @Override
    public String toString() {
        return "Retangulo:"
             + "\nBase: " + this.getBase()
             + "\nAltura: " + this.getAltura()
             + "\nArea do retangulo: " + this.calcularAreaDoRetangulo()
             + "\nPerimetro do retangulo: " + this.calcularPerimetroDoRetangulo();
    }
}