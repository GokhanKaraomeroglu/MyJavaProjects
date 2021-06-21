
import java.util.Scanner;


// SwitchCase
/* 
    switch (op) {
        case durum1:
            işlemler
            break

        case durum2:
            işlemler
            break

        default:
            işlemler
            break
    }
        */
 // caselerin içine küçük büyük vs yazılamıyor sadece tek sonuç ve 
 // ona göre yapılacak işlem oluyor.

public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Lütfen 1 ve 4 arasında bir sayı giriniz: ");
      int sayi = scanner. nextInt();
      
        
      switch (sayi) {
          case 1: 
              System.out.println("1 yazdınız...");
              break;
         case 2:
              System.out.println("2 yazdınız...");
              break;
        case 3:
              System.out.println("3 yazdınız...");
              break;
        case 4:
              System.out.println("4 yazdınız...");
              break;
        default:
            System.out.println("Uygun sayı giriniz...");
            break;
    }
    
    }
}
