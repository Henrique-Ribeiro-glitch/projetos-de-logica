import java.util.Scanner;
public class Princpal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);

        Maca maca = new Maca();
        System.out.println("Digite a cor da maçã: ");
        maca.setCor(scanner.next());
        System.out.println(maca);
        
        Banana banana = new Banana();
        System.out.println("\nAgora digite a cor da banana: ");
        maca.setCor(scanner.next());
        System.out.println(banana);
        
        Laranja laranja = new Laranja();
        System.out.println("\nAgora digite da laranja: ");
        maca.setCor(scanner.next());
        System.out.println(laranja);

    }
}
