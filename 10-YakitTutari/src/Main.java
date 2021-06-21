
import java.util.Scanner;

//Yakıt Tutarı

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("100 km Harcanan Yakıt Miktarını Giriniz: ");
        double yakit = scanner.nextDouble();
        System.out.print("Kilometre Giriniz: ");
        int yol = scanner.nextInt();
        double fiyat = 6.35;
        double tutar = yakit * yol * fiyat/100;
        
        System.out.println("Bilgilendirme; ");
        System.out.println("Yakit Fiyatı " + fiyat + " Tl dir. ");
        System.out.println("Ödenecek Tutar: " + tutar + " Tl dir. ");
        
        
    }
}
