public class Principal {
    
    public static void main(String args[]) {
        
        System.out.print("\f");
        
        Retangulo retangulo = new Retangulo();
        
        retangulo.setAltura(20);
        retangulo.setBase(2.5);

        System.out.println(retangulo);
        
        Quadrado quadrado = new Quadrado();
        
        quadrado.setLado(30);

        System.out.println(quadrado);

    }
}
