
import java.util.Scanner;

// Hipotenus Bulma

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("Birinci Dik Kenari Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci Dik Kenari Giriniz: ");
        int sayi2 = scanner.nextInt();
        
        
        double hipo = Math.sqrt (sayi1 * sayi1 + sayi2 * sayi2);
        
        
        System.out.println("Hipotenüs: " + hipo );
        
    }
}
