public class Maca extends Fruta {

    @Override
    public String comer() {
        return "Sabor de maça";
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
