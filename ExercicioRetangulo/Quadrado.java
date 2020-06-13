public class Quadrado implements FiguraGeometrica {
    
    private double lado;

    public Quadrado() {
    }
    
    public Quadrado(double lado) {
        setLado(lado);
    }
    
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea() {
        return lado * lado;
    }
    
    public double calcularPerimetro() {
        return lado * 4;
    }
    
    @Override
    public String toString() {
        return "\nQuadrado:"
             + "\nLado: " + this.getLado()
             + "\nArea do quadrado: " + this.calcularArea()
             + "\nPerimetro do quadrado: " + this.calcularPerimetro();
    }
    
}
