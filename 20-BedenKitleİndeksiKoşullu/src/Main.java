
import java.util.Scanner;


// Beden Kitle İndeksi Koşullu Durumlar
  /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve 
        şu kurallara göre ekrana şu yazıları yazdırın.

            Beden Kitle İndeksi: Kilo / Boy(m) *  Boy(m)

            BKİ 18.5'un altındaysa -------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez

        */

public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
        
      System.out.print("Kilonuz? ");
        float kilo = scanner.nextFloat();
        System.out.print("Boyunuz? (m olarak örneğin 1.78) ");
        float boy = scanner.nextFloat();
        float index = kilo / (boy * boy);
        System.out.println("Beden Kitle Indeksiniz: " + kilo/(boy*boy));
       
        
      if (index < 18.5) {
          
          System.out.println("Zayıfsınız, kilo almalısınız...");
      }
          else if ((index >= 18.5) && (25 >= index)){
          
          System.out.println("Kilonuz normal... " );
                  }
          else if ((index > 25) && (30 >= index)){
          
          System.out.println("Fazla kilolusunuz, kilonuza dikkat ediniz... " );
                  }
          else{
              
              System.out.println("Obezsiniz, acilen tıbbi destek almalısınız...");
          }
    
    }
}
