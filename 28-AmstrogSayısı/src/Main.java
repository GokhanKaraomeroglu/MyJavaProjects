import java.util.Scanner;

// Amstrong Sayısı


public class Main {
    
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için 
        şu şartı sağlaması gerekmektedir.
        
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        
        // System.out.print("Basamak Sayısı : ");
        // int basamak_sayisi = scanner.nextInt();
        // Yukarıdakii kısmı kullanıcıdan istemektense kendi bulacağı satırları yazdım...
        
        
        int basamak_sayisi=0;
        int basamak2 = sayi;
        
        do {
            int basamak1;
            basamak1 = basamak2 % 10;
            basamak2 /= 10;
           
            basamak_sayisi ++;
            
        }while(basamak2 > 0);
        
        int gecici_sayi = sayi;
        int toplam = 0;
       
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            // System.out.println("Toplam: "+ toplam);
            
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değildir...");
        }
       
    }
}
