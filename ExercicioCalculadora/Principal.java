public class Principal {
    public static void main(String args[]) {

        System.out.print("\f");
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.setNumero1(12);
        calculadora.setNumero2(3);
        
        System.out.println(calculadora);

    }
}