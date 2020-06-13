public class Laranja extends Fruta {

    @Override
    public String comer() {
        return "sabor de laranja";
    }
    
    @Override
    public String retirarCasca() {
        return "Descascar com faca";
    }
    
    @Override
    public String toString() {
        return "\nSabor: " + this.comer()
             + "\nComo tirar a casca: " + this.retirarCasca();
    }
}
