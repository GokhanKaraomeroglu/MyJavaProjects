
import java.util.Scanner;

// Değişken Değeri Değiştirme

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Degistirilmeden Önce \n Sayi 1: " + sayi1 + " Sayi 2: "+ sayi2);
        
        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        
        System.out.println("Degistirildikten Sonra \n Sayi 1: " + sayi1 + " Sayi 2: "+ sayi2);
    }
}
