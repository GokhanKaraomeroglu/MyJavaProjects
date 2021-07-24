
import java.util.Scanner;

/*
        Faiz Hesaplama

        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        Faiz Oranı : %6 
        */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz. Faiz Oranı %6");
        
        int anapara,vade; // Buraya dikkat et iki intiger aynı satırda tanımlandı.
        
        System.out.print("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ? ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i =  1 ;  i<= vade ; i++) {
            
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ". yılın sonunda toplam para : " + (int)toplampara);
    
        }      
    }
}
