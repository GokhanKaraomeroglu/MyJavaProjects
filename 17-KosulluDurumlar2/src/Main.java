
import java.util.Scanner;


// Koşullu Durumlar 2
/* 
    if (koşul) {
        Koşul sağlanınca (true) bu blok çalışır.
    }
        else if (Başka koşul){

        }
        else if (Başka koşul){

        }

            else {
               Bu blogun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
            }
        */
public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Lütfen kilonuzu giriniz: ");
      int kilo = scanner. nextInt();
      
        
      if (kilo <= 45) {
        System.out.println("Çok zayıfsınız...");
        
    }
      else if ((45 < kilo) && (kilo < 65) ) {
          System.out.println("İdeal kilodasınız...");
      
      } 
      else if ((65 < kilo) && (kilo < 90)) { 
          
          System.out.println("Zayıflamalısınız...");
      }
      
      else {
          {
              System.out.println("Çok şişmansınız...");
          }
      }  
        
        
    }
}
