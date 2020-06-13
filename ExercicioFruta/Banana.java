public class Banana extends Fruta {

    @Override
    public String comer() {
        return "sabor de banana";
    }
    
    @Override
    public String retirarCasca() {
        return "Descascar com as mãos";
    }
    
    @Override
    public String toString() {
        return "\nSabor: " + this.comer()
             + "\nComo tirar a casca: " + this.retirarCasca();
    }
    
}
