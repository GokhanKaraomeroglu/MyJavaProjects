
import java.util.Scanner;

// Beden Kitle Indeksi

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Kilonuz? ");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunu? (m olarak örneğin 1.78)");
        double boy = scanner.nextDouble();
        double index = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz: " + kilo/(boy*boy));
        System.out.println("BKI: " + index);
       */
       
        System.out.print("Kilonuz? ");
        float kilo = scanner.nextFloat();
        System.out.print("Boyunu? (m olarak örneğin 1.78) ");
        float boy = scanner.nextFloat();
        float index = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz: " + kilo/(boy*boy));
        System.out.println("BKI: " + index);
        
    }
}
