import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo:");
        retangulo.setLargura(sc.nextDouble());
        retangulo.setAltura(sc.nextDouble());

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}
